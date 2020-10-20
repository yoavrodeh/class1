public class MainForStudent {
	public static void main(String[] args) {
		Student s = new Student("Alfonso", 101);
		for (int i = 0; i < 10; i++)
			s.addCourse();
		System.out.println(s);
		s.removeCourse();
		System.out.println(s);
	}
	// Alfonso(101) : 10 courses
	// Alfonso(101) : 9 courses
}
