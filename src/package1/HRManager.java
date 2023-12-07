package package1;

public class HRManager extends Employee {
	
	public HRManager(int salary) {
		
        super(salary);
    }

    public void work() {
    	
        System.out.println("Managing employees");
    }

    public void addEmployee() {
        System.out.println("Adding new employee!");
    }

}
