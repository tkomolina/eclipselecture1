public class SwitchExample {

	public static void main(String[] args) {

		int expression = 2;
		int result = 0;
		switch (expression) {
		case 1:
			result++;
			break;
		case 2:
			result++;
			break;
		case 3:
			result++;
			break;
		default:
			result++;
		}
		System.out.println(result);
		
		
		int result2 = 0;
		if(expression == 1){
			result2++;
		}
		if (expression == 2){
			result2++;
		if (expression == 3){
			result2++;
		} else {
			result2++;
		}
		System.out.println(result2);
		
				}
	}
}


