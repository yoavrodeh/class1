public class MainForVector {
	public static void main(String[] args) {
		Vector v1 = new Vector(0.2, 1);
		System.out.println(v1.toString());

		Vector v2 = v1.add(v1);
		System.out.println(v2); // no toString()!

		v1.addToMe(v2);
		String str = "Vector is " + v1; // also here
		System.out.println(str);
		// Vector is <0.6000000000000001,3.0>
	}
}
