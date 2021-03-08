import java.lang.*;
import java.util.Scanner;

public class FutureInvestmentValue {
    static void financialCalculator(){
        System.out.println("Hello, Welcome to the Future Investment Value Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the present value: ");
        double present = sc.nextInt();
        System.out.println("Please Enter the interest rate: ");
        double interest = sc.nextInt();
        System.out.println("Please enter the period in years: ");
        double period = sc.nextInt();

	/* Here we calculate the future value using the formula:
		FV = PV(1+r)pow.n
		
		FV is the Future Value (futureValue)
		PV is the Present Value (present)
		r is the interest rate (interest)
			- We divide the interest rate by 100, to convert it
			  from percentage to integer
		n is the period (period). i.e the period of the investment
	*/
        double futureValue = present * Math.pow((1 + interest/100), period);
        System.out.println("Future Value of the asset is: " + futureValue);

    }
    public static void main(String args[]){
        financialCalculator();


    }
}
