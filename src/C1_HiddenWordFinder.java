/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        System.out.println(findHiddenWord(sentence));// Output: Hidden word: Hello
    }

    public String findHiddenWord(String sentence) {
        /* TODO: your code goes here */
        String start = "start";
        String end = "end";
        int indexStart = sentence.indexOf("start");
        int indexEnd = sentence.indexOf("end");
        return sentence.substring(indexStart + 5,indexEnd);



    }

}
