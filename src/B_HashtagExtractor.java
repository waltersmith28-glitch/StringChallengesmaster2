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

      while(post.contains("#")) {
          //System.out.println("xtracting");
          int index = post.indexOf("#");
          //System.out.println(post.substring(index));

          int index2;
          if(post.indexOf(" ", index) > -1){
              index2 = post.indexOf(" ", index);
          }
          else if(post.indexOf("!", index) > -1){
              index2 = post.indexOf("!",index);
          }
          else if(post.indexOf("?", index) > -1){
              index2 = post.indexOf("?",index);}
          else {
              index2 = post.indexOf(".",index);
          }
         // System.out.println(index2);
          System.out.println(post.substring(index + 1, index2));
          post = post.substring(index + 1);

      }
    }
    }
        /* TODO: your code goes here */
