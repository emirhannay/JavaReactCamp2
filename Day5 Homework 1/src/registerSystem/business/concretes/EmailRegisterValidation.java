package registerSystem.business.concretes;

import registerSystem.business.abstracts.RegisterValidationService;

public class EmailRegisterValidation implements RegisterValidationService {
	public void send() {
		System.out.println("Doðrulama e-postasý gönderildi.");
	}
}
