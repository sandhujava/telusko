package palindrome;
public class Palindrome {

    public boolean checkPalindrome(String input){
        char[] ch = input.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--) {
            rev+=ch[i];
        }
        return rev.equalsIgnoreCase(input);
    }
}
