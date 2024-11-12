class Car
{
    private String make;
    private String model;
    private int year;
    private String color;
    Car(String mk, String md, int yr, String clr)
    { 
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;
    }
    public void getCarDetails()
    {
        System.out.println(color+" "+make+"-"+model+" "+year);
    }
}
public class K93
{
    public static void main(String[] args)
    {
        Car principalCar = new Car("TATA","SAFARI",2008,"BLACK");
        Car vprincipalCar = new Car("MARUTI","OMNI",2012, "WHITE");
        System.out.println("The two cars parked in front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
    }
}
