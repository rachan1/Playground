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
     
    int times[]=new int[2*size];
    int idx=0;
    
    for(int i=0;i<size;i++){
      int count=1;
      for(int j=i+1;j<size;j++){
 			if(arr[i]==arr[j]){
              times[i]=++count;}
        else
          times[i]=count;
      }
    }
    
    int max=times[0];
    for(int i=1;i<size;i++)
    {
     	if(times[i]>max){
          max=times[i];
          idx=i;
        }
      
      
    }
    System.out.print(arr[idx]);
  
  }
}