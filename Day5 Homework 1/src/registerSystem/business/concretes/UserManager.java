package registerSystem.business.concretes;

import registerSystem.business.abstracts.RegisterValidationService;
import registerSystem.business.abstracts.UserService;
import registerSystem.business.abstracts.UserValidationService;
import registerSystem.core.AuthSystemService;
import registerSystem.dataaccess.abstracts.UserDao;
import registerSystem.entitites.concretes.User;

public class UserManager implements UserService {
	private UserDao _userDao;
	private UserValidationService _validationService;
	RegisterValidationService _registerValidation;

	public UserManager(UserDao userDao, UserValidationService validationService,RegisterValidationService registerValidation) {
		super();
		this._userDao = userDao;
		this._validationService = validationService;
		this._registerValidation = registerValidation;
	}

	@Override
	public void add(User user) {
		if (_validationService.validate(user) == true) {
			_userDao.add(user);

		} else {
			System.out.println("Verification failed.");
		}
	}

	@Override
	public void login(String email, String password) {
		boolean isValidTrue = false;

		for (User temporaryUser : _userDao.getAll()) {
			if (email == temporaryUser.get_eMail() && password == temporaryUser.getPassword()) {
				isValidTrue = true;

			}

		}

		if (isValidTrue == true) {
			System.out.println("Login successful \n Welcome!");
		} else {
			System.out.println("Login failed");
		}

	}

	@Override
	public void register(User user) {
		boolean isUserClick = true;
		boolean checkEmailSingularity = true;

		for (User temporaryUser : _userDao.getAll()) {
			if (user.get_eMail() == temporaryUser.get_eMail()) {
				checkEmailSingularity = false;
			}
		}
		if (checkEmailSingularity == true && _validationService.validate(user) == true) {
			_registerValidation.send();
			if (isUserClick == true) {
				_userDao.add(user);
				System.out.println(user.getFirstName() + " Added.");
			}
			else {
				System.out.println("Doðrulama baþarýsýz.");
			}
		}
		else {
			System.out.println("Register failed.");
		}
	}

}
