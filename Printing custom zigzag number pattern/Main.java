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
         if(i%2==1){
           if(j<last){
             System.out.print(i);}
           else{
             first=first+1;
             System.out.print(first);}}
          if(i%2==0){
           if(j==1){
             first=first+1;
             System.out.print(first);}
           else{
            
             System.out.print(first-1);}}
        }System.out.print("\n");
      }
      
       }
        
      }