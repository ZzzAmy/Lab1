package boundary;

import control.CgenerateNewText;
import entity.TextGraph;

public class QenerateNewText {

	private TextGraph g;
	public QenerateNewText(TextGraph g) {
		this.g= g;
		
	}
	public String generateNewText(String inputText)//չʾ����ͼ
	{
		
		CgenerateNewText Cgetnew = new CgenerateNewText(g);
		return Cgetnew.generateNewText(inputText);
		
	}

}
