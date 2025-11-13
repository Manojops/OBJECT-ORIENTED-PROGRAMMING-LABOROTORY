/*
4.      Write a Java Program to create an abstract class named Shape
        that contains two integers and an empty method named
        printArea(). Provide three classes named Rectangle, Triangle and
        Circle such that each one of the classes extends the class Shape.
        Each one of the classes contains only the method printArea( ) that
        prints the area of the given shape
*/

import org.w3c.dom.css.Rect;

abstract class Shape{
    int a,b;
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        a=length;
        b=breadth;
    }

    void printArea(){
        System.out.println("Area of the Rectangle is "+(a*b)+" sq.cm");
    }
}

class Triangle extends Shape{
    Triangle(int length,int breadth){
        a=length;
        b=breadth;
    }

    void printArea(){
        System.out.println("Area of the Triangle is "+0.5*(a*b)+" sq.cm");
    }
}

class Circle extends Shape{
    Circle(int radius){
        a=radius;
    }

    void printArea(){
        System.out.println("Area of the Circle is "+3.14*(a*a)+" sq.cm");
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(12,4);
        r1.printArea();
        Triangle t1=new Triangle(2,7);
        t1.printArea();
        Circle c1=new Circle(2);
        c1.printArea();
    }
}
