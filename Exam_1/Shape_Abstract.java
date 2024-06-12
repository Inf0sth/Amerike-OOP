

public abstract class Shape_Abstract implements Shape_Interface {
    public double area;
    public double perimeter;
    private int sides;
    private char type; 
    // E, T, Q

    public int NumberOfSides(){
        return this.sides;
    }
    public double getArea(){
        return this.area;
    }
    public double getPerimeter(){
        return this.perimeter;
    }

    public char getType(){
        return this.type;
    }
    public boolean setType(char type){
        switch (type) {
            case 'E':
                this.type = type;
                return true;
            case 'T':
                this.type = type;
                return true;
            case 'Q':
                this.type = type;
                return true;
            default:
                return false;
        }
    }
}
