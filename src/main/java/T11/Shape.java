package T11;

public interface Shape {

    double calculateArea();
    double calculatePerimeter();

}

class Circle implements Shape{
    double radius;
    double PI = 3.14;

    @Override
    public double calculatePerimeter() {
        return 2*(radius * PI);
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }
}

class Square implements Shape{
    double side;


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
