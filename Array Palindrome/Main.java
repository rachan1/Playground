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
      int left=0;
      int right=size-1;
      int flag=1;
      while(left<right){
       if (arr[left]!=arr[right]){
         flag=0;
         break;}
        left++;
        right--;
      }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}