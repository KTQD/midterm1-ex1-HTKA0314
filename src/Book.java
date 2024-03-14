class Book extends Item {
    private final String author;
    private final int numberOfPages;
    private final String genre;
    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    @Override
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}
