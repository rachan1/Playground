import java.util.Scanner;
class Main
{
  public static  int square (int a){
    
    int s=a*a;
    return s;
    
    
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in =new Scanner (System.in);
      int n=in.nextInt();
      int sq=square(n);
      System.out.println(sq);
      
	} 
}