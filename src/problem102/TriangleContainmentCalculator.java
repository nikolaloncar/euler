package problem102;

import java.awt.*;

public class TriangleContainmentCalculator {
    public static final double DEGREES = 180 / Math.PI;
    public static final Point ORIGIN = new Point(0, 0);

    public static boolean triangleContainsOrigin(Point[] triangle){
        return triangleContainsOrigin(triangle[0], triangle[1], triangle[2]);
    }

    public static boolean triangleContainsOrigin(Point a, Point b, Point c){
        double angle = angle(a, ORIGIN, b) + angle(b, ORIGIN, c) + angle(c, ORIGIN, a);
        return angle >= 359.99999; //Rounding error in angle calculation
    }

    public static double angle(final Point start, final Point center, final Point end){
        final double a = Math.pow(center.x - start.x, 2) + Math.pow(center.y - start.y, 2);
        final double b = Math.pow(center.x - end.x, 2) + Math.pow(center.y - end.y, 2);
        final double c = Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2);
        return Math.acos( (a + b - c) / Math.sqrt(4*a*b)) * DEGREES;
    }

    public static Point[] parseTriangle(final String line){
        String[] coordinates = line.split(",");
        Point[] triangle = new Point[3];
        for(int i = 0; i < 3; i++){
            triangle[i] = new Point(
                    Integer.parseInt(coordinates[i*2]),
                    Integer.parseInt(coordinates[i*2+1])
            );
        }
        return triangle;
    }
}
