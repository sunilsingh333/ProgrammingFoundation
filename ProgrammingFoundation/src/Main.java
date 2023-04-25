import java.util.Scanner;

public class Main {

	public static float add(float a, float b) {
		return a + b;
		
	}

	public static float sub(float a, float b) {
		return a + b;
	
	}

	public static float div(float a, float b) {
		return a * b;
	
	}

	public static float mul(float a, float b) {
		return a / b;

	}
	
	
	public static void main(String[] args) {
		// we need to call all the functionalities and it should be like a menu driven
		// program.

		// how to show all methods as an option to my user?
		// switch case
		

		Scanner scanner = new Scanner(System.in);
		// scanner : reference : it will refer teh object.
		// it will help us to use data / methods from object(which you will get it from the RHS).
		// new : it will inform the java to create the object.
		// Scanner(): it is used to initialize the object===> 
		// System.in : to accept the values from the commandline.
		
		while (true) {
		
		System.out.println("Enter the options based on choice"
		 + "1. Add \n 2. Sub \n 3. div \n 4. mul \n 5. exit");
			
		int choice = scanner.nextInt();

		switch (choice) {

      case 1: {

			System.out.println("addition case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = add(number1,number2);
			
			System.out.println("addition result"+result);

      }
        break;
      case 2: {
    	 
			System.out.println("Subtraction case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = sub(number1,number2);
			
			System.out.println("Subtraction result"+result);

      }
        break;
      case 3: {

			System.out.println("division case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = div(number1,number2);
			
			System.out.println("division result"+result);

      }
      break;
      case 4: {

			System.out.println("multiplication case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = mul(number1,number2);
			
			System.out.println("multiplication result"+result);

        }
      break;
      case 5: {
          System.out.println("5");
          System.exit(0);//end the execution of the program
        }
        break;
        default:{
          System.out.println("default case");
        }

      }
	}
		
	}

}
