import java.util.Scanner;

public class Zestober {

   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {

            if ((i == str.length() / 2&&str.length()%2!=0)||
                    ((i==(str.length()/2-1) ||i==str.length()/2)&& str.length()%2==0))
                System.out.print(str.charAt(i));
            else {
                int k=0;
                if(str.length()%2==0&&i<str.length()/2){k=1;}
                for (; k <= Math.abs(i - (str.length() / 2)); k++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }}
