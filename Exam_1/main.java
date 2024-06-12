import java.util.Scanner;
import shape.Ellipse;
import shape.Quadrilateral;
import shape.Triangle;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your shape type: ");
        System.out.println("Ellipse: 1");
        System.out.println("Triangle: 2");
        System.out.println("Quadrilateral: 3");
        System.out.println("Select option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                Ellipse shape = new Ellipse();
                System.out.println("Area: 1");
                System.out.println("Perimeter: 2");
                System.out.println("Select: ");
                int cal = scanner.nextInt();
                switch (cal) {
                    case 1:
                        System.out.println("Radio Y:");
                        int Y = scanner.nextInt();
                        System.out.println("Radio X ");
                        int X = scanner.nextInt();
                        shape.calArea(Y, X);
                        System.out.println(shape.getArea());
                        break;
                    case 2:
                        System.out.println("Radio Y:");
                        int y = scanner.nextInt();
                        System.out.println("Radio X ");
                        int x = scanner.nextInt();
                        shape.calPerimeter(y, x);
                        System.out.println(shape.getPerimeter());
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
                break;
            case 2:
                Triangle shape2 = new Triangle();
                System.out.println("Area: 1");
                System.out.println("Perimeter: 2");
                System.out.println("Select: ");
                int cal2 = scanner.nextInt();
                switch (cal2) {
                    case 1:
                        System.out.println("Hight: ");
                        int a = scanner.nextInt();
                        System.out.println("Bass: ");
                        int b = scanner.nextInt();
                        shape2.calArea(a, b);
                        System.out.println(shape2.getArea());
                        break;
                    case 2:
                        System.out.println("Enter a: ");
                        int A = scanner.nextInt();
                        System.out.println("Enter b: ");
                        int B = scanner.nextInt();
                        System.out.println("Enter c: ");
                        int C = scanner.nextInt();
                        shape2.calPerimeter(A, B, C);
                        System.out.println(shape2.getPerimeter());
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
                break;
            case 3:
                Quadrilateral shape3 = new Quadrilateral();
                System.out.println("Area: 1");
                System.out.println("Perimeter: 2");
                System.out.println("Select: ");
                int cal3 = scanner.nextInt();
                switch (cal3) {
                    case 1:
                        System.out.println("Bass m: ");
                        int a = scanner.nextInt();
                        System.out.println("Bass M: ");
                        int b = scanner.nextInt();
                        System.out.println("Hight: ");
                        int c = scanner.nextInt();
                        shape3.calArea(a, b, c);
                        System.out.println(shape3.getArea());
                        break;
                    case 2:
                        System.out.println("Enter l1: ");
                        int l1 = scanner.nextInt();
                        System.out.println("Enter l2: ");
                        int l2 = scanner.nextInt();
                        System.out.println("Enter l3: ");
                        int l3 = scanner.nextInt();
                        System.out.println("Enter l4: ");
                        int l4 = scanner.nextInt();
                        shape3.calPer(l1, l2, l3, l4);
                        System.out.println(shape3.getPerimeter());
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
                break;
            default:
                break;
        }
        

    }
}
