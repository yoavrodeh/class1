public class Arrays {

	public static void main(String[] args) {
		double[] a = new double[4];
		int x = 7;
		double[] a2 = new double[x];
		char[] a3 = {'a', 'c', 'l', ' '};
		
		a[0] = 1.3;
		a[1] = 3.2;
		a[3] = -3.1;
		for (int i=0; i<a.length; i++)  
			System.out.print(a[i] + " ");
		System.out.println();
		
		for (double y : a)
			System.out.print(y + " ");
		System.out.println();
				
		System.out.println(a); 
		// Gives something like: [D@15db9742
		double[] b = a;
		b[1] = 0;
		System.out.println(a[1]); // What will it print?
		
		int[][] c = new int[3][];
		for (int i=0; i<c.length; i++) {
			c[i] = new int[2];
		}
		boolean[][] d = new boolean[4][3]; 
		int[][] e = {{1,2,3},{4,5,6},{7,8,9}};
		
		d[0][0] = true;
		d[0][1] = false;
	}
}
