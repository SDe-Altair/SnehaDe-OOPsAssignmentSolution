package GL;

public class HrDepartment extends Department {


	public HrDepartment(String name, String todaysWork, String deadline, String isTodayHoliday) {
		super(name, todaysWork, deadline, isTodayHoliday);
	}

	public String doActivity() {
		return "team Lunch";
	}


	public void printValues() {
		System.out.println(getName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getDeadline());
		System.out.println(getIsTodayHoliday());
		System.out.println("\n");
	}
}