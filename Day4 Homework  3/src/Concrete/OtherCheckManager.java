package Concrete;

import Abstract.UserCheckService;

public class OtherCheckManager implements UserCheckService {

	@Override
	public boolean isValidUser() {
		return false;
	}

}
