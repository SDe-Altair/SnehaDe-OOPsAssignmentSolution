package GL;

public class Department {

	private String name;
	private String todaysWork;
	private String deadline;
	private String isTodayHoliday;

	public Department(String name, String todaysWork, String deadline, String isTodayHoliday) {
		this.name = name;
		this.todaysWork = todaysWork;
		this.deadline = deadline;
		this.isTodayHoliday = isTodayHoliday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getIsTodayHoliday() {
		return isTodayHoliday;
	}

	public void setIsTodayHoliday(String isTodayHoliday) {
		this.isTodayHoliday = isTodayHoliday;
	}
}

