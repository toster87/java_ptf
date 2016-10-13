package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by legai on 13.10.2016.
 */
public class PointTests2 {
  @Test
  public void testDistance() {

    Point p1 = new Point(5, 2);
    Point p2 = new Point(1, 1);
    Assert.assertEquals(p1.distance(p2),4.123105625617661);
  }

}
