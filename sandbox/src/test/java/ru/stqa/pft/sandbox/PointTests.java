package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sanbox.Point;

public class PointTests {

    @Test
    public void testDistance() {
      Point p1 = new Point(6, 0);
      Point p2 = new Point(8, 0);
      Assert.assertEquals(p1.distance(p2), 2.0);
    }
}
