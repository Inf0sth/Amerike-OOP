public class Quadrilateral implements Shape_Interface{
    double area;
    double perimeter;

    public double calAreaCuad(double l){
        double area = l*l;
        this.area = area;
        return area;
    }

    public double calAreaRect(double base, double altura){
        double area = base*altura;
        this.area = area;
        return area;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    public double calPerCuad(double l){
        double perimeter = l*4;
        this.perimeter = perimeter;
        return perimeter;
    }

    public double calPerRect(double base, double altura){
        double perimeter = (base*altura)/2;
        this.perimeter =  perimeter;
        return perimeter;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
    
}
