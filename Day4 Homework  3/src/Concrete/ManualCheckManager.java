package Concrete;

import Abstract.UserCheckService;

public class ManualCheckManager implements UserCheckService {
	
	@Override
	public boolean isValidUser() {
		return true;
	}
}
