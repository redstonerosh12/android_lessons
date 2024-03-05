package homework2A.qn5;

public class Palindrome {

    public static char[] shave(char[] S){
        if(S.length <= 2){
            throw new IllegalArgumentException("Character array length must be more than 2");
        }
        char[] shaven = new char[S.length-2];
        System.arraycopy(S, 1, shaven, 0, S.length-2);
        return shaven;
    }
    public static boolean isPalindrome (char[] S) {
        //assuming trivial case of empty character array as inherently palindrome
        if(S.length == 0){
            return true;
        }

        boolean firstEqualsLast = S[0] == S[S.length-1];

        if(firstEqualsLast){
            if(S.length <= 2){
                return true;
            }
            else{
                return isPalindrome(shave(S));
            }
        }
        else{
            return false;
        }

    }
}


/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/

