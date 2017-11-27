package control;

import entity.TextGraph;
import entity.PicGraph;
public class CcalcShortestPath {

	private TextGraph g;
	private int t=0;
	public StringBuilder mp=new StringBuilder();
	public CcalcShortestPath(TextGraph g) {
		this.g= g;
	}
	public String calcShortestPath(String word1,String word2)//计算两个单词之间的最短路径
	{
		PicGraph p = new PicGraph(g);
		if(g.Isingraph(word1)==0)
			return "我们的图里不存在这样的单词";
		if((!word2.equals(""))&&g.Isingraph(word2)==0)
			return "我们的图里不存在这样的单词";
		int x=g.Getpos(word1);
		int y = 0,muti=0;
		if(!word2.equals(""))
			y=g.Getpos(word2);
		int n=g.Getn();
		int flag;
		int[][] leastDis = new int[n+2][n+2];
		int[][] minPath =new int[n+2][n+2];
		StringBuilder builder = new StringBuilder();
		String returnarr;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				leastDis[i][j]=g.Getedge(i,j);
				minPath[i][j]=0;
			}
		}
		for(int k=0;k<=n;k++)
		{
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					if(leastDis[i][k]+leastDis[k][j]<=leastDis[i][j])
					{
						leastDis[i][j]=leastDis[i][k]+leastDis[k][j];
						minPath[i][j]=k;
					}
				}
			}
		}

			if(!word2.equals(""))
			{
				String res=null;
				res=printminPath(x,y,minPath);
				String res1;
				if(t == 1 && g.Getedge(x,y)==100000)
				{
						return "不存在两个单词之间的路径";
				}
				else
				{
					builder.append(g.Getstr(x));
					builder.append(res);
				}
				String str1=builder.toString();
				int s0=minPath[x][y];
				for(int q=1;q<=n+1;q++)
				{
					if(q!=s0)
					{
						if(leastDis[x][q]+leastDis[q][y]==leastDis[x][y])
						{
							StringBuilder sb=new StringBuilder();
							mp.setLength(0);
							sb.append(g.Getstr(x));
							String res11=printminPath(x,q,minPath);
							mp.setLength(0);
							String res2=printminPath(q,y,minPath);
							sb.append(res11);
							sb.append(res2);
							String str2=sb.toString();
							if(!(str2.equals(str1)))
							{
								builder.append('|');
								builder.append(str2);
							}
						}
					}
				}
				flag = 1;
			}
			else//单元
			{
				String mutipath = null;
				for(int j=1;j<=g.n;j++)
				{
					if(g.isRepeat(j)!=1)
					{
						mutipath=printminPath(x,j,minPath);
						if(!(t==1 && g.Getedge(x,j)==100000))
						{
							builder.append(g.Getstr(x));
							builder.append(mutipath);
							builder.append('|');
							muti++;
							
						}
						mp.setLength(0);
						t=0;
					}
					
				}
				if(muti==0)
					return "从该点出发没有路";
				
				flag = 2;
			}
			
			returnarr = builder.toString();
			p.drawShortestPath(returnarr, flag);
		return returnarr;
	}
	String printminPath(int i,int j,int minPath[][])
	{
		if(minPath[i][j]==0)
		{
			mp.append("->");
			mp.append(g.Getstr(j));
			t=t+1;
		}
		else
		{
			int k=minPath[i][j];
			printminPath(i,k,minPath);
			printminPath(k,j,minPath);
		}
		return mp.toString();
	}
}
