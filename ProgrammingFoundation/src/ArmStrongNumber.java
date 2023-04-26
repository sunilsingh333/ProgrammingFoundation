
public class ArmStrongNumber {

	
	// 153  : 1(3) + 3(3) + 5(3)
	//         1 + 27  + 125
	// 153
	
	public static void main(String[] args) {
		
	}
	
	public static boolean isArmStrong(int number) {
		
		
		int digit;
		int temp = number;
		int sum = 0;
		while(number>0) {
			digit = number % 10;
			sum = sum + digit*digit*digit;
			number = number/ 10;
			
		}
		
		if(temp == sum) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
