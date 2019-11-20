package com.accenture.lecture13;

class ArrayOperations{
	
	int[] array;
	
	public ArrayOperations(){
		//this();
	}
	
	public ArrayOperations(int[] array){
		this.array=array; 
		System.out.println("Intance has been created");
	}
	
	public void printArray() {
		int index = 0;
		for (int i : this.array) {
			System.out.println(index + " element is " + i);
			index++;
		}
	}
	
	public  int getSum() {
		int sum = 0;
		for (int i = 0; i < this.array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public int getAvarege() {
		int sum = getSum();
		int average = sum / this.array.length;
		return average;
	}

	public int getMaxValue() {
		int max = this.array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] > max) {
				max = this.array[i];
			}

		}
		return max;
	}

	public  double getAvaregeDouble() {
		int sum = getSum();
		double average = (double) sum / this.array.length;
		return average;
	}
}

public class Practice2 {


	public static void main(String[] args) {
		
		ArrayOperations array1 = new ArrayOperations(Practice.arrayDefinedByUser());
		array1.printArray();
		
		System.out.println("Sum is " + array1.getSum());
		System.out.println(array1.getAvarege());
		

	}

}
