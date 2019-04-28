import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num_c=num;
      int num2=num;
      int d_count=0;
      while(num_c>0){
        num_c=num_c/10;
        d_count++;
      }
      
      int final_sum=0;
      
      while(num>0){
        int sum=1;
       int n=num%10;
       for(int i=1;i<=d_count;i++){
          sum=sum*n;
       }
       // System.out.print(sum);
        final_sum=final_sum+sum;
        num=num/10;
      }
     // System.out.print(final_sum);
      if(final_sum==num2)
        System.out.print("Armstrong Number");
      else
        System.out.print("Not a Armstrong Number");
	}
}