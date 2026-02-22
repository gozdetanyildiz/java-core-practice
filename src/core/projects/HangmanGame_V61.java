package core.projects;
import java.util.ArrayList;
import java.util.Scanner;
public class HangmanGame_V61 {
    public static void main(String[] args) {
        String word = "pizza";
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");
        while (wrongGuesses < 6 ){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c+ " ");

            }
            System.out.println();
            System.out.print( "Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            System.out.println(guess);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!\n");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
            }
            else{
                wrongGuesses++;
                System.out.println("Wrong guess!\n");
            }
        }
        if (wrongGuesses >= 6){
        System.out.print(getHangmanArt (wrongGuesses)); System.out.println("GAME OVER!");
        System.out.println("The word was: word");
        }
        scanner.close();


    }
    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                    
                    
                    
                      """;
            case 2 -> """
                       O
                    
                    
                      """;
            case 3 -> """
                       O
                      /|
                    
                      """;
            case 4 -> """
                       O
                      /|\\
                    
                      """;
            case 5 -> """
                       O
                      /|\\
                      /
                      """;
            case 6 -> """
                       O
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
