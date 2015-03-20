import java.util.Scanner;
public class TestFan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Fan color: ");
		String color = input.nextLine();
		
		System.out.print("Fan speed: ");
		int speed = input.nextInt();
		
		System.out.print("Fan radius: ");
		double radius = input.nextDouble();
		
		System.out.print("Fan status (True or False): ");
		boolean fanStatus = input.hasNext();
		
		Fan f = new Fan();
		
		f.speed = speed;
		f.radius = radius;
		f.fanStatus = fanStatus;
		f.color = color;
		
		System.out.println(f.toString());
	
	}

}
