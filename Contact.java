/**********************
 * CS320 project One *

 * by Justin Leger    *
 * February 15th 2025  *
 **********************/

package pkg;

public class Contact{
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/**********************
	 *  BEGIN CONSTRUCTOR *
	 **********************/
	public Contact() {}
	
	public Contact(String id, String firstName, String lastName,
			String phone, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(firstName == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	/*************************
	 *  BEGIN GETTER METHODS *
	 *************************/
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	/*************************
	 *  BEGIN SETTER METHODS *
	 *************************/
	public void setId(String id) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.id = id;
	}
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.phone = phone;
	}
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.address = address;
	}
}