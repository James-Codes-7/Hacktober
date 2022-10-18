import java.util.Scanner;

public class Hactober8 {
    private Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        Hactober8 hactober8=new Hactober8();
        hactober8.programPage();

    }
    public void programPage()
    {
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                if(i==0||j==0||i==number-1||j==number-1||i==j||i+j==number-1) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
