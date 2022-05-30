package review.generics;

public class MyGenericClass <Thing, Thing2>{

    Thing data;
    Thing2 data2;
    MyGenericClass(Thing data, Thing2 data2) {
        this.data = data;
        this.data2 = data2;
    }

    public Thing getValue() {
        return data;
    }
    public Thing2 getValue2() {
        return data2;
    }

}
