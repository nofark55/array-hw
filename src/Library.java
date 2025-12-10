import java.sql.SQLOutput;

public class Library {

    public String owner = "Noah Farkas";
    //size of 10
    public Book[] allBooks = new Book[10];
    public static void main(String[] args) {
        new Library();
    }


    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allBooks a size of 10

        //TODO: Fill the array allBooks with reviews with random ratings from 0 to 10 inclusive

        for(int i = 0; i<10; i++){
            double rand = Math.random()*10;
            allBooks[i] = new Book((int) (Math.random() * 10));
        }

        //TODO: print all the ratings in the array allBooks
        for(int i = 0; i<allBooks.length; i++){
            System.out.println(allBooks[i].getRating());
        }
        //TODO: Call the method averageRating I don't think I really need to use setters, as I am not altering the data
        averageRating();
    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allBooks and print it
        int computation = 0;
        //averages tend to be decimals, my fisrt output was wrong
        double averageRating = 0;

        for(int i = 0; i<allBooks.length; i++){
            computation += allBooks[i].getRating();
            if (i == allBooks.length-1){
                averageRating = (double) computation / allBooks.length;
                System.out.println("Average rating is : " + averageRating);
            }

        }

    }
}
