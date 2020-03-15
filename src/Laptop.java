public class Laptop
{
    String laptopBrand;
    String laptopProcessor;


    public Laptop()
    {

    }

    public Laptop(String laptopBrand)
    {
        this.laptopBrand = laptopBrand;
    }

    public Laptop(String laptopBrand, String laptopProcessor)
    {
        this.laptopBrand = laptopBrand;
        this.laptopProcessor = laptopProcessor;
    }

    public void setLaptopBrand(String laptopBrand)
    {
        this.laptopBrand = laptopBrand;
    }

    public String getLaptopBrand()
    {
        return laptopBrand;
    }

    public String getLaptopProcessor()
    {
        return laptopProcessor;
    }

}
