import java.util.Scanner;

public class items {
    item theItem[] =new item[100];
    public static int count;
    Scanner input = new Scanner(System.in);

    public int compareItems(item item1, item item2){
        if(item1.isbn.equalsIgnoreCase(item2.isbn) || item1.issn.equalsIgnoreCase(item2.issn)){
            System.out.println("This item already exist");

        }
        return 1;

    }
    public void addItem (item i){
        for ( int j = 0; j < count; j++){
            if (this.compareItems(i, this.theItem[j])==0){
                return;
            }
            if (count < 100){
                theItem[count] = i;
                count++;
            }
        }
    }
    public void updateItemInfo(){
        System.out.println("Enter ISBN or ISSN");
    }


}
