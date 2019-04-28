import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int col=in.nextInt();
      
      for(int i=1;i<=row;i++)
      {
       for(int idx=col;idx>col-i;idx--)
         System.out.print(idx);
       for(int idx1=1;idx1<=col-i;idx1++)
         System.out.print(row-i+1);
        System.out.println();
      }
    }
}