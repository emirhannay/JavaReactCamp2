
public class UserManager {
	public void login(User user) {

		System.out.println("Kullanýcý kodu : " + user.getKod() + " Baþarýyla giriþ yapýldý !");
	}

	public void logout(User user) {
		System.out.println("Kullanýcý kodu : " + user.getKod() + " Baþarýyla çýkýþ yapýldý !");
	}
}
