package ch.reffya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This file tests methods one by one to ensure they work as expected
 */

import ch.reffya.part2.imperative;
public class imperativeTests 
{
    /**
     * Testing the findmax method
     */
    @Test
    public void findMaxTest()
    {
        int[] sample = {1,2,3,4,5};

        // check if the loop goes to the last element
        assertEquals(5, imperative.findMax(sample));

        int[] myArray = new int[0];
        // if nothing was touched then it should default to integer min value
        assertEquals(Integer.MIN_VALUE, imperative.findMax(myArray));

        int[] another = {67,47,35,42,31};
        // check if the loop doesn't skip the first element
        assertEquals(67,imperative.findMax(another));

    }

    /**
     * testing if uppercase works as expected. Snce comparing to Strings using asserEquals doesn't work (because it checks
     * if the memory adress is the same). We use the equals() method of the string class.
     */
    @Test
    public void toUppercaseTest(){
        String test = "ornythorinque";
        assertTrue(imperative.toUppercase(test).equals("ORNYTHORINQUE"));

        String emptyTest = "";
        assertTrue(imperative.toUppercase(emptyTest).equals(""));

        String mixedString = "BaLanCe";
        assertTrue(imperative.toUppercase(mixedString).equals("BALANCE"));

        String otherString = "h8tred";
        assertTrue(imperative.toUppercase(otherString).equals("H8TRED"));

        String spaces = "test with spaces";
        assertTrue(imperative.toUppercase(spaces).equals("TEST WITH SPACES"));
    }
}
