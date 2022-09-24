package demo;

public class Admin extends Super {
	@Override
	String getdepartmentName() {
		return "Admin Department";
	}

	@Override
	String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}
}
