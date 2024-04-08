package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxProductTest {
    @Test
    public void testMaxProduct() {
        MaxProduct maxProduct = new MaxProduct();
        assertEquals(36,maxProduct.maxProduct(new int[]{3,2,3,4}));
        assertEquals(60, maxProduct.maxProduct(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    public void testMaxProductWithNegatives() {
        MaxProduct maxProduct = new MaxProduct();
        assertEquals(20800,maxProduct.maxProduct(new int[]{-3, -100, -52, 3 , 4, 1}));
        assertEquals(30, maxProduct.maxProduct(new int[]{1, -2, -3, 4, 5}));
        assertEquals(60, maxProduct.maxProduct(new int[]{1, -2, -3, 4, -5}));
    }
    @Test
    public void testMaxProductWithZeroes() {
        MaxProduct maxProduct = new MaxProduct();
        assertEquals(0, maxProduct.maxProduct(new int[]{5,3,0,-1}));
    }
    @Test
    public void testMaxProductZeros() {
        MaxProduct maxProduct = new MaxProduct();
        assertEquals(0, maxProduct.maxProduct(new int[]{0, 0, 0, 0}));
    }
    @Test
    public void testMaxProductLessThanThreeNumbers() {
        MaxProduct maxProduct = new MaxProduct();
        assertThrows(IllegalArgumentException.class, ()->maxProduct.maxProduct(new int[]{5}));
    }
    @Test
    public void testMaxProductNull() {
        MaxProduct maxProduct = new MaxProduct();
        assertThrows(IllegalArgumentException.class, ()->maxProduct.maxProduct(null));
    }
}
