import java.util.Scanner;

public class item {
    public String title;
    public String author;
    public String edition;
    public String publication;
    public int year;
    public String isbn;
    public String issn;
    public String language;
    public String subject;
    public String status;

    Scanner input = new Scanner(System.in);

    item(){
        System.out.println("Enter title: ");
        this.title = input.nextLine();
        input.nextLine();
        System.out.println("Enter author");
        this.author = input.nextLine();
        input.nextLine();
        System.out.println("Enter edition");
        this.edition = input.nextLine();
        input.nextLine();
        System.out.println("Enter publication");
        this.publication = input.nextLine();
        input.nextLine();
        System.out.println("Enter year");
        this.year = input.nextInt();
        input.nextInt();
        System.out.println("Enter ISBN");
        this.isbn = input.nextLine();
        input.nextLine();
        System.out.println("Enter ISSN");
        this.issn = input.nextLine();
        input.nextLine();
        System.out.println("Enter language");
        this.language = input.nextLine();
        input.nextLine();
        System.out.println("Enter subject");
        this.subject = input.nextLine();
        input.nextLine();
        System.out.println("Enter status");
        this.status = input.nextLine();
        input.nextLine();

    }

}
