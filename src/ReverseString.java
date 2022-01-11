import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("**************** 😀 This program takes a string and reverse it. ************************** ");
        System.out.println("Please enter a String: ");

        while(true){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine(); //Must use nextLine instead of next
            if(input.equals("0")) break; //terminate program if user entered "0"
            System.out.println("The reverse string is: "+ Reverse((input)));
            System.out.println("Please enter a String (enter 0 to end the program): ");
        }

    }
    public static String Reverse(String str){
        String reversedStr = "";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i); //extract character at position i of the str
            reversedStr = c +reversedStr;  //add the character to the front to reverse the string
        }

        return reversedStr;
    }
}
