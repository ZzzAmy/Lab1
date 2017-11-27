package boundary;
import control.CcalcShortestPath;
import entity.TextGraph;
public class CalcShortestPath {

	private TextGraph g;
	public CalcShortestPath(TextGraph g) {
		this.g= g;
		// TODO Auto-generated constructor stub
	}
	public String calcShortestPath(String word1,String word2)
	{
		CcalcShortestPath shortest = new CcalcShortestPath(g);
		return shortest.calcShortestPath(word1, word2);
		
	}

}
