
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mortgage calculator

        /*
            principal : amount loan we want to get
            Annual Interest Rate :
            Period (years) :
        */

        // classes
        Scanner input = new Scanner(System.in);

        // variables
        int principal = input.nextInt();
        double Rate = input.nextDouble();
        int year = input.nextInt();
        double MRate;
        int n; // number of payment

        // calculations
        n = year * 12;
        MRate = (Rate/100)/12;// monthly interest rate
        double mortgage = principal * (MRate * (Math.pow(MRate+1,n))/(Math.pow(1+MRate,n)-1));
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormated);
    }
}