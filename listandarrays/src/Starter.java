import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Starter {

	

	public static void main(String[] args) {

		String goToArray = "Mazda";
		int[] array = new int[3];
		System.out.println("Array length: " + array.length);
		array[0] = 1;
		System.out.println(Arrays.toString(array));

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("Bmw");
		arrayList.add("VW");
		arrayList.add("Toyota");
		arrayList.add("Scania");
		arrayList.add("Fiat");
		arrayList.add("Honda");
		
		System.out.println("Search volvo " + arrayList.contains("Volvo"));
		System.out.println("//////////");
		
		
		loopArraysToString(arrayList); //calls method

		arrayList.set(1, goToArray); // this method will replace first index of
										// an array with variable goToArray

		System.out.println("ArrayList size is: " + arrayList.size());

		arrayList.remove(2); // this method removes the value of the first index in array
		loopArraysToString(arrayList); // print arrayList after remove
		System.out.println("ArrayList size is: " + arrayList.size());

		String elementZero = arrayList.get(0);
		System.out.println("Element zero is:  " + elementZero);

		ArrayList<Double> arrayTest = new ArrayList<>();
		// in order to get the arraylist of int values, we should use class Integer in diamond brackets
		//We can use also classes Double, Character, Boolean..
		arrayTest.add(234.2);
		loopArraysDoubleToString(arrayTest);
		
		User user = new User("Janis", 3333); //we create new object fromclass User with constructor User
		System.out.println(user.getName());
		
		ArrayList<User> userArray = new ArrayList<>(); // we are creating an arraylist from the class User, using the constructor
		userArray.add(new User("Anna", 3455666));
		userArray.add(new User ("Elza", 5757575));
		userArray.add(user); //in order to create new user in arraylist we are using previosly created object user
		System.out.println(userArray.size());
		loopArraysUserToString(userArray);
		
		List<String> listArr = new ArrayList<>();
		//List<Integer> listTestArr = new ArrayList<>();
		
		listArr.add("3");
		listArr.add("4");
		listArr.add("5");
		System.out.println("Size of the array " + listArr.size());
		
		//listArr.clear();
		//System.out.println(listArr.size());
		
		//listArr.forEach((listArr) -> System.out.println(listArr));
		
		//Iterator <String> iterator = listArr.iterator();
		/*while(iterator.hasNext()){
			String listToString = iterator.next();
			System.out.println(listToString);
		}*/
		Iterator <String> iterator = listArr.iterator();
		List<Integer> listArrayInt = new ArrayList();
		listArrayInt.add(87);
		listArrayInt.add(23);
		listArrayInt.add(34);
		listArrayInt.add(45);
		listArrayInt.add(56);
		Collections.sort(listArrayInt); // sorts values from A to Z
		Iterator <Integer> iteratorName = listArrayInt.iterator();
		while(iteratorName.hasNext()){
			Integer listToString = iteratorName.next();
			System.out.println("List element to count: " +listToString);
		}
		
		
		
	}
	
	public static void loopArraysToString(ArrayList<String> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(" Index: " + i + " " + array.get(i)); // this method prints out an array
		}
	}
	
	public static void loopArraysDoubleToString(ArrayList<Double> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(" Index: " + i + " " + array.get(i)); // this method prints out an array
		}
	}
	
	public static void loopArraysUserToString(ArrayList<User> array) {
		for (User element: array) {
			System.out.println("Element value of arraylist: " + element.getName()); 
		}
	}

}
