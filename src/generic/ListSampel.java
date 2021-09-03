package generic;

import java.util.ArrayList;
import java.util.List;

public class ListSampel {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        List<String> list2 = new ArrayList<>(list1);

       // System.out.println(list2);


        printCar();
       // printCar2();
    }

    private static void printCar() {
        List<Car> list1 = new ArrayList<>();
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        list1.add(car1);
        list1.add(car2);
        list1.add(car3);
        List<Car> list2 = new ArrayList<>(list1);

        System.out.println(list1);
        System.out.println(list2);

        car1.setName("carrrrrrr");

        System.out.println(list1);
        System.out.println(list2);
    }

    private static void printCar2() {
        List<Car> list1 = new ArrayList<>();
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        list1.add(car1);
        list1.add(car2);
        list1.add(car3);
        List<Car> list2 = (List<Car>) ((ArrayList<Car>) list1).clone();

        car1.setName("carrrrrrr");

        System.out.println(list1);
        System.out.println(list2);
    }
}
