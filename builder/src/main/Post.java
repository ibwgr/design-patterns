public class Post {
    private String title;
    private String author;
    private String datePosted;
    private int numberOfWords;
    private int numberOfCharacters;

    private Post(PostBuilder postBuilder) {
        this.title = postBuilder.title;
        this.author = postBuilder.author;
        this.datePosted = postBuilder.datePosted;
        this.numberOfWords = postBuilder.numberOfWords;
        this.numberOfCharacters = postBuilder.numberOfCharacters;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", numberOfCharacters=" + numberOfCharacters +
                '}';
    }

    public static class PostBuilder{
        private String title;
        private String author;
        private String datePosted;
        private int numberOfWords;
        private int numberOfCharacters;

        public PostBuilder(String title, String author){
            this.title = title;
            this.author = author;
        }

        public PostBuilder datePosted(String datePosted){
            this.datePosted = datePosted;
            return this;
        }

        public PostBuilder numberOfWords(int numberOfWords){
            this.numberOfWords = numberOfWords;
            return this;
        }

        public PostBuilder numberOfCharacters(int numberOfCharacters){
            this.numberOfCharacters = numberOfCharacters;
            return this;
        }

        public Post build(){
            return new Post(this);
        }

    }

}

