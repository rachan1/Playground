import java.util.Scanner;
class Main{
  
 
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int [size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int k=in.nextInt();
      
      for(int i=0;i<=size-1;i++){
        for(int j=i+1;j<size;j++){
          if(arr[i]>arr[j]){
      		  int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;}
        }
      }
     
        System.out.print(arr[size-k]);
      
    }   
}