import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int first=1;
      int last=size;
      for(int i=1;i<=size;i++){
       for(int j=1;j<=size;j++){
           if( j==first || j==last)
             System.out.print("*");
         else
           System.out.print(" ");
   
       }System.out.print("\n");
        first=first+1;
        last=last-1;
      }
	}
}