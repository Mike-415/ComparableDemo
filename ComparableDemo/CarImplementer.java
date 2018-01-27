package ComparableDemo;
import java.util.Arrays;

public class CarImplementer
{
    private static void arrToStr(Car[] cars)
    {
        for(Car car: cars)
        {
            System.out.println("\t"+car);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Car car1 = new Car(2018, "Tesla", "Roadster");
        Car car2 = new Car(1964, "Ford", "Mustang");
        Car car3 = new Car(1986, "Honda", "Accord");
        Car car4 = new Car(2018, "Tesla", "Roadster");
        System.out.println("\nBefore sorting(years):\n");
        Car[] cars = {car1, car2, car3, car4};
        arrToStr(cars);
        System.out.println("After sorting:\n");
        Arrays.sort(cars);
        arrToStr(cars);

    }
}
