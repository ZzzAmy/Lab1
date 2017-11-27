package boundary;
import entity.TextGraph;

import java.util.Random;

import entity.PicGraph;
import control.CrandomWalk;

public class RandomWalk {

	private TextGraph g;
	public RandomWalk(TextGraph g) {
		this.g= g;
	}
	public String randomwalk()//Ëæ»úÓÎ×ß
	{
		CrandomWalk random = new CrandomWalk(g);
		return random.randomwalk();
	}
}
