
public class UserManager {
	public void login(User user) {

		System.out.println("Kullan�c� kodu : " + user.getKod() + " Ba�ar�yla giri� yap�ld� !");
	}

	public void logout(User user) {
		System.out.println("Kullan�c� kodu : " + user.getKod() + " Ba�ar�yla ��k�� yap�ld� !");
	}
}
