import java.util.ArrayList;

/**
 * @todo: nutze das Builder Pattern um Posts zu erstellen
 *
 * Nutze den Builder so, dass Du title und author nur 1x setzen und danach jeweils nur noch die anderen 3 Instanzvariabeln (datePosted, numberOfWords und numberOfCharacters) setzen musst
 */

public class PostCreater {
    static ArrayList<Post> posts = new ArrayList<>();
    public static void main(String[] args) {
        Post.Builder postBuilder = new Post.Builder("blog-post", "javadevcentral");
        posts.add(postBuilder.build());
        posts.add(postBuilder.datePosted("17.11").build());
        posts.add(postBuilder.datePosted("18.11").numberOfWords(1000).numberOfCharacters(5000).build());
        printPosts();
    }

    static void printPosts() {
        for (Post post : posts) {
            System.out.println(post);
        }
    }

}
