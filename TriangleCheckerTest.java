import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle(3, 2, 4));
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(3, 3, 3));
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-1, 0, -1));
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(5, 4, 5));

        assertEquals(TriangleChecker.TriangleType.NORMAL,TriangleChecker.checkTriangle(1, 1, 3));
    }

}



