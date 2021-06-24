import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringsClassTests {
    StringsClass stringsClass;

    @Before
    public void setup(){
        stringsClass = new StringsClass();
    }

    @Test
    public void testReverseString(){
        assertEquals("cba", stringsClass.reverseString("abc"));
    }

    @Test
    public void testReverseWordsInString(){
        assertEquals("tahW si siht", stringsClass.reverseWordsInString("What is this"));
    }

    @Test
    public void testIsPalindrome(){
        assertTrue(stringsClass.isPalindrome("Madam"));
        assertFalse(stringsClass.isPalindrome("String"));
    }

    @Test
    public void testIsNumberAPalindrome(){
        assertTrue(stringsClass.isNumberAPalindrome(55355));
        assertFalse(stringsClass.isNumberAPalindrome(243));
    }

    @Test
    public void testLongestPalindromeNumber(){
        assertEquals(343, stringsClass.largestPalindromeNumber(348));
        assertEquals(3, stringsClass.largestPalindromeNumber(4));
    }

    @Test
    public void testCopyChars(){
        assertEquals("abcabcabcabc", stringsClass.copyChars("abc", 4));
    }

    @Test
    public void testFindMatches(){
        assertEquals(4, stringsClass.findMatches("what", "whattfwahtfwhatawhathwatwhat"));
    }

    @Test
    public void testDecodeURL(){
        assertEquals(" :?/", stringsClass.decodeURL("%20%3A%3D%2F"));
    }

    @Test
    public void testNumsSum(){
        assertEquals(3, stringsClass.numsSum("abc2nu1nis"));
    }

    @Test
    public void testIsAnagram(){
        assertTrue(stringsClass.isAnagram("sadder", "dreads"));
        assertFalse(stringsClass.isAnagram("abc", "abd"));
    }

    @Test
    public void testHasAnagram(){
        assertTrue(stringsClass.hasAnagram("add", "dflkjodadnlkgv"));
        assertFalse(stringsClass.hasAnagram("add", "sghwfgiwud"));
    }

    @Test
    public void testHistogram(){
        int[][] image = new int[][]{{0,1,3},{1,3,4},{1,2,4}};

        assertEquals(3, stringsClass.histogram(image)[1]);
        assertEquals(1, stringsClass.histogram(image)[2]);
        assertEquals(0, stringsClass.histogram(image)[144]);
    }
}
