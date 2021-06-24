import static org.junit.Assert.*;
import org.junit.Test;

public class StringsClassTests {
    @Test
    public void testReverseString(){
        StringsClass stringsClass = new StringsClass();

        assertEquals("cba", stringsClass.reverseString("abc"));
    }

    @Test
    public void testReverseWordsInString(){
        StringsClass stringsClass = new StringsClass();

        assertEquals("tahW si siht", stringsClass.reverseWordsInString("What is this"));
    }

    @Test
    public void testIsPalindrome(){
        StringsClass stringsClass = new StringsClass();

        assertTrue(stringsClass.isPalindrome("Madam"));
        assertFalse(stringsClass.isPalindrome("String"));
    }

    @Test
    public void testIsNumberAPalindrome(){
        StringsClass stringsClass = new StringsClass();

        assertTrue(stringsClass.isNumberAPalindrome(55355));
        assertFalse(stringsClass.isNumberAPalindrome(243));
    }

    @Test
    public void testLongestPalindromeNumber(){
        StringsClass stringsClass = new StringsClass();

        assertEquals(343, stringsClass.largestPalindromeNumber(348));
        assertEquals(3, stringsClass.largestPalindromeNumber(4));
    }

    @Test
    public void testCopyChars(){
        StringsClass stringsClass = new StringsClass();

        assertEquals("abcabcabcabc", stringsClass.copyChars("abc", 4));
    }

    @Test
    public void testFindMatches(){
        StringsClass stringsClass = new StringsClass();

        assertEquals(4, stringsClass.findMatches("what", "whattfwahtfwhatawhathwatwhat"));
    }

    @Test
    public void testDecodeURL(){
        StringsClass stringsClass = new StringsClass();

        assertEquals(" :?/", stringsClass.decodeURL("%20%3A%3D%2F"));
    }

    @Test
    public void testNumsSum(){
        StringsClass stringsClass = new StringsClass();

        assertEquals(3, stringsClass.numsSum("abc2nu1nis"));
    }

    @Test
    public void testIsAnagram(){
        StringsClass stringsClass = new StringsClass();

        assertTrue(stringsClass.isAnagram("sadder", "dreads"));
        assertFalse(stringsClass.isAnagram("abc", "abd"));
    }

    @Test
    public void testHasAnagram(){
        StringsClass stringsClass = new StringsClass();

        assertTrue(stringsClass.hasAnagram("add", "dflkjodadnlkgv"));
        assertFalse(stringsClass.hasAnagram("add", "sghwfgiwud"));
    }
}
