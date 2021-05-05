
public class StudentManager extends UserManager{
		public void registerCourse (Course course) {
			System.out.println(course.getName() + " Kayıt olundu.");
		}
		public void leaveCourse (Course course) {
			System.out.println(course.getName() + " Kursla ilişkiniz kesilmiştir.");
		}
}
