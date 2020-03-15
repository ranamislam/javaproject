import java.util.ArrayList;
public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        int num = 0;
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

        for(int index = 0; index < nameList.size(); index++)
        {
            System.out.println(nameList.get(index));
        }

        System.out.println();

        for(String name : nameList)
        {
            System.out.println(name);
        }

        System.out.println();

        nameList.remove(1);

        nameList.set(1, "Becky");

        for(String name : nameList)
        {
            System.out.println(name);
        }


    }
}
