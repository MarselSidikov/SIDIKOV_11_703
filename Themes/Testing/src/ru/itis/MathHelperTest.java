package ru.itis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 01.03.2018
 * MathHelperTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MathHelperTest {

    private MathHelper helper;

    @Before
    public void setUp() {
        helper = new MathHelper();
    }

    @Test
    public void testOnPrimeNumber() {
        assertTrue(helper.isPrime(23));
    }

    @Test
    public void testOnNotPrimeNumber() {
        assertFalse(helper.isPrime(24));
    }

    @Test
    public void testOn9() {
        assertFalse(helper.isPrime(9));
        asse
    }
}
