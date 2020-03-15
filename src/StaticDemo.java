public class StaticDemo
{
    public static void main(String[] args)
    {
        int objectCount;
        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();


        System.out.println(object1.getInstanceCount() + " instance of the class were created.");
    }
}
