class Car{  //this is class
	
	String color; //these are states
	int speed;
	String name;
	
	// methods = class behaviours
	void drive(){ //this is method, () - arguments
		System.out.println("drive "+ this.name);
	}
	String driveOnLight(int speed, String light){
		return "Driving on " + light + " with speed " + this.speed;
		
	}
}


public class Repeating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car myCar = new Car(); // I create an object car / new - allocates the memory
		myCar.name = "MySuperCar"; // I refer to state
		myCar.drive(); //I refer to method drive
		myCar.speed = 100;
		String msg = myCar.driveOnLight(50, "red");
		System.out.println(msg);
		
		Car stolenCar = new Car(); // I create a car / new - allocates the memory
		stolenCar.name = "StolenCar";
		stolenCar.drive(); 
	

	}

}
