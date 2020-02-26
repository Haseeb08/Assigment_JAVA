package assignment_7_Part5;

public class University {

	private String uniName;

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	
		class Department {
			
			private String deptName;
			public Department(String d) {
				deptName=d;
			}
			public String getDeptName() {
				return deptName;
			}
			
		}
}
