package demo;

public class Main {
	public static void main(String[] args) {
		Admin admin = new Admin();
		HR hr = new HR();
		Tech tech = new Tech();

		System.out.println("Welcome to" + admin.getdepartmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		System.out.println("\nWelcome to" + hr.getdepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		System.out.println("\nWelcome to" + tech.getdepartmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
