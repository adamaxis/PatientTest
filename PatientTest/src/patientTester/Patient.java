package patientTester;

public class Patient {
	String firstName, lastName;
	double height, weight;
	
	
	public Patient(String firstName, String lastName, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}

	public Patient() {
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weightLbs) {
		this.weight = weightLbs;
	}
	
}
