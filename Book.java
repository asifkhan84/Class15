public class Book {
    private String title, author;
    int noOfCopy = 0, noOfLendCopy = 0;

    public Book(){
        this.title = null;
        this.author = null;
        this.noOfCopy = 0;
        this.noOfLendCopy = 0;
    }

    public Book(String title, String author, int noOfCopy, int noOfLendCopy){
        this.title = title;
        this.author = author;
        this.noOfCopy = noOfCopy;
        this.noOfLendCopy = noOfLendCopy;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoOfCopy(int noOfCopy) {
        this.noOfCopy = noOfCopy;
    }

    public void setNoOfLendCopy(int noOfLendCopy) {
        this.noOfLendCopy = noOfLendCopy;
    }

    public boolean bookLoan(int number){
        if(this.noOfCopy > 0){
            this.noOfCopy = this.noOfCopy - number;
            this.noOfLendCopy = this.noOfLendCopy + number;
            return true;
            //System.out.println("Book lend process completed successfully");
        }
        /*else
            System.out.println("No copy is available to lend.");*/
        return false;
    }

    public boolean returnBook(int number){
        if(this.noOfLendCopy > 0){
            this.noOfCopy = this.noOfCopy + number;
            this.noOfLendCopy = this.noOfLendCopy - number;
            return true;
        }
        return false;
    }

    public String toString(){
        return("Book Title: " + this.title + "\nAuthor: " + this.author + "\nAvailable : " + this.noOfCopy + "\nBorrowed : "+ this.noOfLendCopy + "\n");
    }
}
