package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.get_id() + " : eklenmiþtir.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.get_id() + " : güncellenmiþtir.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.get_id() + " : silinmiþtir.");

	}
}
