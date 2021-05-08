package registerSystem.entitites.concretes;

import registerSystem.entitites.abstracts.Entity;

public class User implements Entity {
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _password;
	private String _eMail;
	
	
	public User(int id, String firstName, String lastName, String password, String eMail) {
		super();
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._password = password;
		this._eMail = eMail;
		
	}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		this._lastName = lastName;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		this._password = password;
	}
	public String get_eMail() {
		return _eMail;
	}
	public void set_eMail(String _eMail) {
		this._eMail = _eMail;
	}
	
}
