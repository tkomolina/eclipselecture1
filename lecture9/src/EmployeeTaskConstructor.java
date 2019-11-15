

class Employee {
	private String name;
	private String work;
	private int salary;
	private int totalMoney;
	private boolean leftJob = false;

	
	public Employee(String name, String work, int salary) {
		this.name = name;
		this.work = work;
		this.salary = salary;
	}
	public Employee(String name, String work) {
		this.name = name;
		this.work = work;
		//this.salary = salary;
	}
	
	public boolean leftJob(){
		return leftJob;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getWork() {
		return work;
	}
	public void setTotalMoney() {
		this.totalMoney = totalMoney;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	void gotNewJob(String work, int salary){
		this.work = work;
		this.salary = salary;
		if (!this.leftJob){
			this.totalMoney = totalMoney + salary;
			System.out.println("Worker " + name + " got new job " + work + " recieved salary " + salary + ".Total has money: "+totalMoney);
		}	
	}
	
	/*void recieveSalary(int salary) {
		if (!this.leftJob){
			this.totalMoney = totalMoney + salary;
			System.out.println("Worker " + name +  " recieved salary " + salary);
			//System.out.println("Worker " + name +  " recieved salary " + salary + " total recieved " + totalMoney); 
		}else{
			this.salary = 0;
	}
		}*/
	
	void WorkerleftJob(){
		this.salary = 0;
		System.out.println("Employee has left a job, he/she can't get salary");
		this.leftJob = true;
	}
		
	public String printStatus() {
		this.totalMoney = totalMoney + salary;
		return "Worker " + this.name + " total recieved " + this.totalMoney;
	
	}
}
public class EmployeeTaskConstructor {
	public static void main(String[] args) {
		
		Employee worker1 = new Employee("John", "Dzintars", 50);
		System.out.println(worker1.printStatus());
		worker1.gotNewJob("Gan bei" ,150);
		worker1.gotNewJob("Accenture",45);
		worker1.gotNewJob("Swedbank",120);
		System.out.println(worker1.printStatus());
		worker1.WorkerleftJob();
		worker1.gotNewJob("Decta",225	);
		
	}
}