import java.util.Scanner;
class Main{
  
 
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int [size];
      int freq[]=new int [size];
      
      for(int i=0;i<size;i++){
        arr[i]=in.nextInt();
      }
      
      for(int i=0;i<size;i++){
        freq[i]=0;
      }
      
     
      for(int i=0;i<size;i++){
      	freq[arr[i]-1]++;
      }
      
      for(int i=0;i<k;i++){
        System.out.println(i+1+" "+freq[i]);
        
      }
      
    }
}