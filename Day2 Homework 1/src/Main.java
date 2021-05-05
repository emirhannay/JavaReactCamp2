
public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�");
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�");

		User user1 = new User(1, "ay_emirhan@hotmail.com", 123456, "Emirhan Ay");
		User user2 = new User(2, "engindemirog@gmail.com", 1234567, "Engin Demiro�");

		Course[] courses = new Course[] { course1, course2, course3 };

		User[] users = new User[] { user1, user2 };

		for (Course coursess : courses) {

			System.out.println(coursess.name);

			System.out.println("--------------------------------------------------");

		}
		;

		for (User userss : users) {
			System.out.println(userss.name);
			System.out.println("--------------------------------------------------");
		}

		CourseManager courseManager = new CourseManager();

		courseManager.addToCourse(course3);
		courseManager.removeToCourse(course2);
		courseManager.addToCourse(course1);

		UserManager userManager = new UserManager();

		userManager.addUser(user2);
		userManager.removeUser(user1);
	}

}
