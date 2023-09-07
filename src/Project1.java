import java.text.NumberFormat;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] arg) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayment = 0;


        while (true) {
            System.out.println("princepal :");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("please enter the value between 1000 up to 1,000,000");

            while (true) {
                System.out.println("aunal interast rate: ");
                final float annualInterest = scanner.nextFloat();
                if (annualInterest >= 1 && annualInterest <= 30) {
                    monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                    System.out.println("please enter the value between 1 and 30 !!");
                }
            }
        while (true) {
            System.out.println("Period (year): ");
            byte year = scanner.nextByte();
            if (year >= 1 && year <= 30) {
                numberOfPayment = year * MONTHS_IN_YEAR;
                break;
            System.out.println("please enter the value between 1 and 30");

            }
        }


        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
                        / Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortageFormat);

    }
}
