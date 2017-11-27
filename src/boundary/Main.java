package boundary;
import entity.TextGraph;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int time=0;
		System.out.println("show—展示有向图"
		+'\n'+"br+word1+word2—查询桥接词"+'\n'
				+"getnew—生成新文本"+'\n'
		+"shortest+word1—单源最短路径"+'\n'
				+"shortest+word1+word2—两点间最短路径"
		+'\n'+"random—随机游走");
		do{
		//展示有向图
			TextGraph g = new TextGraph();
			
			String commandLine;
			Scanner cmd=new Scanner(System.in);
			commandLine=cmd.nextLine();
			String[] cmd_array = new String[3] ;
			cmd_array=commandLine.split(" ");
			String word1,word2 = null,re;
			Scanner sc = new Scanner(System.in);
		if(cmd_array[0].equals("show"))
		{
			System.out.print('\n');
			ShowDirectedGraph show = new ShowDirectedGraph(g);
			show.showDirectedGraph();
		}
		else if(cmd_array[0].equals("br"))
		{
		//查询桥连接
		int a=0;
		for(int k=0;k<cmd_array.length;k++)
		{
			if(null!=cmd_array[k]) a++;
		}
		if(a!=3)
			System.out.println("非法输入！");
		else
		{
			
			word1=cmd_array[1];
			word2=cmd_array[2];
			QueryBridgeWords br = new QueryBridgeWords(g);
			re = br.queryBridgeWords(word1, word2);
			//re= t.queryBridgeWords(word1, word2);
			System.out.println(re);
//			if((g.Isingraph(word1) == 0)&&(g.Isingraph(word2)==0))
//			{
//				System.out.println("No “"+word1+"” and “"+word2+"” in the graph!");
//			}
//			else if(g.Isingraph(word1) == 0)
//			{
//				System.out.println("No “"+word1+"” in the graph!");
//			}
//			else if(g.Isingraph(word2) == 0)
//			{
//				System.out.println("No “"+word2+"” in the graph!");
//			}
//			else
//			{
//				re= t.queryBridgeWords(word1, word2);
//				if(re.length() == 0)
//					System.out.println("No bridge words from “"+word1+"” to “"+word2+"!");
//				else
//				System.out.println("The bridge words from  “"+word1+"” to “"+word2+"” is:"+re);
//			}
				
		}
		}
		else if(cmd_array[0].equals("getnew"))
		{
		//根据bridge生成新文本
		int a=0;
		for(int k = 0; k < cmd_array.length; k++)
		{
			if(null != cmd_array[k]) a++;
		}
		if(a!=1)
			System.out.println("非法输入！");
		else{
		System.out.println("输入新文本");
		String inputText;
		String outputText;
		inputText = sc.nextLine();
		System.out.println("输出插入桥连接词文本");
		QenerateNewText getnew = new QenerateNewText(g);
		outputText = getnew.generateNewText(inputText);
        //outputText = t.generateNewText(inputText);
		System.out.println(outputText);
		}
		}
		//shortest
		else if(cmd_array[0].equals("shortest"))
		{
			
			int a=0;
			String min;
			CalcShortestPath shor = new CalcShortestPath(g);
			for(int k = 0; k < cmd_array.length; k++)
			{
				if(null != cmd_array[k]) a++;
			}
			if(a==2)
			{
	            	   word1=cmd_array[1];
	            	   word2="";
				min=shor.calcShortestPath(word1,word2);
				System.out.println(min);
			}
			else if(a==3)
			{
				word1=cmd_array[1];
				word2=cmd_array[2];
				min=shor.calcShortestPath(word1,word2);
				System.out.println(min);
			}
			else
				System.out.println("非法输入！");
			}
		
		//随机游走
		else if(cmd_array[0].equals("random"))
			{
				//System.out.println("随机游走：");
				int a=0;
				RandomWalk random = new RandomWalk(g);
				for(int k = 0; k < cmd_array.length; k++)
				{
					if(null != cmd_array[k]) a++;
				}
				if(a!=1)
				{
					System.out.println("非法输入！");
				}
				else 
				{
					String randompath;
					randompath=random.randomwalk();
					
					System.out.println(randompath);
				}
			}
			else if(cmd_array[0].equals("quit"))
				System.exit(0);
			else
				System.out.println("非法输入！");
		time++;
		
	}while(time!=50);
	}

	}


