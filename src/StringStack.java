public class StringStack {	
	private String[] arr;
	int current = 0;
	
	public StringStack(int size) {
		arr = new String[size];
	}
	
	public boolean isEmpty() {
		return current == 0;
	}
	
	public void push(String item) {
		if (current < arr.length)
			arr[current++] = item;
	}
	
	public String pop() {
		if (current == 0)
			return null; 
		else 
			return arr[--current];
	}
}
