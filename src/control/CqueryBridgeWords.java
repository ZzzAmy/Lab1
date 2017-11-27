package control;
import entity.TextGraph;
import entity.PicGraph;
public class CqueryBridgeWords {

	private TextGraph g;
	public CqueryBridgeWords(TextGraph g) {
		this.g= g;
		
	}
	public String queryBridgeWords(String word1,String word2)//查询桥连接
	{
		StringBuilder res = new StringBuilder();
		int x=g.Getpos(word1);
		int y=g.Getpos(word2);
		int n=g.Getn();
		StringBuilder result = new StringBuilder();
		if(x!=-1)
		{
			if(y!=-1)
			{
				for(int i=0;i<=n;i++)
				{
					if(((g.Getedge(x, i)!=100000)&&(g.Getedge(i, y)!=100000))||(g.Getedge(y,i)!=100000)&&(g.Getedge(i,x)!=100000))
					{
						result.append(g.Getstr(i));
						result.append(' ');
					}
				}
				
				 if(result.toString().length() == 0)
				 {
					 res.append("No ");
					 res.append("bridge ");
					 res.append("words ");
					 res.append("from ");
					 res.append("“");
					 res.append(word1);
					 res.append("” to “");
					 res.append(word2);
					 res.append("” !");
					 //System.out.println("No bridge words from “"+word1+"” to “"+word2+"!");
				 }
				 else
				 {
					 res.append("The ");
					 res.append("bridge ");
					 res.append("words ");
					 res.append("from “");
					 res.append(word1);
					 res.append("” to “");
					 res.append(word2);
					 res.append("” is：");
					 res.append(result.toString());
					 //System.out.println("The bridge words from  “"+word1+"” to “"+word2+"” is:"+re)
				 }
			}
			else
			{
				res.append("No ");
				 res.append("“");
				 res.append(word2);
				 res.append("” in the graph!");
				//System.out.println("No “"+word2+"” in the graph!");
			}
		}
		else
		{
			if(y!=-1)
			{
				res.append("No ");
				 res.append("“");
				 res.append(word1);
				 res.append("” in the graph!");
				//System.out.println("No “"+word1+"” in the graph!");
			}
			else
			{
				res.append("No ");
				 res.append("“");
				 res.append(word1);
				 res.append("” and “");
				 res.append(word2);
				 res.append("” in the graph!");
				//System.out.println("No “"+word1+"” and “"+word2+"” in the graph!");
			}
		}
		PicGraph p = new PicGraph(g);
		p.drawQueryBr(word1, word2);
		
		return res.toString();
		
	}
}
