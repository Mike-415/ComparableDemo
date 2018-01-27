package ComparableDemo;

public class Car implements Comparable<Car>
{
    private int year;
    private String make, model;

    public Car(int year, String make, String model)
    {
        this.year = year;
        this.make = make;
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car otherCar)
    {
        return this.year - otherCar.year;
    }

    @Override
    public String toString()
    {
        return year+" "+make+" "+model+"\n";

    }
}
