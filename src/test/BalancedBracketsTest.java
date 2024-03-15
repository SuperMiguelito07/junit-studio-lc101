package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    // Test cases
    @Test
    public void test1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); // esperat: true
    }

    @Test
    public void test2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]")); // esperat: true
    }

    @Test
    public void test3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); // esperat: false
    }

    @Test
    public void test4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("")); // esperat: true
    }

    @Test
    public void test5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code] is awesome!")); // esperat: true
    }

    @Test
    public void test6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode")); // esperat: false
    }

    @Test
    public void test7() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code[Is]Awesome]]")); // esperat: true
    }

    @Test
    public void test8() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Laun]chC[ode]")); // esperat: true
    }

    @Test
    public void test9() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]]")); // esperat: false
    }

    @Test
    public void test10() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code")); // esperat: true
    }

    @Test
    public void test11() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Lau n]chC[o de]")); // esperat: true
    }

    @Test
    public void test12() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L[aun!#]chCo*&@de]")); // esperat: true
    }
}