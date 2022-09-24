package demo;

public class HR extends Super {
	@Override
	String getdepartmentName() {
		return "Hr Department";
	}

	@Override
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String doActivity() {
		return "team Lunch";
	}
}
