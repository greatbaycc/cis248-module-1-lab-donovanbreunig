import java.util.Scanner;

public class DivideByX{

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int userNum = scnr.nextInt();

        int x = scnr.nextInt();

        for(int i=0; i<3; i++){

            System.out.print(userNum/x);

            userNum /= x;

            if(i+1!=3)

                System.out.print(" ");

        }

        System.out.println();

    }

}