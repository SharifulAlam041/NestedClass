package org.example;

public class Main {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.display();
        OuterClass.StaticNestedClass2 obj2 = new OuterClass.StaticNestedClass2();
        obj2.print();
        OuterClass.StaticNestedClass2.like();
        OuterClass.InnerClass innObj = obj.new InnerClass();
        innObj.print();
        obj.display2();
        OuterClass.InnerClass2 obj3 = obj.new InnerClass2();
        obj3.print();

        Car audiCar = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("Press break");
            }
        };
        audiCar.pressBreak();
    }
}