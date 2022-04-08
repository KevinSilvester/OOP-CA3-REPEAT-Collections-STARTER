package dkit.oop;

//This class is needed to answer question 2

import java.util.Objects;

public class Product
{
    private long id;
    private String name;
    String colour;

    public Product(long id, String name, String colour)
    {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public long getId()
    {
        return this.id;
    }

    public String getLastName()
    {
        return name;
    }

    public String getColour() {
        return colour;
    }


    @Override
    public String toString()
    {
        return "Product{" +
                " id='" + this.id+ '\'' +
                ", name='" + this.name + '\'' +
                '}';
    }
}
