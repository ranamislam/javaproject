public class SubClass3 extends SuperClass3
{
    @Override
    public void showValue(int arg)
    {
        System.out.println("SUBCLASS: " + "The int argument was " + arg);
    }

    public void showValue(double arg)
    {
        System.out.println("SUBCLASS: " + "The double argument was " + arg);
    }
}
