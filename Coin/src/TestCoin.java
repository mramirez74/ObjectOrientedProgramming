//You should have a counter for heads, and one for tails and print out the results.
public class TestCoin {

	public static void main(String[] args){
		
		Coin quarter = new Coin();
		
		for( int j = 0; j < 20; j++){
			
			quarter.toss();
			System.out.println(quarter.getsideUp());
			
		}
	}
}
