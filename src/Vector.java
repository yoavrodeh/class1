public class Vector {
	private double x, y;

	public Vector(double x1, double y1) {
		x = x1 < 0 ? 0 : x1;
		y = y1 < 0 ? 0 : y1;
	}

	public double getX() { return x; }
	public double getY() { return y; }
	public void setX(double x1) { x = x1 < 0 ? 0 : x1; }
	public void setY(double y1) { y = y1 < 0 ? 0 : y1; }
	
	public String toString() {
		return "<" + x + "," + y + ">";
	}
	
	public double distFrom0() {
		return Math.sqrt(x * x + y * y);
	}

	public double distFromOther(Vector other) {
		return Math.sqrt(Math.pow(x - other.x, 2) + 
				Math.pow(y - other.y, 2));
	}

	public void addToMe(Vector other) {
		x += other.x;
		y += other.y;
	}

	public Vector add(Vector other) {
		return new Vector(x + other.x, y + other.y);
	}
}
