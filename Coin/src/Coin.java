//OK. O.Aktunc. Check comments down about toss method.
public class Coin {

	private String sideUp;
	
	Coin(){
		toss();
	}
	
	void toss(){
		double probability = Math.random();
		
		if (probability > 0.4) //This won't give you a fair result. 60% heads, 40% tails
			sideUp = "heads";
		else
			sideUp = "tails";
	}
	
	String getsideUp(){
		return sideUp;
	}
}
