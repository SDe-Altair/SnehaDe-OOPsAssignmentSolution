package GL;

public class AdminDepartment extends Department {


	public AdminDepartment(String name, String todaysWork, String deadline, String isTodayHoliday) {
		super(name, todaysWork, deadline, isTodayHoliday);
	}

	public void printValues() {
		System.out.println(getName());
		System.out.println(getTodaysWork());
		System.out.println(getDeadline());
		System.out.println(getIsTodayHoliday());
		System.out.println("\n");
	}
}