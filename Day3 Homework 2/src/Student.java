
public class Student extends User{

	private Course[] registeredCourses;

	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course[] courses) {
		this.registeredCourses = courses;
	}
	
}
