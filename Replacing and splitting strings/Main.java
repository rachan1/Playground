import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int no_of_parts=in.nextInt();
      
      String rep=str1.replace(str1,str2);
      
      String res[]=rep.split(" ",no_of_parts);
      
      for(String th:res)
        System.out.println(th);
      
    }
}