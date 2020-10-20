public class Vector2 {
	private double x, y;

	public Vector2(double x, double y) {
		this.x = x < 0 ? 0 : x;
		this.y = y < 0 ? 0 : y;
	}

	public Vector2() {
		this(0,0);
	}
}
