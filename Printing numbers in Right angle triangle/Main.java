import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      for(int i=1; i<=size;i++){
        for(int j=1;j<=i;j++){
          System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}