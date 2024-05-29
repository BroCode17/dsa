package BasicMath;

class Solution implements math{
    /**
     * @param n is number
     * @return count
     */
    @Override
    public int countDigits(int n) {

        //Keep track of the total digits
        int count = 0;

        while (n > 0) { //repeat until n is greater than 0

            //increase count by 1
            count++;
            //divide n by 10
            n /= 10;
        }

        return count;
    }

    /**
     * @param  n := the reverse number
     * @return sum
     */
    @Override
    public int reverseANumber(int n) {
        //To reverse a number, we use technique called
        //Extraction := is breaking down the whole number
        // into digits and return the summation of the digits

        int sum = 0;
        while (n > 0) {
            //get each digit
            int temp = n % 10;
            //sum
            sum = sum * 10 + temp;
            //perform integer division
            n = n / 10;

        }
        return sum;
    }

    /**
     * @param n is digit
     * @return true or false
     */
    @Override
    public boolean isPalindrome(int n) {
        //compare the n with a reversed version of n

        return n == reverseANumber(n);
    }

    /**
     * @param a is a number
     * @param b is a number
     * @return the gi
     */
    @Override
    public int GCD(int a, int b) {
        //Brute force
        //int res = 0;
        //from bottom to up
//        for(int i = 1; i < Math.min(a,b); i++){
//            if( i % a == 0 && i % b == 0){
//              res = i;
//            }
//        }
        //from up to bottom
//        for(int i = Math.min(a,b); i >= 1; i--){
//            if( i % a == 0 && i % b == 0){
//              return i;
//            }
//        }


        //using kahns algo
        //States given a number A and B such that
        // (A % B, B) is gcd if A > B else B where both are greater than 0

        while( a > 0 && b > 0){

            if(a > b) a = a % b;
            else b = b % a;
        }

        return a > 0 ? a : b;
    }

    /**
     * @param n is a Number
     * @return true or false
     */
    @Override
    public boolean isArmstrong(int n) {

        //use extraction tech
        int sum = 0;
        //create a duplicate of N
        int dp = n;
        while(dp > 0 ){
            //get each digit
            int eachDigit = dp % 10;
            //add the eachDigit cube to sum
            sum = sum  + ( eachDigit * eachDigit * eachDigit );

            //get the remaining number
            dp = dp / 10;
        }
        //Check is sum and n are equal
        return sum == n;
    }

    /**
     * @param n is a number
     */
    @Override
    public void printPrimeNumber(int n) {

        //All number from 1 to n
        for( int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * @param n
     */
    @Override
    public void printAllDivisors(int n) {

        //o(sqrt(n))
        for(int i  = 1; i * i <= n; i++){
            if(n % i == 0){
                System.out.print(i + ", ");

                //Check if N / i is not equal to i
                if( n / i != i){
                    System.out.print(n / i + ", ");
                }
            }
        }
    }

    /**
     * @param n
     * @return true or false
     */
    @Override
    public boolean isPrime(int n) {
        int count = 0;
        for(int i=1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count == 2;
    }
}




