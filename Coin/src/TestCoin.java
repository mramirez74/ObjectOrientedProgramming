
public class TestCoin {

	public static void main(String[] args){
		
		Coin quarter = new Coin();
		
		for( int j = 0; j < 20; j++){
			
			quarter.toss();
			System.out.println(quarter.getsideUp());
			
		}
	}
}
