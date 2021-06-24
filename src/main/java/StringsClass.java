import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsClass {
    protected String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    protected String reverseWordsInString(String str){
        String reversed = "";
        String[] words = str.split(" ");
        for (String word:words) {
            reversed += reverseString(word) + " ";
        }
        return reversed.trim();
    }

    protected boolean isPalindrome(String str){
        if (Character.toLowerCase(str.charAt(0)) != Character.toLowerCase(str.charAt(str.length() - 1))){
            return false;
        }
        return str.toLowerCase().equals(reverseString(str).toLowerCase());
    }

    protected boolean isNumberAPalindrome(int i){
        return isPalindrome(Integer.toString(i));
    }

    protected long largestPalindromeNumber(long n){
        for (long i = n - 1; i > 0; i--) {
            if (isPalindrome(Long.toString(i))){
                return i;
            }
        }
        return -1;
    }

    protected String copyChars(String chars, int times){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(chars);
        }
        return sb.toString();
    }

    protected int findMatches(String match, String text){
        int occurrences = 0;
        Pattern p = Pattern.compile(match);
        Matcher m = p.matcher(text);
        while (m.find()) {
            occurrences++;
        }
        return occurrences;
    }

    protected String decodeURL(String url){
        String firstRun = url.replaceAll("%20", " ");
        String secondRun = firstRun.replaceAll("%3A", ":");
        String thirdRun = secondRun.replaceAll("%3D", "?");
        String forthRun = thirdRun.replaceAll("%2F", "/");
        return forthRun;
    }

    protected int numsSum(String str){
        String numsStr = str.replaceAll("\\D+","");
        int sum = 0;
        for (int i = 0; i < numsStr.length(); i++) {
            sum += Character.getNumericValue(numsStr.charAt(i));
        }
        return sum;
    }

    protected boolean isAnagram(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }

    static final int MAX = 256;
    static boolean compare(char arr1[], char arr2[])
    {
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    protected boolean hasAnagram(String a, String b){
        int M = a.length();
        int N = b.length();

        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];

        for (int i = 0; i < M; i++)
        {
            (countP[a.charAt(i)])++;
            (countTW[b.charAt(i)])++;
        }

        for (int i = M; i < N; i++)
        {
            if (compare(countP, countTW)) return true;

            (countTW[b.charAt(i)])++;

            countTW[b.charAt(i-M)]--;
        }

        return compare(countP, countTW);
    }
}
