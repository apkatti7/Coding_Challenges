package coding_challenge;

public class EncapsulationDemo {

	private String country = "India";
	private String nationalAnthem = "janaganmana";
	private String touristspot = "Hampi";

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}

	public String getTouristspot() {
		return touristspot;
	}

	public void setTouristspot(String touristspot) {
		this.touristspot = touristspot;
	}

	public static void main(String[] args) {
		EncapsulationDemo encapsule = new EncapsulationDemo();
		System.out.println("My country is :" + encapsule.getCountry());
	}
}
