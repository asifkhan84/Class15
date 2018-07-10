public class BookProgram {
    public static void main(String []args){
        Book book1 = new Book("Java For Dummies","Barry A. Burd", 5,0);
        book1.bookLoan(6);
        book1.returnBook(1);
        System.out.println(book1);
    }
}
