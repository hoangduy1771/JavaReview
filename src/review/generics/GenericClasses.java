package review.generics;


import java.util.ArrayList;
import java.util.HashMap;

public class GenericClasses {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 5.55);
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
        MyGenericClass<String, String> myString = new MyGenericClass<>("Hello", "World");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        System.out.println(myInt.getValue2());
        System.out.println(myDouble.getValue2());
        System.out.println(myChar.getValue2());
        System.out.println(myString.getValue2());

        ArrayList<Object> myFriends = new ArrayList<>();
        myFriends.add("");

        HashMap<Integer, String> users = new HashMap<>();

    }
}
