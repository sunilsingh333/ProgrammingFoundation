
public class PerfectNumber {
	
	public static void main(String[] args) {
		boolean result = isPerfectNumber(30);
		System.out.println("perfect number status"+result);
	}
	public static boolean isPerfectNumber(int number) {
		
		int half = number / 2;
		
		int sum = 0;
		int remainder = 0;
		// to sum the factors.
		// perfect number : 

		// 28 ===> 14 ===> 1 to 14 ===> all the numbers from 1 to 14 and will apply the complete div(remainder 0) ==> 1, 2, 4, 7 , 14
		int counter = 1;
		while(counter<=half) {
			
			remainder = number % counter;
			if(remainder ==0) {
				sum = sum + counter;
			}
			counter++;// counter = counter + 1
			
			
		}
		System.out.println(sum);
		
		if(number ==sum) {
			return true;
		}
		else
			return false;
	}

}
