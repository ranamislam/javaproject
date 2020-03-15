import java.util.Scanner;

public class TelephoneTester
{
    public static void main(String[] args)
    {
        String phoneNumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an unformatted telephone number: ");
        phoneNumber = keyboard.nextLine();

        System.out.println("Formatted: " + Telephone.format(phoneNumber));

        System.out.println("Enter a telephone number formatted as \n(XXX) XXX-XXXX : ");
        System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));
    }

}
