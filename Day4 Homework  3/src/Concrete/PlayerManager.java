package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class PlayerManager extends BaseUserManager {
	UserCheckService _checkService;

	public PlayerManager(UserCheckService checkService) {
		this._checkService = checkService;
	}

	@Override
	public void add(User user) {
		if (_checkService.isValidUser() == true) {
			super.add(user);
		}
		else {
			System.out.println("Not Valid Person");
		}
	}

	@Override
	public void update(User user) {
		if (_checkService.isValidUser() == true) {
			super.update(user);
		}
		else {
			System.out.println("Not Valid Person");
		}
		
	}

	@Override
	public void delete(User user) {
		if (_checkService.isValidUser() == true) {
			super.delete(user);
		}
		else {
			System.out.println("Not Valid Person");
		}
		
	}

}
