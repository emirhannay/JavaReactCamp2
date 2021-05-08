package registerSystem.business.concretes;

import registerSystem.business.abstracts.RegisterValidationService;

public class SmsRegisterValidation implements RegisterValidationService{

	@Override
	public void send() {
		System.out.println("Doðrulama smsi gönderildi.");
		
	}

}
