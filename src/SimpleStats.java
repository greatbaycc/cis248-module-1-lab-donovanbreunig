import java.util.Scanner;

public class SimpleStats{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        int iProduct = num1 * num2 * num3 * num4;
        int iAvg = (num1 + num2 + num3 + num4) / 4;
        double product = ((double) num1 * (double) num2 * (double) num3 * (double) num4);
        double avg = ((double) num1 + (double) num2 + (double) num3 + (double) num4) / 4.0;

        System.out.println(iProduct + " " + iAvg);
        System.out.printf("%.3f %.3f\n", product, avg);
    }
}