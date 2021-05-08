package registerSystem.business.concretes;

import registerSystem.business.abstracts.UserService;
import registerSystem.core.AuthSystemService;
import registerSystem.entitites.concretes.User;

public class GoogleUserManager implements UserService{
	AuthSystemService _authManager;
	
	
	
	public GoogleUserManager(AuthSystemService authManager) {
		super();
		this._authManager = authManager;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(User user) {
		
		
	}

	@Override
	public void login(String email, String password) {
	
		
	}
	public void login() {
		_authManager.login();
	}

}
