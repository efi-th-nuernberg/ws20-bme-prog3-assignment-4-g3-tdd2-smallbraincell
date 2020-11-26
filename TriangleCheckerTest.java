import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangleNormal() {

        // Arrange
        float a = 10;
        float b = 30;
        float c = 40;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle(a, b, c));
       
    }       
    @Test
    public void testValidTriangleISOSCELES() {

        // Arrange
        float a = 20;
        float b = 20;
        float c = 40;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(a, b, c));
       
    }      
    @Test
    public void testValidTriangleEQUILATERAL() {

        // Arrange
        float a = 5;
        float b = 5;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(a, b, c));
       
    }      
    @Test
    public void testValidTriangleNegative() {

        // Arrange
        float a = 0;
        float b = -1;
        float c = -1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(a, b, c));
       
    }    
       @Test
    public void testValidTriangleOneSideIsNull() {

        // Arrange
        float a = 0;
        float b = 20;
        float c = 20;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        
        assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(a, b, c));
       
    }    
}
