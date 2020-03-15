public class indexOfAndlastIndexOf
{
    public static void main(String[] args)
    {
        /*
        String str = "and a one and a two a three";
        int position = str.indexOf("and");
        System.out.println("The world and appears at the following locations.");

        while(position != -1)
        {
            System.out.println(position);
            position = str.indexOf("and", position + 1);
        }
        */

        //String fullName = "Cynthia Susan Lee";

        /*
        String lastName = fullName.substring(8, 13);

        System.out.println("The full name is " + fullName + "\nThe last name is " + lastName);
        */


        /*
        char[] nameArray = new char[5];
        fullName.getChars(8, 13, nameArray, 0);
        System.out.println("The full name is " + fullName);
        System.out.println("The values in the array are:");

        for(int i = 0; i < nameArray.length; i++)
        {
            System.out.print(nameArray[i] + " ");
        }
        */


        /*
        char[] nameArray;
        nameArray = fullName.toCharArray();
        System.out.println("The full name is " + fullName);
        System.out.println("The values in the array are:");

        for(int i = 0; i < nameArray.length; i++)
        {
            System.out.print(nameArray[i]);
        }
        */



        /*
        String fullName2;
        String firstName = "Timothy";
        String lastName = "Haynes";
        fullName2 = firstName.concat(lastName);
        System.out.println(fullName2);
        */

        //System.out.println(fullName.replace('e', 'X'));

        /*
        String greeting1 = "   Hello   ";
        String greeting2;
        greeting2 = greeting1.trim();
        System.out.println("*" + greeting1 + "*");
        System.out.println("*" + greeting2 + "*");
        */

        /*
        boolean b = true;
        char[] letters = {'a', 'b', 'c', 'e'};
        double d = 2.4981567;
        int i = 7;

        System.out.println(String.valueOf(b) + "\n" + String.valueOf(letters) + "\n" + String.valueOf(letters, 1, 3) + "\n" + String.valueOf(d) + "\n" + String.valueOf(i));
        */

        /*
        StringBuilder str = new StringBuilder();
        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);

        System.out.println(str);
        */

        /*
        StringBuilder str = new StringBuilder("New City");
        str.insert(4, "York ");
        System.out.println(str);
        */


        /*
        char cArray[] = {'2', '0', ' '};
        StringBuilder str = new StringBuilder("In July we sold cars.");
        str.insert(16, cArray);
        str.replace(12, 15, "XYZ");
        str.delete(1, 5);
        str.deleteCharAt(1);
        str.setCharAt(6, '5');
        System.out.println(str);
        */

        /*
        StringBuilder strb = new StringBuilder("This is a test.");
        String str = strb.toString();
        System.out.println(str);
        */

        int number = 14;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println(Integer.toOctalString(number));







    }
}
