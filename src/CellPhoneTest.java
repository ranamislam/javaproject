import java.util.Scanner;
public class CellPhoneTest
{
    public static void main(String[] args)
    {
        String testMan;
        String testMod;
        double testPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the manufacture: ");
        testMan = keyboard.nextLine();

        System.out.println("Enter the model number: ");
        testMod = keyboard.nextLine();

        System.out.println("Enter the retail price: ");
        testPrice = keyboard.nextDouble();

        CellPhone phone = new CellPhone(testMan, testMod, testPrice);

        System.out.println();

        System.out.println("Here is the data that you provided:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model number: " + phone.getModel());
        System.out.println("Retail price: " + phone.getRetailPrice());


    }
}
