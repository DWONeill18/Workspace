package com.qa.unique_sum;

public class Unique_sum {
	
	
	public int summation(int num1, int num2, int num3) {
		
		if ( ((num1 != num2) && (num1 != num3)) && (num2 != num3) ) {
			return (num1 + num2 + num3);
		}
		
		else if (num1 == num2) {
		
			return (num3);
		}
		else if (num1 == num3) {
			
			return (num2);
		}
		else if (num2 == num3) {
			
			return (num1);
		}

		else {
		return 0;
		}
		
		
}
}
