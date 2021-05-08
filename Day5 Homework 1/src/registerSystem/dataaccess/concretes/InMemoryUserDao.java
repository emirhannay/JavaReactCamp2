package registerSystem.dataaccess.concretes;

import java.util.ArrayList;

import registerSystem.dataaccess.abstracts.UserDao;
import registerSystem.entitites.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	ArrayList<User> _inMemoryDatabase;
	
	public InMemoryUserDao() {
		ArrayList<User> inMemoryDatabase = new ArrayList<User>();
		inMemoryDatabase.add(new User(2,"Yarkýn","Çaktýrma","17022001","ycaktirma@hotmail.com"));
		inMemoryDatabase.add(new User(3,"Engin","Demiroð","06011985","engindemirog@hotmail.com"));
		inMemoryDatabase.add(new User(1,"Emirhan","Ay","123456789","ay_emirhan@hotmail.com"));
		inMemoryDatabase.add(new User(4,"Aziz Ahmet","Biçer","23082001","azoo_55@hotmail.com"));
		this._inMemoryDatabase = inMemoryDatabase;
	}

	
	@Override
	public void add(User user) {
		_inMemoryDatabase.add(user);
		
	}
	
	public ArrayList<User> getAll() {
	
		
		return _inMemoryDatabase;
		
	}
}
