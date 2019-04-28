import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int num;
      for(int i=1;i<=size;i++)
      {
         num=size-(i-1);
        for(int j=1;j<=size-(i-1);j++){
          System.out.print(num);
          num=num-1;
       }
       
         System.out.print("\n");
      
      }
	}
}