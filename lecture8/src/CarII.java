
public class CarII {
	
	private String brand;
	private int maxSpeed;
	private String color;
	
	public String getBrand(){
		return this.brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
		// Take care what you assign to what
				// brand = this.brand;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	

	/**
	Create a class Car
➢has fields: brand, maxSpeed, color.
➢has setter and getter for each field
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarII car = new CarII();
		/*car.setBrand ("Ferrari");
		String name = car.getBrand();
		System.out.println("My car name is " + name);*/
		
		car.setMaxSpeed (300);
		int speed = car.getMaxSpeed();
		System.out.println("The max speed  of my car " + speed);

	}

}
