package studentManagementSystem;

public abstract class StudentPrinciples extends Institute {
	boolean isCleanShaved, isPerfectHairCut;
	
	public StudentPrinciples(String name, String location, String head, String landmark, long phoneNo, long mobileNo) {
		super(name, location, head, landmark, phoneNo, mobileNo);
	}

	
	public abstract String makeHairCut();
	
}
