/*Create a class DrivingRule which has:

Instance variables: name and description
Static variable: country equals to Latvia
2 constant max speed in city/outside
Create few instance of DrivingRule
DrivingRule should counts total amount of rules which we have created*/

class 	DrivingRule{
	String ruleName;
	String description;
	static String country = "Latvia";
	static final int MAX_SPEED_IN_CITY = 50;
	static final int MAX_SPEED_OUTSIDE_CITY = 90;
	private static int totalRuleAmount;
	
	public DrivingRule(String ruleName, String description){
		this.ruleName=ruleName;
		this.description = description;
	}
		
	public void MakeRules (String ruleName){
		totalRuleAmount++;
		System.out.println("The rule " + ruleName);		
	}
	
	public void CountRules (){
		System.out.println(totalRuleAmount);	
	}
	
}



public class FinalStaticVariableTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		DrivingRule Rule1 = new DrivingRule("Parking", "No parking on the brigde");
		
		

	}

}
