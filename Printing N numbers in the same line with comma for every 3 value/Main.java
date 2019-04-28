import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    for(int i=1;i <=n1;i++)
    {
      System.out.print(i);
      if( i%3==0)
         System.out.print(",");
        
    }
    
  }
}