import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    static Scanner input = new Scanner(System.in);
   static ArrayList<item> itemArrayList  = new ArrayList<item>();
    java.io.File file = new java.io.File("src/contacts.txt");
    boolean continueInput = true;
    String skip = "0";

    public static void main(String[] args) {}


    public void printMenu(){
        System.out.println("Welcome to QuickLib!!!\n" +
                "********************************\n" +
                "1. Search items by keywords\n" +
                "2. Add new item\n" +
                "3. Update item info\n" +
                "4. Search members by keywords\n" +
                "5. Register new member\n" +
                "6. Update member info\n" +
                "7. Borrow items\n" +
                "8. Return items\n" +
                "9. Save data\n" +
                "10. Quit\n" +
                "**************************************\n" +
                "Enter a function (1-10): ");
    }

    public void keyword() throws IOException {
        String word = "";
        int val = 0;
        while(!word.matches("quit")) {
            System.out.println("Enter the word to be searched for: ");
            word = input.next();
            Scanner file = new Scanner(new File("information.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.contains(word)) {
                    BufferedReader br = null;
                    String strLine = "";
                    try {
                        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("information.txt"), "UTF-8"));
                        while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 9) {
                            System.out.println(strLine);
                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("There are no items containing this word");
                    }
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
        }
    }




    public static void addNewItem()throws InputMismatchException {
        boolean continueInput = true;
        do{
            try{
                item newItem = new item();
                System.out.println("Enter title: ");
                String title = input.nextLine();

                System.out.println("Enter author");
                String author = input.nextLine();

                System.out.println("Enter edition");
                String edition = input.nextLine();

                System.out.println("Enter publication");
                String publication = input.nextLine();

                System.out.println("Enter year");
                int year = input.nextInt();

                System.out.println("Enter ISBN");
                String isbn = input.nextLine();

                System.out.println("Enter ISSN");
                String issn = input.nextLine();

                System.out.println("Enter language");
                String language = input.nextLine();

                System.out.println("Enter subject");
                String subject = input.nextLine();

                System.out.println("Enter status");
                String status = input.nextLine();

            }catch (InputMismatchException e)
            {
                System.out.println("Invalid data type. Please enter again!");
            }
        }while (continueInput);
    }

    public static  void outputItem(ArrayList<item> itemArrayList){
        for(item i : itemArrayList){
            System.out.println(i);
        }
    }

    public static void updateItemInfo(){
        boolean continueInput = true;
        do{
            try{



                item newItem = new item();
                System.out.println("Enter title: ");
                String title = input.nextLine();

                System.out.println("Enter author");
                String author = input.nextLine();

                System.out.println("Enter edition");
                String edition = input.nextLine();

                System.out.println("Enter publication");
                String publication = input.nextLine();

                System.out.println("Enter year");
                int year = input.nextInt();

                System.out.println("Enter ISBN");
                String isbn = input.nextLine();

                System.out.println("Enter ISSN");
                String issn = input.nextLine();

                System.out.println("Enter language");
                String language = input.nextLine();

                System.out.println("Enter subject");
                String subject = input.nextLine();

                System.out.println("Enter status");
                String status = input.nextLine();

            }catch (InputMismatchException e)
            {
                System.out.println("Invalid data type. Please enter again!");
            }
        }while (continueInput);
    }


    public void SearchMemberByKeyword() throws IOException {
        String word = "";
        int val = 0;
        while(!word.matches("quit")) {
            System.out.println("Enter the word to be searched for: ");
            word = input.next();
            Scanner file = new Scanner(new File("information.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.contains(word)) {
                    BufferedReader br = null;
                    String strLine = "";
                    try {
                        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("information.txt"), "UTF-8"));
                        while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 9) {
                            System.out.println(strLine);
                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("There are no members name containing this word");
                    }
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
        }
    }


    public static void addNewMember()throws InputMismatchException {
        boolean continueInput = true;
        do{
            try{
                item newItem = new item();
                System.out.println("Enter fullname: ");
                String title = input.nextLine();

                System.out.println("Enter id: ");
                String author = input.nextLine();

                System.out.println("Enter phone: ");
                String edition = input.nextLine();

                System.out.println("Enter email: ");
                String publication = input.nextLine();

                System.out.println("Enter address: ");
                int year = input.nextInt();

                System.out.println("Enter expired date: ");
                String isbn = input.nextLine();

                System.out.println("Enter status");
                String issn = input.nextLine();


            }catch (InputMismatchException e)
            {
                System.out.println("Invalid data type. Please enter again!");
            }
        }while (continueInput);
    }


    public static void updateMemberInfo()throws InputMismatchException {
        boolean continueInput = true;
        do{
            try{
                item newItem = new item();
                System.out.println("Enter fullname: ");
                String title = input.nextLine();

                System.out.println("Enter id: ");
                String author = input.nextLine();

                System.out.println("Enter phone: ");
                String edition = input.nextLine();

                System.out.println("Enter email: ");
                String publication = input.nextLine();

                System.out.println("Enter address: ");
                int year = input.nextInt();

                System.out.println("Enter expired date: ");
                String isbn = input.nextLine();

                System.out.println("Enter status");
                String issn = input.nextLine();


            }catch (InputMismatchException e)
            {
                System.out.println("Invalid data type. Please enter again!");
            }
        }while (continueInput);
    }




}



