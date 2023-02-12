import java.util.Scanner;

public class CWH_11_PR1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter physics marks = ");
        int physics = scan.nextInt();
        System.out.println("enter chemistry marks = ");
        int chemistry = scan.nextInt();
        System.out.println("enter maths marks = ");
        int maths = scan.nextInt();
        System.out.println("enter biology marks = ");
        int biology = scan.nextInt();
        System.out.println("enter physics marks = ");
        int english = scan.nextInt();
        float percentage = ((physics + chemistry + maths + biology + english)/500f)*100;
        System.out.println("total percentage =");
        System.out.println(percentage);
    }
}

