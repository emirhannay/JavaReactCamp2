package Entities;

public class Campaign {
	int _id;
	String _name;
	int _discountRate;

	public Campaign(int _id, String _name, int _discountRate) {
		
		this._id = _id;
		this._name = _name;
		this._discountRate = _discountRate;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_discountRate() {
		return _discountRate;
	}

	public void set_discountRate(int _discountRate) {
		this._discountRate = _discountRate;
	}
}
