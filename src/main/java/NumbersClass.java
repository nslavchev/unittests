import java.math.BigInteger;
import java.util.Arrays;

public class NumbersClass {
    protected boolean isOdd(int n){
        return n % 2 == 1;
    }

    protected boolean isPrime(int n) {
        int m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    protected int minElement(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    protected int kthMinElement(int k, int[] arr){
        Arrays.sort(arr);
        return arr[k - 1];
    }

    protected int elementWithOddOccurrence(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > 1 && count % 2 != 0) {
                return arr[i];
            }
        }
        return -1;
    }

    protected int averageOfArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    protected int getApowB(int a, int b) {
        if (b==0){
            return 1;
        }
        if (b%2==0){
            return getApowB(a*a,b/2);
        }
        return a * getApowB(a*a, b/2);
    }

    protected int lcm(int n) {
        int lcm = 1;
        int gcd = 1;

        for(int i=2; i<=n; i++){
            gcd = findGCD(i, lcm);
            lcm = (lcm*i)/gcd;
        }

        return lcm;
    }

    private static int findGCD(int a, int b){
        if(b == 0) return a;
        return findGCD(b, a%b);
    }

    private long factorial(long n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    protected long doubleFactorial(long n){
//        long[] factorials = {1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600,6227020800L,87178291200L,1307674368000L,20922789888000L,355687428096000L,6402373705728000L,121645100408832000L,2432902008176640000L};
//        long factorialOfN = factorials[n];
//        int index = (int)factorialOfN;
//        if(index <= 20){
//            return factorials[index];
//        }
//        throw new IllegalArgumentException("Number too large!");
        long firsNum = factorial(n);
        return factorial(firsNum);
    }

    protected long maximalScalarProduct(int[] vectorA, int[] vectorB){
        if (vectorA.length != vectorB.length){
            throw new IllegalArgumentException("Vectors are not the same length!");
        }
        Arrays.sort(vectorA);
        Arrays.sort(vectorB);
        long res = 0;
        for (int i = 0; i < vectorA.length; i++) {
            res += vectorA[i] * vectorB[i];
        }
        return res;
    }

    protected int maxSpan(int[] numbers){
        int biggestLength = 1;

        for (int i = 0; i < numbers.length; i++) {
            int newLength = 0;
            for (int j = i; j < numbers.length; j++) {
                newLength++;
                if (numbers[j] == numbers[i] && newLength > biggestLength){
                    biggestLength = newLength;
                }
            }
        }
        return biggestLength;
    }

    protected boolean hasEqualSideSums(int[] arr)
    {
        int right_sum = 0, left_sum = 0;

        int i, j;
        for(i = 0, j = arr.length-1 ; i < j ; i++, j--){
            left_sum += arr[i];
            right_sum += arr[j];

            while(left_sum < right_sum && i < j){
                i++;
                left_sum += arr[i];
            }
            while(right_sum < left_sum && i < j){
                j--;
                right_sum += arr[j];
            }
        }

        return left_sum == right_sum && i == j;
    }
}
