import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int len=str.length();
      String str2=in.nextLine();
      int len2=str2.length();
      int count=0;
      for(int i=0;i<(len-len2+1);i++){
        int flag=1;
        for(int j=0;j<len2;j++){
        if(str.charAt(i+j)!=str2.charAt(j)){
         	flag=0;       
        }
     }
        if(flag==1)
          count++;
      }
      System.out.print(count);
    } 
}