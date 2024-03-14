public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Song Name", "Description of the song", "111", 55.5f, "3:45");
        System.out.println("Information of MP3:");
        mp3.showInfo();

        System.out.println();
        Book book = new Book("Book Name", "Description of the book", "112", 45.3f, "Author Name", 300, "Fiction");
        System.out.println("Information of Book:");
        book.showInfo();
    }
}
