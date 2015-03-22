//OK. O. Aktunc

public class Fan {

	int speed;
	boolean fanStatus;
	double radius;
	String color;

	public Fan() {

	}

	public Fan(int sp, boolean fStatus, double rad, String col) {
		speed = sp;
		fanStatus = fStatus;
		radius = rad;
		color = col;
	}

	@Override
	public String toString() {
		return "Fan [speed = " + speed + ", fanStatus = " + fanStatus
				+ ", radius = " + radius + ", color = " + color + "]";
	}

}
