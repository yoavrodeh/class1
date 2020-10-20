public class MainForStringStack {
	public static void main(String[] args) {
		StringStack s = new StringStack(10);
		s.push("first");
		s.push("Second");
		s.push("Third");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}
}
