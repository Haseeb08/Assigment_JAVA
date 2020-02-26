package assignment_7_Part5;

public class College extends University{

	class CSED extends Department{

		public CSED(String d) {
			super(d);
			// TODO Auto-generated constructor stub
		}
		
	}

	public static void main(String[] args) {
		University u = new University();
		
		University.Department cse= u.new Department("CSE");
		System.out.println(cse.getDeptName());
		
		College c=new College();
		CSED cs = c.new CSED("CSE");
		System.out.println(cs.getDeptName());
		
	}
}
