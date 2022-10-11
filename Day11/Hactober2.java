import java.util.Scanner;

public class Hactober2 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Hactober2 hactober2=new Hactober2();
        hactober2.programPage();
    }
    private void programPage()
    {
        System.out.println("Enter the String");
        String str=scanner.next();
        int i=0,size=str.length();
        for( i=0;i<size;i++)
        {
            System.out.print(str.substring(0,i+1)+", ");
        }
    }
}
