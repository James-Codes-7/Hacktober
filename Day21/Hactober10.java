import java.util.Scanner;

public class Hactober10 {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Hactober10 hactober10=new Hactober10();
        hactober10.programPage();
    }
    private void programPage()
    {
        System.out.println("Enter the word....");
        String word=scanner.next();

        System.out.println("Enter the character");
        char check=scanner.next().charAt(0);

        System.out.println(ifPresent(word,check));

    }
    private boolean ifPresent(String word,char check)
    {
        return word.contains(""+check+"");
    }
}
