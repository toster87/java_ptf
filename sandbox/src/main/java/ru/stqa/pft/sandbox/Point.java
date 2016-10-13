package ru.stqa.pft.sandbox;

/**
 * Created by legai on 13.10.2016.
 */
public class Point {


  public double x;
  public double y;


  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(ru.stqa.pft.sandbox.Point p) {

    return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
  }
}
