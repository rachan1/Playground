import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int great=large(n1,n2);
    
      int f=large(great,n3);
      System.out.print(f);
	}
  public static int large(int a,int b){
   if(a>b)
     return a;
   else
     return b;
 
  }
}