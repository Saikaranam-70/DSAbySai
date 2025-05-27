/*
 * Given a String the task is check whether given string is palindrome or not
 * Example:-
 *         Input:="MADAM"
 *         OUTPUT:=true
 */
package ArrayProblems;

import java.util.Scanner;

public class Problem8 {
    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while (start < end) {
            if (charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Problem8 pr8 = new Problem8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check weather palindrome or not :" );
        String word = sc.nextLine();
        boolean result = pr8.isPalindrome(word);
        if(result){
            System.out.println("Yes Palindrome :"+true);
        }else{
            System.out.println("Not a Palindrome :"+ result);
        }
    }
}

