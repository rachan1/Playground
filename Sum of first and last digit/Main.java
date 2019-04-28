import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int last_digit=num%10;
      while(num >=10)
      {
        num=num/10;
      }
      
     
      int sum=last_digit+num;
      System.out.print(sum);
	}
}