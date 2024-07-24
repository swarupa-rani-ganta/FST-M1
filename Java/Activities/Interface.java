package Activities;

interface MyInterface {
    public void method1();
    public void method2();
}

class Demo implements MyInterface {
    //This class has to implement both the abstract methods
    public void method1() {
        System.out.println("implementation of method1");
    }
    public void method2() {
        System.out.println("implementation of method2");
    }
    public static void main(String arg[]) {
        MyInterface obj = new Demo();
        obj.method1();
    }
}