package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] rags) {

    hello("world");
    hello("user");
    hello("Alex");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоуголоника со сторонами " + r.a + " и " + r.b + " = " +r.area());

    Point p1 = new Point(5, 2);
    Point p2 = new Point(1, 1);

    System.out.println("Расстояние между точкой p1(" + p1.x + ", " + p1.y + ") и точкой p2(" + p2.x + ", " + p2.y + ") = " +  p1.distance(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");


  }



}