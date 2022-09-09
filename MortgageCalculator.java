import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final Byte MONTHS_IN_YEAR = 12;
        byte periodYears;
        int principal;
        float annualInterest;
        final int PERCENT = 100;





        System.out.print("Principal ($1K - $1M): ");
        Scanner scanner = new Scanner(System.in);
        while (true){
            principal = scanner.nextInt();
            if ((principal > 1000) && (principal < 1_000_000)){
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while (true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if ((annualInterest > 0) && (annualInterest < 1)){
                break;
            }
            System.out.println("Enter a value greater than 0 and less than 1.");
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        while (true){
            System.out.print("Period (Years): ");
            periodYears = scanner.nextByte();
            if ((periodYears >= 0) && (periodYears <30)){
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }
        int numberOfPayments = periodYears * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
    }
}
