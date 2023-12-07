package package1;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HRManager mgr = new HRManager(70000);

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();

	}

}
