package generic;

import java.util.ArrayList;
import java.util.List;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
       // sample.callBoundedWildcardMethod();
        sample.callBoundedWildcardMethod2();
    }

    private void callBoundedWildcardMethod() {
        WildcardGeneric<Car> car = new WildcardGeneric<>();
        car.setWildcard(new Car("my name is boonboon"));
        boundedWildcardMethod(car);
    }

    private void callBoundedWildcardMethod2() {
        WildcardGeneric<Car> car = new WildcardGeneric<>();
        car.setWildcard(new Bus("my name is Bruuuun"));
        boundedWildcardMethod(car);
    }

    private void callBoundedWildcardMethod3() {
        List<WildcardGeneric<Car>> cars = new ArrayList<>();

        WildcardGeneric<Car> car1 = new WildcardGeneric<>();
        car1.setWildcard(new Bus("my name is Bruuuun"));
        WildcardGeneric<Car> car2 = new WildcardGeneric<>();
        car2.setWildcard(new Car("my name is BoonBoon"));
        cars.add(car1);
        cars.add(car2);

        boundedWildcardMethod(car1);
    }

    /**
     * Bounded wildcard를 사용해서, 하위타입도 매개변수로 받을 수 있다.
     * ?는 컴파일 시 Object타입으로 지워지게 되지만, 범위로 지정한 부분은 지워지지 않고 남는다.
     *
    * */
    private void boundedWildcardMethod(WildcardGeneric<? extends Car> car) {
        System.out.println(car.getWildcard());
    }

    private <T extends Car> void boundedWildcardMethod2(WildcardGeneric<T> car) {
        System.out.println(car.getWildcard());
      //  System.out.println(car.getPassenger()); // Car타입만 상속하기 때문에 하위 타입의 메소드를 부를수없다
    }


}
