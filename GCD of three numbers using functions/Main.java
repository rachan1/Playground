import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gcd1=gcd(n1,n2);
      int gcd2=gcd(gcd1,n3);
      System.out.print(gcd2);
	}
  public static int gcd(int a,int b){
   int min=0,res=0;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>=1){
     if(a%min==0 && b%min==0){
       res= min;
      	break;}
      min--;
    }
    return res;
  }
}