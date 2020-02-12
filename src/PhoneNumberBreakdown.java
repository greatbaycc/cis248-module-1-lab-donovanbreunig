import java.util.Scanner;

public class PhoneNumber{

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        long phoneNumber;

        int areaCode, prefix, line_number;

        phoneNumber = scnr.nextLong();
        line_number = (int)(phoneNumber%10000);
        prefix = (int)(phoneNumber/10000)%1000;
        areaCode = (int)(phoneNumber/10000)/1000;
        System.out.println("("+areaCode+") "+prefix+"-"+line_number);

    }

}