import java.util.Scanner;

public class Members {
    Scanner input = new Scanner(System.in);
    Member m[] = new Member[100];

    public static int count = 0;
    public void addMember (Member mb){
        for (int i = 0 ; i < count; i++){
            if(mb.id.equalsIgnoreCase(m[i].id)){
                System.out.println("This member is already exist");
                return;
            }
        }
        if (count <= 100){
            m[count] = mb;
            count++;
        }
    }

}
