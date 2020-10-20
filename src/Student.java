public class Student {
	private String name;
	private long id;
	private int numCourses;

	public Student(String name1, long id1) {
		name = name1;
		id = id1;
	}
	
	public String toString() {
		return name + "(" + id + ")" + " : " 
				+ numCourses + " courses";
	}
	public void addCourse() {
		numCourses++;
	}
	public void removeCourse() {
		numCourses--;
	}
}
