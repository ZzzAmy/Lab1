package boundary;

import control.CqueryBridgeWords;
import entity.TextGraph;

public class QueryBridgeWords {

	private TextGraph g;
	public QueryBridgeWords(TextGraph g) {
		this.g= g;
		
	}
	public String queryBridgeWords(String word1,String word2)//≤È—Ø«≈Ω”¥ 
	{
		
		CqueryBridgeWords Cbr = new CqueryBridgeWords(g);
		return Cbr.queryBridgeWords(word1,word2);
		
	}

}
