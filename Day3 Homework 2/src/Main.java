
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Programlamaya Giriþ için Temel Kurs");
		course1.setOwner("Engin Demiroð");
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
		course2.setOwner("Engin Demiroð");
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		course3.setOwner("Engin Demiroð");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Engin");
		student.setLastName("Demiroð");
		student.setMail("ay_emirhan@hotmail.com");
		student.setPassword("123456789");
		student.setRegisteredCourses(new Course[] {course1,course2,course3} );
		
		Instructor instructor = new Instructor();
		instructor.setId(0);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setMail("engindemirog.gmail.com");
		instructor.setPassword("123456789");
		instructor.setMyCourses(new Course[] {course1,course2,course3});
		
		
		UserManager userManager = new UserManager();
		userManager.login(instructor);
		userManager.logout(student);
		
		
		
		
		
		
	}

}
