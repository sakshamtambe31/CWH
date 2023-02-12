package com.company;
class base{
    int x;

    public void setX(int x) {
        System.out.println("i am in a base and setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }
    class Derieved extends base{
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
    }
}

////     class cylender{
////         private int radius;
////         private int height;
////
////         public cylender(int radius, int height) {
////             this.radius = radius;
////             this.height = height;
////         }
////
////         public constructor{
////
////         }
////         public int getRadius() {
////             return radius;
////         }
////
////         public void setRadius(int radius) {
////             this.radius = radius;
////         }
////
////         public int getHeight() {
////             return height;
////         }
////
////         public void setHeight(int height) {
////             this.height = height;
////         }
////         public double surfacearea(){
////             return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
////         }
////         public double volume(){
////             return Math.PI*radius*radius*height;
////         }
//         class rectangle {
//    private int length = 4;
//    private int breadth = 5;
//
//    public rectangle() {
//
//    }
//
//    public rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//
//
//    public class Main {
//        public static void main(String[] args) {
////         cylender myCylender = new  cylender(12,23);
////         myCylender.setRadius(2);
////         myCylender.setHeight(12);
////         int h =myCylender.getHeight();
////         System.out.println(h);
////         System.out.println(myCylender.getRadius());
////         System.out.println(myCylender.surfacearea());
////         System.out.println(myCylender.volume());
//            rectangle r = new rectangle();
//            System.out.println(r.getLength());
//            System.out.println(r.getLength());
//        }
//    }
//}
//constructors
//class MyMainEmployee{
//    private int id;
//    private String name;
////    public MyMainEmployee(){
////        id = 45;
////        name = "Your name here";
////    }
//public MyMainEmployee(String myName, int myId){
//    id = 45;
//    name = myName;
//}
//    public String getName(){return name;}
//    public void setName(String n){this.name = n;}
//    public void setId(int i){this.id = i;}
//    public int getId(){ return id;}
//}
//public class Main {
//    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee("Programmingwithharry",12);
//        //harry.setName("codewthharry");
        //harry.setId(34);
//        System.out.println(harry.getId());
//        System.out.println(harry.getName());
//    }
//}
//class MyEmployee {
//    private int id;
//    private String name;
//    public String setName(){
//      return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//    public void setId(int i){
//        id = i;
//    }
//    public int getId(){
//        return id;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MyEmployee harry = new MyEmployee();
//        harry.id =45;
//        harry.name="codewithharry"; throws an error due to private acess modifier
//        harry.setName("codewitharry");
//        harry.setId(12);
//        System.out.println(harry.setName());
//
//    }
//}
//class tommy{
//    public void hit(){
//        System.out.println("hitting the enemy");
//    }
//    public void run(){
//        System.out.println("running from the enemy");
//    }
//    public void fire(){
//        System.out.println("firing on the enemy");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        tommy p1 = new tommy();
//        p1.fire();
//        p1.hit();
//        p1.run();
//    }
//}
//class rectangle{
//    int side1;
//    int side2;
//    public int area(){
//        return side1*side2;
//    }
//    public int perimeter(){
//        return side1+side2;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        rectangle rect = new rectangle();
//        rect.side1=2;
//        rect.side2=4;
//        System.out.println(rect.area());
//        System.out.println(rect.perimeter());
//
//    }
//}
//class square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        square sq = new square();
//        sq.side=3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
//    }
//}
//class Employee {
//    int salary;
//    String name;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String n) {
//        name = n;
//    }
//
//    class cellphone {
//        public void ring() {
//            System.out.println("Ringing");
//        }
//
//        public void vibrate() {
//            System.out.println("vibrating");
//        }
//
//        public void callfriend() {
//            System.out.println("calling billu");
//
//        }
//    }
//
//
//
//    public class Main {
//        public static void main(String[] args) {
            //problem1
//            Employee harry = new Employee();
//            harry.salary = 233;
//            harry.setName("codewithharry");
//            System.out.println(harry.getName());
//            System.out.println(harry.getSalary());
            //problem2
//            cellphone asus = new cellphone();
//            asus.callfriend();
//            asus.ring();
//            asus.vibrate();
//
//        }
//}
//package com.company;
//
//class Employee {
//    int id;
//    String name;
//    int salary;
//
//    public void printdetails() {
//        System.out.println("my id is" + id);
//        System.out.println("and my name is is" + name);
//    }
//
//    public int getSalary() {
//
//            return salary;
//}
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("this is our custom class");
//        Employee harry = new Employee();
//        Employee john = new Employee();
//        //string properties
//        harry.id=12;
//        harry.name="code with harry";
//
//        john.id =13;
//        john.name="john khandelwal";
//        harry.printdetails();
//        john.printdetails();
//        int salary = john.getSalary();
//        System.out.println(harry.id);
//       System.out.println(harry.name);
//    }
//}
//package com.company;
//public class Main {
//    static int factorial_itrerative
//    {
//
//
//
//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            int product =1;
//            for(int i=1;i<=n;i++){
//                product *= i;
//            }
//            return product;
//        }
//    }
//    public static void main(String[] args) {
//        int n=4;
//        System.out.println("the value of factorial n is"+ factorial(n));
//        System.out.println("the value of factorial n is"+ factorial_itrerative(n));
//    }
//}
//varargs
//package com.company;
//public class Main {
//    static int sum(int a,int b) {
//        return a + b;
//    }
//    static int sum(int a,int b,int c) {
//        return a + b +c;
//    }
//    static int sum(int a,int b,int c,int d) {
//        return a + b + c +d;
//    }
//    static int sum(int ...arr) {
//        int result = 0;
//        for (int a : arr) {
//            result += a;
//
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//
//        System.out.println("welcome to varargs tutorial");
//        System.out.println("The sum of 4 and 5 is: " + sum());
//        System.out.println("The sum of 4 and 5 is: " + sum(4,3,5));
//    }
//}
//package com.company;
//
//public class Main {
//    static void foo(){
//        System.out.println("Good morning bro");
//}
//static void foo(int a,int b){
//    System.out.println("Good morning" + a + "bro");
//    System.out.println("Good morning" + b + "bro");
//}
//    static int foo(int a,int b,int c){
//        System.out.println("Good morning" + a + "bro");
//        System.out.println("Good morning" + b + "bro");
//    return 3;
//    }
//    static void change(int a){
//        a = 98;
//    }
//    static void change2(int [] arr){
//        arr[0]=98;
//    }
//    public static void main(String[] args) {
//        int[] marks = {52, 73, 77, 89, 98, 94};
////    int x = 45;
////    change(x);
////        System.out.println("THe value of x after running change is : "+ x);
////        change2(marks);
////        System.out.println("The value of x after running change is: "+ marks[0]);
//        foo();
//        foo(300,200);
//    }
//}
