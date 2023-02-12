package com.company;
class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("i am meth2 of class a");
    }
}
    class B extends A{
        public void meth2(){
            System.out.println("i am meth2 of class b");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
    }
}
//class ekclass{
//    int a;
//
//    public int getA() {
//        return a;
//    }
//
//    ekclass(int v){
//        this.a =v;
//
//    }
//    public int return1(){
//        return 1;
//    }
//}
//class doclass extends ekclass{
//    doclass(int c){
//        super(c);
//        System.out.println("i am a constructor "+c);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        ekclass e = new ekclass(5);
//        doclass d = new doclass(6);
//        System.out.println(e.getA());
//    }
//}
//class base {
//    base() {
//        System.out.println("i am a constructor");
//    }
//
//    base(int a) {
//        System.out.println("i am a constructor with value " + a);
//    }
//}
// class  derieved extends base{
//    derieved(){
//        //super(0);
//        System.out.println("i am a derieved constructor");
//    }
//    derieved(int x,int y){
//        super(x);
//        System.out.println("i am a constructor with value "+y);
//    }
//}
//class childofderieved extends derieved{
//    childofderieved(){
//        System.out.println("i am baccha");
//    }
//    childofderieved(int x,int y, int z){
//        super(x,y);
//        System.out.println("i am a constructor with value "+z);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        //  System.out.println(b);
//       // derieved n = new derieved(14,9);
//        childofderieved cd = new childofderieved(12,32,34);
//        System.out.println(cd);
//    }
//}
