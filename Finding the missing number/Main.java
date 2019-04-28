import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
        arr[i]=in.nextInt(); 
      }
      int n=size;
      
     for(int i=0;i<size;i++){
       int  flag=0;
       for(int j=0;j<size;j++){
          if(arr[j]==n)
              flag=1;
           
       }
       if(flag==0)
         System.out.print(n);
       n--;
     }
    
    }
}