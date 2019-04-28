import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
       arr[i]=in.nextInt();                   
      }
      int value=in.nextInt();
      for(int i=0;i<size;i++){
       for(int j=i+1;j<size;j++){ 
        int sum=arr[i]+arr[j];
         if(sum==value){
           System.out.print(arr[i]+", "+arr[j]);
         System.out.println();}
        	
          }
      } 
    }
}