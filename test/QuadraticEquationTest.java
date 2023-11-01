import static org.junit.Assert.*;
import org.junit.Test;

public class QuadraticEquationTest {
    @Test
    public void testSolve() {
        QuadraticEquationResult result = QuadraticEquation.solve(1, -3, 2);
        assertEquals(2.0, result.getRoot1(), 0.001);
        assertEquals(1.0, result.getRoot2(), 0.001);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquationResult result = QuadraticEquation.solve(1, 2, 5);
        assertNull(result.getRoot1());
        assertNull(result.getRoot2());
    }
}
