package ex;
public class Vector {
	private double x, y;

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() { return x; }
	public double getY() { return y; }
	
	public String toString() {
		return "<" + x + "," + y + ">";
	}
	
	public void multByConstant(double c) {
		x *= c;
		y *= c;
	}
	
	public void addToMe(Vector other) {
		x += other.x;
		y += other.y;
	}

	public Vector add(Vector other) {
		return new Vector(x + other.x, y + other.y);
	}
}
