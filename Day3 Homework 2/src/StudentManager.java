
public class StudentManager extends UserManager{
		public void registerCourse (Course course) {
			System.out.println(course.getName() + " Kay�t olundu.");
		}
		public void leaveCourse (Course course) {
			System.out.println(course.getName() + " Kursla ili�kiniz kesilmi�tir.");
		}
}
