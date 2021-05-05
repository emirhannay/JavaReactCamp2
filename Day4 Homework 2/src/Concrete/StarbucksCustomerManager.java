package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this._checkService = checkService;
	}

	public void save(Customer customer) {

		if (_checkService.checkIfRealPerson(customer) == true) {
			System.out.println("Person verified.");
			System.out.println("Saved to db.");
		} else {
			System.out.println("Not a valid person");
		}
	};
}
 