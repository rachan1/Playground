import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int len=str.length();
      int end=len-1;
      int flag=1;
      for(int i=0;i<len;i++){
        if(str.charAt(i)!=str.charAt(end)){
         	flag=0;
			break;          
        }
        end--;
      }
        if(flag==1)
          System.out.print("Yes");
        else
          System.out.print("No");
      
    } 
}