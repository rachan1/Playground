import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=sumsol(num);
      System.out.print(sum);
    }
  public static int sumsol(int num){
   if(num!=0)
     return num+sumsol(num-1);
   else 
     return num;
    
    
  }
}