package registerSystem.business.abstracts;

import registerSystem.entitites.concretes.User;

public interface UserValidationService {
	
	boolean validate(User user);

}
