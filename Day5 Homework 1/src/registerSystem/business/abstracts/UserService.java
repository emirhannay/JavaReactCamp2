package registerSystem.business.abstracts;

import registerSystem.entitites.concretes.User;

public interface UserService {
	void add(User user);
	void register(User user);
	void login(String email,String password);
}
