package org.example;

public class SomeOtherClass extends OuterClass.InnerClass {
    SomeOtherClass() {
        new OuterClass().super();
    }

    public void display5() {
        print();
    }

}
