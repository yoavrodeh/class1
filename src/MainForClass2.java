public class MainForClass2 {
	public static void main(String[] arg) {
		Class2 a = new Class2();
		Class2 b = new Class2();
		a.x = 3;
		a.y = 5;
		b.x = 10;
		b.y = 12;
		
		while (a.x != b.x) {
			System.out.println(a.x + " + " + a.y + 
					" = " + a.sum()); 
			a.add(1);
		}
		
//		3 + 5 = 8
//		4 + 6 = 10
//		5 + 7 = 12
//		6 + 8 = 14
//		7 + 9 = 16
//		8 + 10 = 18
//		9 + 11 = 20

	}
}
