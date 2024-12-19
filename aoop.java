// Base class representing a generic library item
class LibraryItem {
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass representing a book
class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Page Count: " + pageCount);
    }
}

// Subclass representing a magazine
class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, String issue) {
        super(title, author);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue: " + issue);
    }
}

// Subclass representing a DnD manual
class DnDManual extends LibraryItem {
    private String campaignSetting;

    public DnDManual(String title, String author, String campaignSetting) {
        super(title, author);
        this.campaignSetting = campaignSetting;
    }

    public String getCampaignSetting() {
        return campaignSetting;
    }

    public void setCampaignSetting(String campaignSetting) {
        this.campaignSetting = campaignSetting;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Campaign Setting: " + campaignSetting);
    }
}

// Main class to demonstrate the library system
public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of each type of item
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Magazine magazine = new Magazine("National Geographic", "Various", "March 2024");
        DnDManual dndManual = new DnDManual("Player's Handbook", "Wizards of the Coast", "Forgotten Realms");

        // Display details of each item
        System.out.println("Book Details:");
        book.displayDetails();
        
        System.out.println("\nMagazine Details:");
        magazine.displayDetails();
        
        System.out.println("\nDnD Manual Details:");
        dndManual.displayDetails();
    }
}
