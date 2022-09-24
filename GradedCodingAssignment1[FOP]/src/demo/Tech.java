package demo;

public class Tech extends Super {
	@Override
	String getdepartmentName() {
		return "Tech Department";
	}

	@Override
	String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String getTechStackInformation() {
		return "Core Java";
	}
}
