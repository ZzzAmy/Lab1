package control;

import java.util.Random;

import entity.PicGraph;
import entity.TextGraph;

public class CrandomWalk {

	private TextGraph g;
	public CrandomWalk(TextGraph g) {
		this.g= g;
	}
	public String randomwalk()//Ëæ»úÓÎ×ß
	{
		StringBuilder randomPath=new StringBuilder();
		PicGraph pic = new PicGraph(g);
		int min=1;
		int s,p;
		int[][] putPath=new int[g.n+1][g.n+1];
		int[] calRep = new int[500];
		int cal=1;
		for(int w=1;w<g.n+1;w++)
		{
			if(g.isRepeat(w)!=1)
			{
				calRep[cal]=w;
				cal++;
			}
				
		}
		int max=cal;
		for(int i=0;i<=g.n;i++)
		{
			for(int j=0;j<g.n;j++)
				putPath[i][j]=0;
		}
		Random random=new Random();
		Random rep=new Random();
		String ranstr;
		s = random.nextInt(max-min)+ min;
		s=calRep[s];
		randomPath.append(g.Getstr(s));
		if(havePath(s)==0)
		{
			ranstr = randomPath.toString();
			pic.drawRandomWalk(ranstr);
			return ranstr;
		}
			
		do {
			p= rep.nextInt(max-min)+min;
			p=calRep[p];
		}while(g.Getedge(s, p)==100000);
			//p=calRep[p];
			do{
				putPath[s][p]=1;
				s=p;
				randomPath.append("->");
				randomPath.append(g.Getstr(p));
				if(havePath(p)==0)
				{
					ranstr = randomPath.toString();
					pic.drawRandomWalk(ranstr);
					return ranstr ;
				}
				do {
					p= rep.nextInt(max-min)+min;
					p=calRep[p];
				}while(g.Getedge(s, p)==100000);
			}while(putPath[s][p]==0);
			randomPath.append("->");
			randomPath.append(g.Getstr(p));
			ranstr = randomPath.toString();
			
			pic.drawRandomWalk(ranstr);
		return ranstr;	
		
	}
	public int havePath(int k)
	{
		int h=0;
		for(int i=0;i<=g.n;i++)
		{
			if(g.Getedge(k, i)!=100000)
				h++;
		}
		return h;
	}

}
