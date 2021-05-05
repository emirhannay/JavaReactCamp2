package Entities;

public class Product {
	private int _id;
	private String _name;
	private String _description;
	private double _sellingPrice;
	

	public Product(int _id, String _name, String _description, double _sellingPrice) {
		
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._sellingPrice = _sellingPrice;
		
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

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_sellingPrice() {
		return _sellingPrice;
	}

	public void set_sellingPrice(double _sellingPrice) {
		this._sellingPrice = _sellingPrice;
	}


}
