package boundary;
import entity.TextGraph;
import entity.PicGraph;
import control.CshowDirectedGraph;

public class ShowDirectedGraph {

	private TextGraph g;
	public ShowDirectedGraph(TextGraph g) {
		this.g= g;
		
	}
	public TextGraph GetGraph()
	{
		return g;
	}
	public void showDirectedGraph()//展示有向图
	{
		
		CshowDirectedGraph Cshow = new CshowDirectedGraph(GetGraph());
		Cshow.showDirectedGraph();
		
	}
}
