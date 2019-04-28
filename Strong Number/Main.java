import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=num;
      int sum=0;
      while(num>0)
      {
       int n=num%10;
        // System.out.println(n);
       int fact=1;
        while(n>0)
        {
         fact=fact*n; 
          n--;
        }
         //System.out.println(fact);
        sum=sum+fact;
        num=num/10;
      }
     
      if(sum == num1)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}