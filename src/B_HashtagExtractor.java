/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        String[] words = post.split(" ");
        boolean first = true;

        for(int i = 0; i < words.length; i++){
            String word = words[i];


            if(word.startsWith("#")){
                String hashtag = word;
                while (hashtag.length() > 1 && !Character.isLetterOrDigit(hashtag.charAt(hashtag.length() - 1))){
                    hashtag = hashtag.substring(0,hashtag.length() - 1);
                }

                if(!first){
                    System.out.println(", ");
                }
                System.out.println("Hashtag; "+ hashtag);
                first = false;
            }
        }
        /* TODO: your code goes here */

    }

}
