package wslf.geometry;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static wslf.geometry.Constants.*;
import static java.lang.Math.*;

/**
 *
 * @author Wsl_F
 */
public class VectorTest extends TestCase {

    public VectorTest(String testName) {
        super(testName);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    @Override
    public void setUp() throws Exception {
    }

    @After
    @Override
    public void tearDown() throws Exception {
    }

    /**
     * Test of length method, of class Vector.
     */
    public void testLength() {
        System.out.println("length");
        Vector instance = new Vector(1, 0);
        double expResult = 1;
        double result = instance.length();
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of equals method, of class Vector.
     */
    public void testEquals() {
        System.out.println("equals");
        Vector v2 = new Vector(2, 2);
        Vector instance = new Vector(1, 1);
        boolean expResult = false;
        boolean result = instance.equals(v2);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Vector.
     */
    public void testEquals2() {
        System.out.println("equals");
        Vector v2 = new Vector(123.54, 76.23);
        Vector instance = new Vector(123.54, 76.23);
        boolean expResult = true;
        boolean result = instance.equals(v2);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPositiveAngle method, of class Vector.
     */
    public void testGetPositiveAngle() {
        System.out.println("getPositiveAngle");
        Vector v = new Vector(1, 0);
        Vector instance = new Vector(0, 1);
        double expResult = PI / 2;
        double result = instance.getPositiveAngle(v);
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of getPositiveAngle method, of class Vector.
     */
    public void testGetPositiveAngle2() {
        System.out.println("getPositiveAngle");
        Vector v = new Vector(0, 1);
        Vector instance = new Vector(1, 0);
        double expResult = PI / 2;
        double result = instance.getPositiveAngle(v);
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of getPositiveAngle method, of class Vector.
     */
    public void testGetPositiveAngle3() {
        System.out.println("getPositiveAngle");
        Vector instance = new Vector(0, 1);
        Vector v = new Vector(1, 1000);
        double expResult = atan(1 / 1000);
        double result = instance.getPositiveAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);

        result = v.getPositiveAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(0, 1);
        double expResult = PI / 2;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle1() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(0, -1);
        double expResult = -PI / 2;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle2() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(1, 0);
        double expResult = 0;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle3() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(-1, 0.0001);
        double expResult = PI;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle4() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(-1, -0.0001);
        double expResult = -PI;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle5() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(0, 1);
        double expResult = PI / 4;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle6() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(1, 0);
        double expResult = -PI / 4;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle7() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(-1, 1);
        double expResult = PI / 2;
        double result = instance.getAngle(v);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle10() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(0, 1);
        double expResult = -PI / 2;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle11() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(0, -1);
        double expResult = PI / 2;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle12() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(1, 0);
        double expResult = 0;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle13() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(-1, 0.0001);
        double expResult = -PI;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle14() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        Vector v = new Vector(-1, -0.0001);
        double expResult = +PI;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle15() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(0, 1);
        double expResult = -PI / 4;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle16() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(1, 0);
        double expResult = +PI / 4;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle17() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 1);
        Vector v = new Vector(-1, 1);
        double expResult = -PI / 2;
        double result = v.getAngle(instance);
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle50() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        for (double x = 1; x < 30; x++) {
            for (double y = 1; y < 30; y++) {
                Vector v = new Vector(x, y);
                double expResult = atan(y / x);
                double result = instance.getAngle(v);
                assertEquals(expResult, result, EPS_ANGLE);
            }
        }
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle51() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        for (double x = 1; x < 30; x++) {
            for (double y = 1; y < 30; y++) {
                Vector v = new Vector(x, -y);
                double expResult = -atan(y / x);
                double result = instance.getAngle(v);
                assertEquals(expResult, result, EPS_ANGLE);
            }
        }
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle52() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        for (double x = 1; x < 30; x++) {
            for (double y = 1; y < 30; y++) {
                Vector v = new Vector(-x, -y);
                double expResult = atan(y / x) - PI;
                double result = instance.getAngle(v);
                assertEquals(expResult, result, EPS_ANGLE);
            }
        }
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle53() {
        System.out.println("getAngle");
        Vector instance = new Vector(1, 0);
        for (double x = 1; x < 30; x++) {
            for (double y = 1; y < 30; y++) {
                Vector v = new Vector(-x, y);
                double expResult = PI - atan(y / x);
                double result = instance.getAngle(v);
                assertEquals(expResult, result, EPS_ANGLE);
            }
        }
    }

    /**
     * Test of getAngle method, of class Vector.
     */
    public void testGetAngle60() {
        System.out.println("getAngle");
        Vector instance = new Vector(0, 1);
        for (double x = 1; x < 30; x++) {
            for (double y = 1; y < 30; y++) {
                Vector v = new Vector(x, y);
                double expResult = -atan(x / y);
                double result = instance.getAngle(v);
                assertEquals(expResult, result, EPS_ANGLE);
            }
        }
    }

    /**
     * Test of getAngleToOX method, of class Vector.
     */
    public void testGetAngleToOX() {
        System.out.println("getAngleToOX");
        Vector instance = new Vector(1, 1);
        double expResult = -PI / 4;
        double result = instance.getAngleToOX();
        assertEquals(expResult, result, EPS_ANGLE);
    }

    /**
     * Test of multiplyVectors method, of class Vector.
     */
    public void testMultiplyVectors() {
        System.out.println("multiplyVectors");
        Vector v2 = new Vector();
        Vector instance = new Vector();
        double expResult = 0.0;
        double result = instance.multiplyVectors(v2);
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of rotateVector method, of class Vector.
     */
    public void testRotateVector() {
        System.out.println("rotateVector");
        double phi = 0.0;
        Vector instance = new Vector(1, 1);
        instance.rotateVector(phi);
        assertEquals(new Vector(1, 1), instance);
    }

    /**
     * Test of getVectorByAngle method, of class Vector.
     */
    public void testGetVectorByAngle() {
        System.out.println("getVectorByAngle");
        double angle = PI / 4;
        Vector instance;
        instance = Vector.getVectorByAngle(angle);
        assertEquals(new Vector(1, 1), instance);
    }

    /**
     * Test of mult method, of class Vector.
     */
    public void testmultiplyScalar() {
        System.out.println("mult");
        double k = 2;
        Vector instance = new Vector(1, 1);
        instance.multiplyScalar(k);
        assertEquals(instance.x, k);
        assertEquals(instance.x, k);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear1() {
        System.out.println("isCollinear");
        Vector v = new Vector(1, 2);
        Vector instance = new Vector(2, 4);
        boolean expResult = true;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear2() {
        System.out.println("isCollinear");
        Vector v = new Vector(1, 0);
        Vector instance = new Vector(2, 0);
        boolean expResult = true;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear3() {
        System.out.println("isCollinear");
        Vector v = new Vector(0, 5);
        Vector instance = new Vector(0, 6);
        boolean expResult = true;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear11() {
        System.out.println("isCollinear");
        Vector v = new Vector(1, 2);
        Vector instance = new Vector(2, 3);
        boolean expResult = false;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear21() {
        System.out.println("isCollinear");
        Vector v = new Vector(1, 1);
        Vector instance = new Vector(2, 0);
        boolean expResult = false;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCollinear method, of class Vector.
     */
    @Test
    public void testIsCollinear31() {
        System.out.println("isCollinear");
        Vector v = new Vector(1, 5);
        Vector instance = new Vector(0, 6);
        boolean expResult = false;
        boolean result = instance.isCollinear(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of normalize method, of class Vector.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        Vector instance = new Vector();
        boolean expResult = false;
        boolean result = instance.normalize();
        assertEquals(expResult, result);
    }

    /**
     * Test of normalize method, of class Vector.
     */
    @Test
    public void testNormalize2() {
        System.out.println("normalize");
        Vector instance = new Vector(10, 0);
        boolean expResult = true;
        boolean result = instance.normalize();
        assertEquals(expResult, result);
        assertEquals(instance, new Vector(1, 0));
    }

    /**
     * Test of multiplyScalar method, of class Vector.
     */
    @Test
    public void testMultiplyScalar_Vector() {
        System.out.println("multiplyScalar");
        Vector v = new Vector(7, 8);
        Vector instance = new Vector(10, 10);
        double expResult = 150;
        double result = instance.multiplyScalar(v);
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of multiplyScalar method, of class Vector.
     */
    @Test
    public void testMultiplyScalar_Vector2() {
        System.out.println("multiplyScalar");
        Vector v = new Vector(1, 2);
        Vector instance = new Vector(3, 4);
        double expResult = 11;
        double result = instance.multiplyScalar(v);
        assertEquals(expResult, result, EPS);
    }

    /**
     * Test of multiplyScalar method, of class Vector.
     */
    @Test
    public void testMultiplyScalar_Vector3() {
        System.out.println("multiplyScalar");
        Vector v = new Vector(1, 1);
        Vector instance = new Vector(1, -1);
        double expResult = 0;
        double result = instance.multiplyScalar(v);
        assertEquals(expResult, result, EPS);
    }
}
