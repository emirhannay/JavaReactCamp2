package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.get_id() + " : eklenmiştir.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.get_id() + " : güncellenmiştir.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.get_id() + " : silinmiştir.");

	}
}
