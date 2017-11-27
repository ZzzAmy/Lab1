package control;

import entity.PicGraph;
import entity.TextGraph;

public class CshowDirectedGraph {

	private TextGraph g;
	public CshowDirectedGraph(TextGraph g) {
		this.g= g;
		
	}
	public TextGraph GetGraph()
	{
		return g;
	}
	public void showDirectedGraph()//展示有向图
	{
		
		PicGraph p = new PicGraph(GetGraph());
		p.drawPic();
		
	}

}
