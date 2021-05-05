package Entities;

import java.time.LocalDate;


import Abstract.Entity;

public class Customer implements Entity {
	private int _id;
	private String _firstName;
	private String _lastName;
	private LocalDate _dateOfBirth;
	private String _nationalityId;
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_firstName() {
		return _firstName;
	}
	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}
	public String get_lastName() {
		return _lastName;
	}
	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}
	public LocalDate get_dateOfBirth() {
		return _dateOfBirth;
	}
	public void set_dateOfBirth(LocalDate _dateOfBirth) {
		this._dateOfBirth = _dateOfBirth;
	}
	public String get_nationalityId() {
		return _nationalityId;
	}
	public void set_nationalityId(String _nationalityId) {
		this._nationalityId = _nationalityId;
	}
	
} 
