import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int option=in.nextInt();
      switch(option){
        case 1:
          int side=in.nextInt();
          System.out.println(side * side);
          break;
        case 2:
          int length=in.nextInt();
          int breadth=in.nextInt();
          System.out.println(length * breadth);
          break;
        case 3:
          int base=in.nextInt();
          int height=in.nextInt();
          System.out.println((base * height)/2);
          break;
        case 4:
          int  r=in.nextInt();
          double res= 3.14 * r * r;
          System.out.println(res);
          break;
      }
    }
}