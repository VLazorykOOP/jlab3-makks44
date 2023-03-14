abstract class Figure {
    // абстрактні методи обчислення площі та периметру
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }

    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            return length == r.length && width == r.width;
        }
        return false;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }

    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return radius == c.radius;
        }
        return false;
    }
}

class Trapezium extends Figure {
    private double top;
    private double bottom;
    private double height;
    private double side1;
    private double side2;

    public Trapezium(double top, double bottom, double height, double side1, double side2) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return (top + bottom) / 2 * height;
    }

    public double getPerimeter() {
        return top + bottom + side1 + side2;
    }

    public String toString() {
        return "Trapezium with top " + top + ", bottom " + bottom + ", height " + height + ", side1 " + side1 + ", and side2 " + side2;
    }

    public boolean equals(Object o) {
        if (o instanceof Trapezium) {
            Trapezium t = (Trapezium) o;
            return top == t.top && bottom == t.bottom && height == t.height && side1 == t.side1 && side2 == t.side2;
        }
        return false;
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(5, 10);
        figures[1] = new Circle(2);
        figures[2] = new Trapezium(2, 5, 3, 4, 3);

        for (Figure f : figures) {
            System.out;
        }
    }
}