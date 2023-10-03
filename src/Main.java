public class Main{
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Программирование для начинающих", "Инна", "2002");
        Book book1 = new Book.NonFictionBook("Программирование для начинающих, часть 2", "Инна", "2003");
        Book book2 = new Book("Программирование для начинающих, часть 3", "Инна", "2004");
        Book book3 = new Book.FictionBook("Программирование для начинающих, часть 4", "Инна", "2005");
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.issueBook(book);
        library.findBooksByGenre(Genre.FICTION);
        library.printBooks();
        library.issueBook(book);
        library.returnBook(book);
        library.printBooks();
        Library.LibraryHelper.findBookByTitle("Программирование для начинающих, часть 2", library);
    }
}
