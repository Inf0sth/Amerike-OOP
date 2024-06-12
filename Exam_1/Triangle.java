public class Triangle implements Shape_Interface{
    double area;
    double perimeter;

    public double calArea(double altura, double base){
        double area = (base*altura)/2;
        this.area = area;
        return area;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public double calPerimeter(double a, double b, double c){
        double perimeter = a + b + c;
        this.perimeter = perimeter;
        return perimeter;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
}
