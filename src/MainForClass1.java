public class MainForClass1 {
	public static void main(String[] arg) {
		Class1 c = new Class1();
		Class1 c2 = new Class1();
		c.x = 4;
		c.y = 2;
		System.out.println("X=" + c.x + ", Y=" + c.y);
		c2.x = c.x;
		c2.y = 10;
		System.out.println("X=" + c.x + ", Y=" + c.y);
	}
}
