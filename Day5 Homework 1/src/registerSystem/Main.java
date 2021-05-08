package registerSystem;

import java.util.ArrayList;

import registerSystem.GoogleManager.GoogleAuthSystemManager;
import registerSystem.business.concretes.EmailRegisterValidation;
import registerSystem.business.concretes.GoogleUserManager;
import registerSystem.business.concretes.SmsRegisterValidation;
import registerSystem.business.concretes.UserManager;
import registerSystem.business.concretes.UserValidationManager;
import registerSystem.core.GoogleAuthSystemManagerAdapter;
import registerSystem.dataaccess.abstracts.UserDao;
import registerSystem.dataaccess.concretes.InMemoryUserDao;
import registerSystem.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserDao dao = new InMemoryUserDao();
		UserManager manager = new UserManager(dao, new UserValidationManager(), new SmsRegisterValidation());
		User user = new User(1,"Emirhan","Ay","22032001","ay_emirhan@hotmail.com");
		GoogleUserManager googleUserManager = new GoogleUserManager(new GoogleAuthSystemManagerAdapter());
		googleUserManager.login();
		
		
		
		
		
		
		manager.register(new User(5,"Kývanç","Çaktýrma","20090658","kivanc@gmail.com"));
		manager.register(new User(6,"Emocan","Ay","203290","emocan@hotmail.com"));
		
		
	
		
	
		
		
		

	}

}
