import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int row1=in.nextInt();
    int col1=in.nextInt();
    int arr1[][]=new int[row1][col1];
    for(int i=0;i<row1;i++){
    	for(int j=0;j<col1;j++){
        arr1[i][j]=in.nextInt();
        }
    }
    
    int arr2[][]=new int[row1][col1];
    for(int i=0;i<row1;i++){
    	for(int j=0;j<col1;j++){
        arr2[i][j]=in.nextInt();
        }
    }
    boolean x=true;
    
    for(int i=0;i<row1;i++){
    	for(int j=0;j<col1;j++){
         if(arr1[i][j] != arr2[i][j])        
         {
           x=false;
           break;
         }
        }
    }
    
    if(x==true)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}