package control;
import entity.TextGraph;
import entity.PicGraph;
public class CgenerateNewText {

	private TextGraph g;
	public CgenerateNewText(TextGraph g)
	{
		this.g= g;
	}
	public String generateNewText(String inputText)//根据bridge生成新文本
	{
		PicGraph p = new PicGraph(g);
		return p.drawNewText(inputText);
	}
}
