public class Vehicle
{
    private String type;
    private String brand;
    private String color;
    private int capacity;
    private double price;
    private String description;


    public Vehicle(String type,String brand,String color,int capacity,double price,String description)
    {
        this.type=type;
        this.brand= brand;
        this.color=color;
        this.capacity = capacity;
        this.price = price;
        this.description = description;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getType()
    {
        return type;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getColor()
    {
        return color;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }

    public void displayCars()
    {
        System.out.println("");

        System.out.println("*********************************************");
        System.out.println("Type: "+type);
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Maximum number of passenger: " +capacity);
        System.out.println("Price: Rs"+price);
        System.out.println(description);
        System.out.println("*********************************************");

        System.out.println("");
    
    }

}