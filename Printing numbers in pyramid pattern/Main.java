import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int size=in.nextInt();
       int num=1;
      for(int i=1;i<=size;i++)
      {
       
       for(int space=1;space<=size-i;space++)
       {
         System.out.print(" ");
       }
        for(int j=1;j<=i;j++){
           
          System.out.print(num);
          System.out.print(" ");
          num=num+1;
       }
       
         System.out.print("\n");
        
      }
	}
}