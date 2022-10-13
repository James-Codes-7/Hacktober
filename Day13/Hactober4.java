import java.util.Scanner;

public class Hactober4 {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Hactober4 hactober4=new Hactober4();
        hactober4.programPage();
    }
    private void programPage()
    {
        System.out.println("Enter the array Size");
        int size=scanner.nextInt();

        int array[]=new int[size],i=0;
        System.out.println("Enter the elements to the array");
        for(i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();

        }
        addOne(array,0);

    }
    private void addOne(int array[],int start)
    {
        if(start==array.length)
        {
            return;
        }
        else
        {
            System.out.print(array[start]+1+" ");
           addOne(array,start+1);
        }
    }
}
