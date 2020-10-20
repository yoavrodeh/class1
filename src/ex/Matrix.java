package ex;

public class Matrix {
	private Vector v1, v2;

	public Matrix(Vector v1, Vector v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public void multByConstant(double c) {
		v1.multByConstant(c);
		v2.multByConstant(c);
	}

	public Matrix add(Matrix other) {
		return new Matrix(v1.add(other.v1), v2.add(other.v2));
	}
	
	public String toString() {
		return "[" + v1 + "," + v2 + "]";
	}

	public static void main(String[] args) {
		Matrix m = new Matrix(new Vector(1, 2), new Vector(3, 4));
		m.multByConstant(2);
		System.out.println(m);
		Matrix m2 = new Matrix(new Vector(10, 20), new Vector(30, 40));
		System.out.println(m.add(m2));
	}
}
