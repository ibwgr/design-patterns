public class Post {
    private String title;
    private String author;
    private String datePosted;
    private int numberOfWords;
    private int numberOfCharacters;

    private Post(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.datePosted = builder.datePosted;
        this.numberOfWords = builder.numberOfWords;
        this.numberOfCharacters = builder.numberOfCharacters;
    }

    public static class Builder {
        private String title;
        private String author;
        private String datePosted;
        private int numberOfWords;
        private int numberOfCharacters;
        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }
        public Builder datePosted(String datePosted) {
            this.datePosted = datePosted;
            return this;
        }
        public Builder numberOfWords(int numberOfWords) {
            this.numberOfWords = numberOfWords;
            return this;
        }
        public Builder numberOfCharacters(int numberOfCharacters) {
            this.numberOfCharacters = numberOfCharacters;
            return this;
        }
        public Post build() {
            return new Post(this);
        }
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
}

