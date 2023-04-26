
public class StrongNumber {
	// 145 : 1! + 4! + 5!
	// 1 + 24 + 120
	// 145
	public static void main(String[] args) {
		boolean result = isStrongNumber(145);
		
		if(result==true)
		System.out.println("number is a strong number");
		else 
			System.out.println("no is not a strongnumber");
	}
	
	public static int calculateFact(int number) {
		
		int result = 1;
		int counter =number;
		
		
		
		while(counter>=1) {
			
			result = result * counter;
			counter--;// counter = counter - 1
			
			
		}
		return result;
	}
	
	public static boolean isStrongNumber(int number) {
		// return type is boolean : 
		// if the method is going to return boolean value then the method name should start with is.
		
		// will separate the digit
		// hten it will calculate the factorial of every digit
		// then sum up and compare with original number.
		// 145 : 1* 100 + 4*10 + 5* 1
		// 145 : 1 * 10^2 + 4*10^1 + 5* 10^0
		
		int digit = 0;
		
		int sum = 0;
		int temp = number;
		
		
		while(number>0) {
			digit = number % 10;
			
			sum = sum + calculateFact(digit);
			System.out.println(digit);
			number = number / 10;
			
		}
		System.out.println(sum);
		System.out.println(number);
		
		if(temp == sum) {
			return true;
		}
		else
		return false;
		
	}

}