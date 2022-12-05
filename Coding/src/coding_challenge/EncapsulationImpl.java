package coding_challenge;

public class EncapsulationImpl {
	private int age;
	private boolean decision;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getDecision() {
		return decision;
	}

	public void setDecision(boolean result) {
		this.decision = result;
	}

	public static void main(String[] args) {
		EncapsulationImpl obj = new EncapsulationImpl();
		obj.setAge(70);

		if (obj.age <= 60) {
			obj.setDecision(true);

		} else {
			obj.setDecision(false);
		}
		System.out.println("the age of the candidate is " + obj.getAge());
		System.out.println("Driving license can be issued to the candidate: " + obj.getDecision());

	}

}
