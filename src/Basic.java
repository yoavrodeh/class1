public class Basic {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		int j = 0;
		while (j < 10) {
			System.out.print(j);
			if (j != 9)
				System.out.print(",");
			j++;
		}
		System.out.println();
	}
}
