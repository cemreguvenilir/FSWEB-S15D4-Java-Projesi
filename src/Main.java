import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Don't node"));

        System.out.println(DecimalToBinary(13));
        System.out.println(DecimalToBinary(5));
        System.out.println(DecimalToBinary(6));



    }

    public static boolean checkForPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();
        // if( c >= 'a' && c <= 'z')
        for(char c: text.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return text.equals(reversed.toString());

    }

    public static boolean isPalindrome(String text){
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> queue = new LinkedList<>();


        for(char c: text.toCharArray()){
            queue.addLast(c);
            stack.push(c);
        }
        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.poll())){
                return false;
            }

        }
        return true;
    }

    public static String DecimalToBinary(int num){
        final int base = 2;
        Stack digits = new Stack();
        while(num>0){
            digits.push(num % base);
            num = num / base;
        }
        String bits = "";
        while(!digits.isEmpty()){
            bits += digits.pop();
        }
        return bits;
    }

}