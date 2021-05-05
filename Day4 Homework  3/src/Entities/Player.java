package Entities;

import java.time.LocalDate;

public class Player extends User {
	private String _firstName;
	private String _lastName;
	private String _identityNumber;
	private LocalDate _dateOfBirth;

	public Player(int id, String firstName, String lastName, String identityNumber, LocalDate dateOfBirth) {
		super(id);
		_firstName = firstName;
		_lastName = lastName;
		_identityNumber = identityNumber;
		_dateOfBirth = dateOfBirth;
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

	public String getIdentityNumber() {
		return _identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this._identityNumber = identityNumber;
	}

	public LocalDate getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this._dateOfBirth = dateOfBirth;
	}

}
