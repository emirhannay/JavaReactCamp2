package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.get_id() + " : eklenmi�tir.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.get_id() + " : g�ncellenmi�tir.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.get_id() + " : silinmi�tir.");

	}
}
