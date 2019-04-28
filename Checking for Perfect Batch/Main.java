import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
      Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int times=size/3;
    int sum=0,next=0;
    int batch[]=new int[times];
    int arr[]=new int[size];
    for(int i=0;i<=size-1;i++){
     arr[i]=in.nextInt(); 
      
    }
   
    for(int i=0;i<=times-1;i++){
    	for(int j=next;j<=next+3-1;j++){
       		 sum=sum+arr[j];
         	
        } batch[i]=sum;
     // System.out.print(sum);
      next=next+3;
      sum=0;
    }
    int first=batch[0];
    int flag=0;
     for(int i=1;i<=times-1;i++){
     if(first==batch[i])
        flag=0;
     else{
       flag=1;
       break;}
    }
    if(flag==0)
      System.out.print("Perfect Batch");
    else
        System.out.print("Not a Perfect Batch");
    
  }
}
