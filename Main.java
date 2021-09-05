package GL;

public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment("Welcome to Admin Department",
				"Complete your documents submission","Complete by EOD", "Today is not a Holiday");

		HrDepartment hrDepartment = new HrDepartment("Welcome to HR Department",
				"Fill today’s timesheet and mark your attendance","Complete by EOD", "Today is not a Holiday");

		TechDepartment techDepartment = new TechDepartment("Welcome to Tech Department",
				"Complete coding of Module 1","Complete by EOD", "Today is not a Holiday", "core Java");

		adminDepartment.printValues();
		hrDepartment.printValues();
		techDepartment.printValues();

	}
}