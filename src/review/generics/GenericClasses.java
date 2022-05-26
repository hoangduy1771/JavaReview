package review.generics;
import review.generics.classes.MyCharacterClass;
import review.generics.classes.MyDoubleClass;
import review.generics.classes.MyIntegerClass;



public class GenericClasses {
    public static void main(String[] args) {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");
    }
}
