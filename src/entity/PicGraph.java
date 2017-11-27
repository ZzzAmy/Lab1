package entity;
import control.CqueryBridgeWords;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

public class PicGraph {

	private TextGraph g;
	public PicGraph(TextGraph g) {
		this.g= g;
	}
	public void drawPic()
	{
		int n ;
		n = g.Getn();
		try
		{
			String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\dot.dot";
			FileOutputStream fos = new FileOutputStream(gvout);
			OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
			fw.write("digraph G {");
			fw.write("\r\n");
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(g.Getedge(i, j) != 100000)
					{
						fw.write('\t');
						fw.write(g.Getstr(i));
						fw.write(" -> ");
						fw.write(g.Getstr(j));
						fw.write(";\r\n");						
						//System.out.println(i+"，"+j+"："+g.Getstr(i)+"->"+g.Getstr(j));
					}
				}
				
			}
			fw.write("}");
			fw.close();
			 String path = "dot Kdot -Tpng dot.dot -o dot.png";
		        try {
		        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void drawQueryBr(String word1,String word2)
	{
		int n;
		n = g.Getn();
		int x=g.Getpos(word1);
		int y=g.Getpos(word2);
		int[] pos = new int[100];
		int k=-1;
		if(x!= -1 && y!= -1)
		{
			for(int i=0;i<=n;i++)
			{
				if(((g.Getedge(x, i)!=100000)&&(g.Getedge(i, y)!=100000))||(g.Getedge(y,i)!=100000)&&(g.Getedge(i,x)!=100000))
				{
					k++;
					pos[k]=i;
				}
			}
			try
			{
				String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\bridge.dot";
				FileOutputStream fos = new FileOutputStream(gvout);
				OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
				fw.write("digraph G {");
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						if((g.Getedge(i, j) != 100000))
						{
							fw.write('\t');
							fw.write(g.Getstr(i));
							fw.write(" -> ");
							fw.write(g.Getstr(j));
							fw.write(";\r\n");					
							//System.out.println(i+"，"+j+"："+g.Getstr(i)+"->"+g.Getstr(j));
						}
					}
					
				}
				fw.write("\r\n");
				fw.write(g.Getstr(x));
				fw.write("[fillcolor=yellow,style=filled,Label=\"");
				fw.write(g.Getstr(x));
				fw.write("\"];");
				fw.write("\r\n");
				fw.write(g.Getstr(y));
				fw.write("[fillcolor=yellow,style=filled,Label=\"");
				fw.write(g.Getstr(y));
				fw.write("\"];");
				fw.write("\r\n");
				for(int i=0;i<=k;i++)
				{
					fw.write(g.Getstr(pos[i]));
					fw.write("[fillcolor=red,style=filled,Label=\"");
					fw.write(g.Getstr(pos[i]));
					fw.write("\"];");
					fw.write("\r\n");
				}
				fw.write("}");
				fw.close();
				 String path = "dot Kdot -Tpng bridge.dot -o bridge.png";
			        try {
			        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public String drawNewText(String inputText)
	{
		StringBuilder builder = new StringBuilder();
		try
		{
			String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\NewWord.dot";
			FileOutputStream fos = new FileOutputStream(gvout);
			OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
			fw.write("digraph G {");
			fw.write("\r\n");
			
			char ch_array[] = inputText.toCharArray();
			String str_array[] = new String[1000];
			String strr[] = new String[1000];
			String temp;
			char[] chararr = new char[30];
			int n,m,w;
			n=-1;
			m=-1;
			w=-1;
			for(int l=0;l<ch_array.length;l++)
			{
				if(((ch_array[l]>=65)&&(ch_array[l] <= 90))||((ch_array[l] >= 97)&&(ch_array[l] <= 122)))
	            {
	            		n++;
	        			chararr[n]=ch_array[l];
	        		}
	            	else if(!(((ch_array[l]>=65)&&(ch_array[l] <= 90))||((ch_array[l] >= 97)&&(ch_array[l] <= 122))))
	            	{
	            	    
	            		StringBuilder strbuilder = new StringBuilder();
	            		for(int i=0;i<=n;i++)
	            		{
	            			
	            			strbuilder.append(chararr[i]);
	            			chararr[i]='\u0000';
	            		}
	            	
	        			m++;
	            		str_array[m]=strbuilder.toString();
	            		//System.out.println(m+":"+str_array[m]);
	            		n=-1;
	            	    
	            	}
			}
			
			if(n!=-1)
			{
				StringBuilder strbuilder = new StringBuilder();
        		for(int i=0;i<=n;i++)
        		{
        			
        			strbuilder.append(chararr[i]);
        			chararr[i]='\u0000';
        		}
        	
    			m++;
        		str_array[m]=strbuilder.toString();
			}
			
			 for(int h=0;h<=m;h++)
	            {
	            	
		            	if(str_array[h].length() != 0)
		        		{ 
		            		w++;
		            		str_array[h]=str_array[h].toLowerCase();//修改为小写单词
		            		strr[w] = str_array[h];

		        		}
	            	
	            }
			for(int i=0;i<w;i++)
			{
				builder.append(strr[i]);
				builder.append(' ');
				CqueryBridgeWords Cbr = new CqueryBridgeWords(g);
				temp = Cbr.queryBridgeWords(strr[i],strr[i+1]);
				String array2[]=temp.split(" ");
				//System.out.println(i+strr[i]+"->"+strr[i+1]);
//				for(int k=0;k<array2.length;k++)
//				{
//					System.out.println(k+":="+array2[k]);
//				}
				if(temp.length()!=0)
				{
					Random ran = new Random();
					int q=ran.nextInt(array2.length);
					builder.append(array2[q]);
					builder.append(" ");
					fw.write("\r\n");
					fw.write(array2[q]);
					fw.write("[fillcolor=yellow,style=filled,Label=\"");
					fw.write(array2[q]);
					fw.write("\"];");
					
					fw.write('\t');
					fw.write(strr[i]);
					fw.write(" -> ");
					fw.write(array2[q]);
					fw.write(";\r\n");
					
					fw.write('\t');
					fw.write(array2[q]);
					fw.write(" -> ");
					fw.write(strr[i+1]);
					fw.write(";\r\n");
				}
				else
				{

					fw.write('\t');
					fw.write(strr[i]);
					fw.write(" -> ");
					fw.write(strr[i+1]);
					fw.write(";\r\n");
				}
							
			}
			builder.append(strr[w]);
			fw.write("}");
			fw.close();
			 String path = "dot Kdot -Tpng NewWord.dot -o NewWord.png";
		        try {
		        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return builder.toString();
	}
	public void drawShortestPath(String str,int flag)
	{
		int n=g.Getn();

		if(flag == 1)
		{
			try
			{
				String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\shortest2.dot";
				FileOutputStream fos = new FileOutputStream(gvout);
				OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
				fw.write("digraph G {");
				fw.write("\r\n");
				
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						if(g.Getedge(i, j) != 100000)
						{
							fw.write('\t');
							fw.write(g.Getstr(i));
							fw.write(" -> ");
							fw.write(g.Getstr(j));
							fw.write(";\r\n");						
							//System.out.println(i+"，"+j+"："+g.Getstr(i)+"->"+g.Getstr(j));
						}
					}
					
				}
			
			String str_array[] = str.split("->");
			for(int i=0;i<str_array.length;i++)
			{
				
				fw.write("\r\n");
				fw.write(str_array[i]);
				fw.write("[fillcolor=red,style=filled,Label=\"");
				fw.write(str_array[i]);
				fw.write("\"];");
				fw.write("\r\n");
				
			}
			
			for(int i=0;i<str_array.length-1;i++)
			{
				
				fw.write('\t');
				fw.write(str_array[i]);
				fw.write(" -> ");
				fw.write(str_array[i+1]);
				fw.write("[color = \"blue\"]");
				fw.write(";\r\n");
				
			}
			
			fw.write("}");
			fw.close();
			 String path = "dot Kdot -Tpng shortest2.dot -o shortest2.png";
		        try {
		        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		else
		{
			try
			{
				String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\shortest.dot";
				FileOutputStream fos = new FileOutputStream(gvout);
				OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
				fw.write("digraph G {");
				fw.write("\r\n");
				
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						if(g.Getedge(i, j) != 100000)
						{
							fw.write('\t');
							fw.write(g.Getstr(i));
							fw.write(" -> ");
							fw.write(g.Getstr(j));
							fw.write("[color = \"blue\"]");
							fw.write(";\r\n");						
							//System.out.println(i+"，"+j+"："+g.Getstr(i)+"->"+g.Getstr(j));
						}
					}
					
				}
			
				String str_array[] = str.split("\n");
				for(int i=0;i<str_array.length;i++)
				{
					String str_array1[] = str_array[i].split("->");
					for(int j=0;j<str_array1.length;j++)
					{
						fw.write("\r\n");
						fw.write(str_array1[j]);
						fw.write("[fillcolor=red,style=filled,Label=\"");
						fw.write(str_array1[j]);
						fw.write("\"];");
						fw.write("\r\n");
					}
				}
			
			
			fw.write("}");
			fw.close();
			 String path = "dot Kdot -Tpng shortest.dot -o shortest.png";
		        try {
		        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	public void drawRandomWalk(String ranstr)
	{
		int n=g.Getn();
		try
		{
			String ranarray[] = ranstr.split("->");
			for(int w = 0;w<ranarray.length;w++)
			{
				System.out.println(w+"="+ranarray[w]);
			}
			String gvout ="F:\\\\Java\\\\eclipse_workspace\\\\lab1\\\\random.dot";
			FileOutputStream fos = new FileOutputStream(gvout);
			OutputStreamWriter fw = new OutputStreamWriter(fos,"UTF-8");
			fw.write("digraph G {");
			fw.write("\r\n");
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if((g.Getedge(i, j) != 100000))
					{
						fw.write('\t');
						fw.write(g.Getstr(i));
						fw.write(" -> ");
						fw.write(g.Getstr(j));
						fw.write(";\r\n");						
						
						
					}
				}
				
			}
		if(ranarray.length-1 > 0)
		{
			for(int i=0;i<ranarray.length-1;i++)
			{
				fw.write('\t');
				fw.write(ranarray[i]);
				fw.write(" -> ");
				fw.write(ranarray[i+1]);
				fw.write("[color = \"blue\"]");
				fw.write(";\r\n");	

			}
		}
		
		fw.write("\r\n"); 
		fw.write(ranarray[0]);
		 fw.write("[fillcolor=yellow,style=filled,Label=\"");
		 fw.write(ranarray[0]);
		 fw.write("\"];");
		 fw.write("\r\n");
		 if(ranarray.length > 0)
		 {
			 for(int i=1;i<ranarray.length-1;i++)
				{
					fw.write("\r\n"); 
					fw.write(ranarray[i]);
					 fw.write("[fillcolor=red,style=filled,Label=\"");
					 fw.write(ranarray[i]);
					 fw.write("\"];");
					 fw.write("\r\n");
					
				}
		 }
		
		 fw.write("\r\n"); 
		 fw.write(ranarray[ranarray.length-1]);
		 fw.write("[fillcolor=yellow,style=filled,Label=\"");
		 fw.write(ranarray[ranarray.length-1]);
		 fw.write("\"];");
		 fw.write("\r\n");
		 fw.write("}");
		 fw.close();
		 String path = "dot Kdot -Tpng random.dot -o random.png";
	        try {
	        	Runtime.getRuntime().exec(path,null,new File("F:\\Java\\eclipse_workspace\\lab1"));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
