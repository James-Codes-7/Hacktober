import java.util.Scanner;

public class Hactober3 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Hactober3 hactober3=new Hactober3();
        hactober3.programPage();

    }
    private void programPage()
    {
        System.out.println("Enter the String to check Palindrome");
        String palindromeCheck=scanner.next();
        int size=palindromeCheck.length();
        for(int i=0;i<size;i++)
        {
            if(palindromeCheck.charAt(i)!=palindromeCheck.charAt(size-1-i))
            {
                System.out.println("false");return;
            }
        }
        System.out.println("true");
    }
}
