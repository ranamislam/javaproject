public class LaptopDemo
{
    public static void main(String[] args)
    {
        Laptop laptopMethod = new Laptop();
        laptopMethod.setLaptopBrand("Dell");

        Laptop laptopBrandConstructor = new Laptop("Apple");
        Laptop laptopProcessorConstructor = new Laptop("Lenovo", "i7");


        System.out.println(laptopMethod.getLaptopBrand());
        System.out.println(laptopBrandConstructor.getLaptopBrand());
        System.out.println(laptopProcessorConstructor.getLaptopBrand() + " " + laptopProcessorConstructor.getLaptopProcessor());
    }
}
