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
                        int Y = scanner.nextInt();
                        System.out.println("Radio X ");
                        int X = scanner.nextInt();
                        shape.calPerimeter(Y, X);
                        System.out.println(shape.getPerimeter());
                        break;
                    default:
                        break;
                }


                break;

            case 2:
                break;
        

            case 3:
                break;
            default:
                break;
        }

    }
}
