package shape;

public class Quadrilateral implements Shape_Interface{
    double area;
    double perimeter;

    public double calArea(double bass_m, double bass_M, double h){
        double area = ((bass_M + bass_m)*h)/2;
        this.area = area;
        return area;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public double calPer(double l1, double l2, double l3, double l4){
        double perimeter = l1+l2+l3+l4;
        this.perimeter = perimeter;
        return perimeter;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
}
