//Tyler Norman
//insert scanner
import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		//insert scanner
		Scanner key = new Scanner(System.in);
		//Asking the user how much money they would like to spend on the vending machine for chocolate
		System.out.println("How much money would you like to spend on chocolate from the vending machine?");
		//making the integer for the money
		int money = key.nextInt();
		//Making the if statement for if the value entered is invalid
		if(money < 0)
		{
			System.out.println("Invalid value for amount! Exiting program.");
			System.exit(0);
			
		}
		//coupon variable
		int coupon = 0;
		//chocolate bar variable
		int bar = 0;
		//For statement for money and bars
		for (int i = money; i > 0; i--)
		{
			
			bar++;
			coupon++;
			if(coupon == 6)
			{
				
				coupon = 1;
				bar++;
			}
		}
		//Prints for the user when he/she enters the valid amount of how many bars they would like to buy.
		System.out.println("You can buy "+bar+" chocolate bars and will have "+ coupon +" coupons left!");

	}

}
