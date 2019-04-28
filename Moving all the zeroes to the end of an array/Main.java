import java.util.Scanner;
class Main{
  	public static void move(int arr[],int size){
      int count=0;
       for(int i=0;i<=size-1;i++){
         if(arr[i]!=0){
       		int temp=arr[i];
         	arr[i]=arr[count];
         	arr[count]=temp;
         count++;}
         }
      
      
      
    }
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++){
       arr[i]= in.nextInt();
         }
      move(arr,size);
      for(int i=0;i<=size-1;i++){
       System.out.print(arr[i]+" ");
         }
    }
}