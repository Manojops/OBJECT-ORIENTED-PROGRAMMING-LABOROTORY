/*
5.      Write a Java Program to create an abstract class named Shape
        that contains two integers and an empty method named
        printArea(). Provide three classes named Rectangle, Triangle and
        Circle such that each one of the classes extends the class Shape.
        Each one of the classes contains only the method printArea( ) that
        prints the area of the given shape. Solve the above problem using
        an interface
*/

interface Shape{
    public void printArea();
}

class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    public void printArea(){
        System.out.println("Area of the Rectangle is "+(l*b)+" sq.cm");
    }
}

class Triangle implements Shape{
    int a,b;
    Triangle(int length,int breadth){
        a=length;
        b=breadth;
    }

    public void printArea(){
        System.out.println("Area of the Triangle is "+0.5*(a*b)+" sq.cm");
    }
}

class Circle implements Shape{
    int a;

    Circle(int radius){
        a=radius;
    }

    public void printArea(){
        System.out.println("Area of the Circle is "+3.14*(a*a)+" sq.cm");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Using Interface");
        Rectangle r1=new Rectangle(12,4);
        r1.printArea();
        Triangle t1=new Triangle(2,7);
        t1.printArea();
        Circle c1=new Circle(2);
        c1.printArea();
    }
}
