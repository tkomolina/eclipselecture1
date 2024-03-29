//Final and static variables
 
public class Rules {

	private final String ruleName;
	String description;
	private static String country = "Latvia";
	private static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;
	static int totalRuleAmount;
	
	public Rules(String ruleName){
		this(ruleName, null); //we reuse the second constructor. In place null we can set some default descr. "Default descr"
		
	}
		
	public Rules(String ruleName, String description){
		this.ruleName=ruleName;
		System.out.println("The rule " + ruleName);
		totalRuleAmount++;		
	}
	
	
	public static void main(String[] args) {
		
		Rules rule1 = new Rules("Parking");
		Rules rule2 = new Rules("ParkingII", "Parking on the brigde is prohibited" + MAX_SPEED_OUTSIDE_CITY);
		
		System.out.println(Rules.totalRuleAmount);

	}

}
