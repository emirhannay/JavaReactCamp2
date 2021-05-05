package Default;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.set_dateOfBirth(LocalDate.of(1985,1 ,6));
		customer.set_firstName("Engin");
		customer.set_lastName("Demiroð");
		customer.set_nationalityId("28861499108");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(customer);
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer);
		

	}

} 
