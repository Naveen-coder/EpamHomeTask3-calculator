import java.util.Scanner;
public class Input {
	
	public static void presentation(){
		System.out.println("--------Calculator---------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		
		Calci c=new Calci();
		while(true)
		{
			System.out.println("Enter Operation (1-5)");
			try {
				Scanner sc=new Scanner(System.in);
			int op=sc.nextInt();
			long num1=0,num2=0;
			switch(op)
			{
			case 1:
				System.out.println("Enter num1: ");
				num1=sc.nextLong();
				System.out.println("Enter num2: ");
				num2=sc.nextLong();
				System.out.println(num1+" + "+num2+" = "+c.add(num1, num2));
				break;
			case 2: 
				System.out.println("Enter num1: ");
				num1=sc.nextLong();
				System.out.println("Enter num2: ");
				num2=sc.nextLong();
				System.out.println(num1+" - "+num2+" = "+c.subtract(num1, num2));
				break;
			case 3: 
				System.out.println("Enter num1: ");
				num1=sc.nextLong();
				System.out.println("Enter num2: ");
				num2=sc.nextLong();
				System.out.println(num1+" x "+num2+" = "+c.multiply(num1, num2));
				break;
			case 4: 
				System.out.println("Enter num1: ");
				num1=sc.nextLong();
				System.out.println("Enter num2: ");
				num2=sc.nextLong();
				if(num2==0)
					System.out.println("Can't divisible by 0");
				else
				System.out.println(num1+" / "+num2+" = "+c.divide(num1, num2));
				break;
			case 5: sc.close();
					System.exit(0);
					break;
			default:
				System.out.println("Please enter a valid input...");
				break;
			
			}
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid input..");
			}
			
			
			}
			
			
		}
	}