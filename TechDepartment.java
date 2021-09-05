package GL;

public class TechDepartment extends Department {

	private String techStack;

	public String getTechStackInformation() {
		return techStack;
	}

	public TechDepartment(String name, String todaysWork, String deadline, String isTodayHoliday, String techStack) {
		super(name, todaysWork, deadline, isTodayHoliday);
		this.techStack = techStack;
	}

	public TechDepartment(String name, String todaysWork, String deadline, String isTodayHoliday) {
		super(name, todaysWork, deadline, isTodayHoliday);
	}

	public void printValues() {
		System.out.println(getName());
		System.out.println(getTodaysWork());
		System.out.println(getDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(getIsTodayHoliday());
		System.out.println("\n");
	}
}
