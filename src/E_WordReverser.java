/***
 * Problem: Write a method that takes a sentence and reverses
 * each word individually without changing their positions.
 * Expected output: avaJ si emosewa
 */

public class E_WordReverser {

    public static void main(String[] args) {
        E_WordReverser e = new E_WordReverser();
    }

    public E_WordReverser() {
        String sentence = "Java is awesome";
        reverseWords(sentence);  // Output: avaJ si emosewa
    }

    public void reverseWords(String sentence) {
        /* TODO: your code goes here */
        String result = "";
        int start = 0;
        int space = sentence.indexOf(" ", start);

        while (space != -1) {
            String word = sentence.substring(start, space);
            for (int x = word.length() - 1; x >= 0; x--) {
                result = result + word.charAt(x);
            }
            result = result + " ";

            start = space + 1;
            space = sentence.indexOf(" ", start);
        }
        String last = sentence.substring(start);
            for (int y = last.length() - 1; y >= 0; y--){
                result = result + last.charAt(y);
        }

        System.out.println(result);
            }
        }
