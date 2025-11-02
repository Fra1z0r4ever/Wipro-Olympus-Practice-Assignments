import java.util.Scanner;

public class Constructor {

double length,breadth,height;


Constructor() {
        length = 10;
        breadth = 10;
        height = 10;
        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + (length * breadth * height));
    }

Constructor(double l, double b, double h) {
        // First call the default constructor
        this();
        length = l;
        breadth = b;
        height = h;
        System.out.println("Constructor with parameter");
        System.out.println("Volume is " + (length * breadth * height));
    }
    
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    double length = sc.nextDouble();
    double breadth = sc.nextDouble();
    double height = sc.nextDouble();
	Constructor cuboid1 = new Constructor(length,breadth,height);
    // Constructor cuboid2 = new Constructor();
    }
}