
public class CarTask {
	
	/**
	 Create a method which has 2 arguments one of type boolean and
another double and this method should return String value as
concatenation of arguments
	 */
	
	boolean man;
	String color;
	double engine;
	
	String driver (boolean man, double engine){
		return "My car has " + engine + "l engine and driver is "  + man + " man";
		
	}

	
	public static void main(String[] args) {
		CarTask myCar = new CarTask();
		String msg = myCar.driver(true, 3.3);
		System.out.println(msg);

	}

}
