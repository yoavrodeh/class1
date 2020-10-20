public class StringExample {
	public static void main(String[] args) {
		String s = "abcd";

		System.out.println(s);
		String s2 = s + ":";
		String s3 = s2 + 37;
		for (int i = 0; i < s3.length(); i++)
			System.out.print(s3.charAt(i) + " ");
		System.out.println();
		// a b c d : 3 7

		String s4 = "abc";
		System.out.println(s.equals(s4)); // false
		System.out.println(s4.indexOf('c')); // 2
		System.out.println(s4.compareTo("abx")); // -21

		String line = "  a fox jumped   over the fence ";
		String[] a = line.split(" ");
		for (String word : a)
			System.out.print("[" + word + "]");
		System.out.println();
		// [][][a][fox][jumped][][][over][the][fence]
	}
}
