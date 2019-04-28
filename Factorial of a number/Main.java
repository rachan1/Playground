import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int fact=1;
      if(num==1 || num == 0)
        System.out.print(1);
      while(num>0)
      {
       fact=fact*num;
        num--;
        
      }
      System.out.print(fact);
	}
}