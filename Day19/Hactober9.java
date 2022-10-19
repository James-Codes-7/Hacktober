import java.util.Scanner;

public class Hactober9 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Hactober9 hactober9=new Hactober9();
        hactober9.programPage();

    }
    private void programPage()
    {
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        int totalCount=0;
        for(int i=0;i<number*number;i++)
        {
            int c=(int)Math.floor(Math.random()*5+1);
            if(c==5)
            {
                System.out.println(c);
               totalCount++;
            }
        }
        System.out.println(totalCount);

    }
}
