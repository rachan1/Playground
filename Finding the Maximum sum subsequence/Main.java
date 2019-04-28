import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
      arr[i]=in.nextInt();
    
    int max=arr[0];
    int sum=arr[0];
    
    for(int i=1;i<size;i++){
     if(arr[i]>arr[i-1])
       sum=sum+arr[i];
      else
        sum=arr[i];
      if(sum>max)
        max=sum;
      
    }
    System.out.print(max);
  }
}