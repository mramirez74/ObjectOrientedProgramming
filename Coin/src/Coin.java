
public class Coin {

	private String sideUp;
	
	Coin(){
		toss();
	}
	
	void toss(){
		double probability = Math.random();
		
		if (probability > 0.4)
			sideUp = "heads";
		else
			sideUp = "tails";
	}
	
	String getsideUp(){
		return sideUp;
	}
}
