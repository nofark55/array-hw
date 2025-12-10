import java.sql.SQLOutput;

public class Book {
    
    private int rating;
    private String title;
    private String author;
    
    public Book(int pRating){
        title = "Flash Boys: A Wall Street Revolt";
        author = "Michael Lewis";
        this.rating = pRating;
        // TODO: set the instance variable to the parameter

    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("rating: " + rating);
        //TODO: use System.out to print the values of the
        //      instance varibles so the user can see the review


    }
    //getters
    //also should I be doing camal case or pascal for varibles
    public int getRating() {
        return rating;
    }

    // 2. Getter for title
    public String getTitle() {
        return title;
    }

    // 3. Getter for author
    public String getAuthor() {
        return author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}