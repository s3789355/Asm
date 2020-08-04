import java.util.Scanner;

public class Member {
    public String fullName;
    public  String id;
    public int phoneNumber;
    public String email;
    public String address;
    public String expiredDate;
    public String status;
    Scanner input = new Scanner(System.in);
    Member(){
        System.out.println("Full Name: ");
        this.fullName = input.nextLine();
        input.nextLine();

        System.out.println("id: ");
        this.id = input.nextLine();
        input.nextLine();

        System.out.println("Phone number: ");
        this.phoneNumber = input.nextInt();
        input.nextInt();

        System.out.println("Email: ");
        this.email =  input.nextLine();
        input.nextLine();

        System.out.println("Address: ");
        this.address = input.nextLine();
        input.nextLine();

        System.out.println("Expired date: ");
        this.expiredDate = input.nextLine();
        input.nextLine();

        System.out.println("Status: ");
        this.status = input.nextLine();
        input.nextLine();
    }

}
