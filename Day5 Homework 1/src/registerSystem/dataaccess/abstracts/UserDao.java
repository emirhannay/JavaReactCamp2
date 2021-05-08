package registerSystem.dataaccess.abstracts;

import java.util.ArrayList;

import registerSystem.entitites.concretes.User;

public interface UserDao {

	void add(User user);
	ArrayList<User >getAll();
}
