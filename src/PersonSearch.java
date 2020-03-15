import java.util.Scanner;
public class PersonSearch
{
    public static void main(String[] arg)
    {
        String lookup;
        String[] people = {"Cutshaw, Will", "Davis, George", "Davis, Jenny", "Russert, Phil",
                           "Russell, Cindy", "Setzer, Charles", "Smathers, Holly", "Smith, Chris", "Smathers, Holly",
                           "Smith, Chris", "Smith, Brad", "Williams, Jean"};
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first few characters of the last name to look up: ");
        lookup = keyboard.nextLine();

        System.out.println("Here are the names that match:");
        for(String person : people)
        {
            if(person.startsWith(lookup))
                System.out.println(person);
        }

    }
}
