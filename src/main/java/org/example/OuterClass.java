package org.example;

class OuterClass {

    int integerVariable = 10;
    static int classVariable = 20;

    private static class StaticNestedClass {
        public void print() {
            System.out.print("Static Nested ");
            System.out.println(classVariable);
        }
        public static void like(){
            System.out.print("Static Nested ");
            System.out.println("Test");
        }
    }

    static class StaticNestedClass2 {
        public void print() {
            System.out.print("Static Nested2 ");
            System.out.println(classVariable);
        }
        public static void like(){
            System.out.print("Static Nested2 ");
            System.out.println("Test");
        }
    }

    class InnerClass{
        int innerVariable =80;
        public void print() {
            System.out.print("Inner Nested ");
            System.out.println(classVariable+integerVariable);
        }
    }

    class InnerClass2 extends InnerClass {
        int innerVariable2 =100;
        public void print() {
            System.out.print("Inherited Inner Nested ");
            System.out.println(innerVariable+innerVariable2+classVariable+integerVariable);
        }
    }

    public void display2() {
        int methodVariable =3;
        class LocalInnerClass {
            int localInnerVariable = 2;
            public void print() {
                System.out.println(integerVariable+classVariable+methodVariable+localInnerVariable);
            }
        }
        LocalInnerClass lc = new LocalInnerClass();
        lc.print();
    }

    public void display() {
        StaticNestedClass nestObj = new StaticNestedClass();
        nestObj.print();
        StaticNestedClass.like();
    }

}
