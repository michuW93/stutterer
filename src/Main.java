import java.util.Scanner;

//https://pl.spoj.com/problems/FR_10_02/
public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String duplicatedLetters = "";

        int numOfLetters = in.nextInt();
        for (int i = 0; i < numOfLetters; i++) {
            duplicatedLetters += in.next();
        }
        in.nextLine();
        String wordToSay = in.nextLine();

        printWord(duplicatedLetters, wordToSay);
    }

    public static void printWord(String duplicatedLetters, String wordToSay) {
        for (int i = 0; i < wordToSay.length(); i++){
            char actualLetter = wordToSay.charAt(i);
            System.out.print(actualLetter);
            if (duplicatedLetters.contains(String.valueOf(actualLetter))){
                System.out.print(actualLetter);
            }
        }
    }
}
