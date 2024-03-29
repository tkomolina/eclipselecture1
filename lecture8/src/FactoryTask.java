import java.util.Scanner;

/*Create a class Factory which has fields: * name, location, workerAmount

 has methods:
 * hireNewWorker("Engineer"), it should increase workerAmount by 1 and print out into console information  
 * how many workers there are
 * fireWorker("Plumber") it should decrease workerAmount by 1 and print out into console information 
 *  how many workers there are
 * fireAll()  it should set workerAmount = 0
 * bankrupt() it should call fireAll(),  inform user about current operation and prohibiting 
 * further operation of hire new workers,
 * think about storing some state of factory (edited) */

class Factory {
	private String name;
	private String location;
	private int workerAmount;
	private boolean isBankrupt = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWorkerAmount() {
		return workerAmount;
	}

	public boolean isBankrupt() {
		return isBankrupt;
	}

	void hireNewWorker(String employeePosition) {
		if (!this.isBankrupt) {
			this.workerAmount++;
			System.out.println("Hired new employee " + employeePosition
					+ " now there are " + this.workerAmount + " workers");
		} else {
			System.out.println(this.name
					+ " factory  is bankrupt. You cannot hire new workers");
		}
	}

	void fireWorker() {
		if (workerAmount > 0) {
			this.workerAmount--;
			System.out.println("There are now " + this.workerAmount
					+ " workers working there.");
		} else {
			System.out.println("There are no workers at the " + this.name
					+ " at this time. There is no one to fire.");
		}
	}

	void fireAll() {
		this.workerAmount = 0;
		System.out.println("There are no workers working there.");
	}

	void bankrupt() {
		this.fireAll();
		System.out.println(this.name + " is bankrupt.");
		this.isBankrupt = true;
	}

	void printStatus() {
		System.out.println("The name of the factory is " + this.name
				+ "located in " + this.location + " has " + this.workerAmount
				+ " workers");
	}
}

public class FactoryTask {
	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.setName("Milk");
		factory.setLocation("Riga");
		factory.printStatus();
		factory.hireNewWorker("Director");
		// factory.printStatus();
		factory.hireNewWorker("Manager");
		// factory.printStatus();
		factory.fireWorker();
		factory.printStatus();
		factory.fireAll();
		factory.printStatus();
		factory.hireNewWorker("Assistant");
		factory.hireNewWorker("Truck driver");
		factory.printStatus();
		factory.bankrupt();
		factory.hireNewWorker("PLumber");
		// factory.fireWorker();
	}
}
