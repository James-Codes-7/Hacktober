import java.util.Scanner;

public class Hacktober5 {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Hacktober5 hacktober5=new Hacktober5();
        hacktober5.programPage();
    }
    private  void programPage()
    {
        System.out.println("Enter the String");
        String word=scanner.next();
         int size=word.length();
        for(int i=0;i<size;i++)
        {
            if(i!=0)
            {
                System.out.print(word.substring(i,size));
                System.out.print(word.substring(0,i));
            }
            else System.out.print(word.substring(i,size));
            System.out.println();
        }
    }
}
