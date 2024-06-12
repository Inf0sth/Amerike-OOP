public class Ellipse implements Shape_Interface{
    double area;
    double perimeter;
    
    public double calArea(double radY, double radX){
        double area = radY * radX * 3.141592;
        this.area = area;
        return area;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public double calPerimeter(double radY, double radX){
        double perimeter = 3.141592 * (radX + radY);
        this.perimeter = perimeter;
        return perimeter;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    };


}
