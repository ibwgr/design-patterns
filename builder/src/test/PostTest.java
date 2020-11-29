import static org.junit.Assert.*;
import org.junit.Test;

public class PostTest {
    private String mandatoryParams = "Post{title='title', author='author', datePosted='null', numberOfWords=0, numberOfCharacters=0}";
    private String plusDatePosted = "Post{title='title', author='author', datePosted='01.01', numberOfWords=0, numberOfCharacters=0}";
    private String plusNumberOfWords = "Post{title='title', author='author', datePosted='null', numberOfWords=10, numberOfCharacters=0}";
    private String plusNumberOfCharacters = "Post{title='title', author='author', datePosted='null', numberOfWords=0, numberOfCharacters=100}";


    @Test
    public void testShouldBuildObject(){
        Post post = new Post.PostBuilder("title", "author").build();
        assertNotNull(post);
    }

    @Test
    public void testShouldBuildPostWithMandatoryParams(){
        Post post = new Post.PostBuilder("title", "author").build();
        assertEquals(mandatoryParams, post.toString());
    }

    @Test
    public void testShouldBuildPostWithDatePosted(){
        Post post = new Post.PostBuilder("title", "author").datePosted("01.01").build();
        assertEquals(plusDatePosted, post.toString());
    }

    @Test
    public void testShouldBuildPostWithNumberOfWords(){
        Post post = new Post.PostBuilder("title", "author").numberOfWords(10).build();
        assertEquals(plusNumberOfWords, post.toString());
    }

    @Test
    public void testShouldBuildPostWithNumberOfCharacters(){
        Post post = new Post.PostBuilder("title", "author").numberOfCharacters(100).build();
        assertEquals(plusNumberOfCharacters, post.toString());
    }


}
