package exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static <T extends Product> List<T> merge(
            List<T> list1, List<T> list2
    ){
        ArrayList<T> newList = new ArrayList<>(list1);
        newList.addAll(list2);
        return newList;
    }

    public static void main(String[] args) {
        List<Product> list = merge(List.of(new Product("apple"),new Product("grape")), List.of(new Product("juice")));
        list.stream().forEach(System.out::println);
    }
}
