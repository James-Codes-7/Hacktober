import java.util.Scanner;

public class Hactober7 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Hactober7 hactober7 = new Hactober7();
        hactober7.programPage();
    }
    private void programPage()
    {
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int k=2;
        for(int i=1;i<=number*number+number;i++)
        {
            if(i%(number+1)==0) {System.out.println();}
            else {
                k=k==2?1:2;
                System.out.print(k);

            }
        }
    }

}
