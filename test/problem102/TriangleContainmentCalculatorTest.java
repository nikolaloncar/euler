package problem102;

import org.junit.Test;

import java.awt.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static problem102.TriangleContainmentCalculator.*;

public class TriangleContainmentCalculatorTest {

    @Test
    public void testTriangleContainsOrigin() throws Exception {
        assertTrue(triangleContainsOrigin(
                        new Point(-340, 495),
                        new Point(-153, -910),
                        new Point(835, -947))
        );

        assertFalse(triangleContainsOrigin(
                        new Point(-175, 41),
                        new Point(-421, -714),
                        new Point(574, -645))
        );

        assertFalse(triangleContainsOrigin(
                        new Point(-1, -3),
                        new Point(3, -3),
                        new Point(3, 2))
        );
    }

    @Test
    public void testAngle() throws Exception {
        assertEquals(90.0, angle(new Point(-5, 0), new Point(0, 0), new Point(0, 5)), 0.0);
        assertEquals(90.0, angle(new Point(5, 0), new Point(0, 0), new Point(0, -5)), 0.0);
        assertEquals(90.0, angle(new Point(0, 5), new Point(0, 0), new Point(5, 0)), 0.0);
        assertEquals(180.0, angle(new Point(1, 0), new Point(0,0), new Point(-1, 0)), 0.0);
    }

    @Test
    public void testParseTriangle() throws Exception {
        Point[] triangle = parseTriangle("-340,495,-153,-910,835,-947");
        assertEquals(3, triangle.length);
        assertEquals(-340, triangle[0].x);
        assertEquals(495, triangle[0].y);
        assertEquals(-153, triangle[1].x);
        assertEquals(-910, triangle[1].y);
        assertEquals(835, triangle[2].x);
        assertEquals(-947, triangle[2].y);
    }

    @Test
    public void testNumberOfTrianglesContainingOrigin() throws Exception {
        final String fileLocation = "C:\\Development\\code\\euler\\testResources\\problem102";
        final String fileName = "p102_triangles.txt";
        long trianglesContainingOrigin;
        try(Stream<String> lines = Files.lines(Paths.get(fileLocation, fileName), Charset.defaultCharset())){
            trianglesContainingOrigin = lines.map(TriangleContainmentCalculator::parseTriangle)
                    .filter(TriangleContainmentCalculator::triangleContainsOrigin)
                    .count();
        }
        System.out.println("Triangles containing origin in file [" + fileLocation + "\\" + fileName + "] = " + trianglesContainingOrigin);
    }
}