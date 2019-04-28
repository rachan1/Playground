import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      
      int ele1=in.nextInt();
      int ele2=in.nextInt();
      int ele1i=-1;
      int ele2i=-1;
      for(int i=0;i<size;i++)
      {
       if(ele1==arr[i])
         ele1i=i;
       if(ele2==arr[i])
         ele2i=i;
        
      }
        
      System.out.println(ele1i);
      System.out.println(ele2i);
    }
}