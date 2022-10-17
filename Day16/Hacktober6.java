import java.util.Scanner;

public class Hacktober6 {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Hacktober6 hacktober6=new Hacktober6();
        hacktober6.programPage();
    }
    private void programPage()
    {
        System.out.println("enter the number");
        int number=scanner.nextInt();
        int rowSize=2*number-1;
        for(int i=1;i<=rowSize;i++)
        {
            int size=i<=(rowSize+1)/2?i:rowSize-i+1;
            int alphabet=64+number,alphabetcount=2*size-1;
            int spaceSize=(rowSize-(2*size)+1)*2;

            for(int space=1;space<=spaceSize+1;space++)
            {
                if(space==(spaceSize/2)+1||spaceSize==0)
                {
                    for (int j=1;j<=alphabetcount;j++)
                    {
                        if(j==alphabetcount) System.out.print((char) alphabet++);
                        else if(j<=alphabetcount/2)
                            System.out.print((char)alphabet--+"-");
                        else
                            System.out.print((char) alphabet++ +"-");
                    }
                }
                else System.out.print("-");

            }

            System.out.println();
        }

    }
    }

