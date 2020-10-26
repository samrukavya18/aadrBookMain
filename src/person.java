package book.src;

public class person {

	  public String firstName;
	  public String lastName;
	  public String city;
	  public String state;
	  public int    zip;

}

public person(String firstName, String lastName, String city, String state, int zip) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.state = state;
	this.zip = zip;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	   this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	   this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(String zip) {
	   this.zip = zip;
}

public String toString() {
    return "person [name=" + this.fullname + ", Lastname=" + this.lastname + ", City="
            + this.city + ", state=" + this.state + ", zip=" + this.zip
            + ", phone=" + this.phone + "]";
}
}