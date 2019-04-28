import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int col=in.nextInt();
    int arr[][]=new int[row][col];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        arr[i][j]=in.nextInt();
        }
    }
    
     for(int i=col-1;i>=0;i--){
    	for(int j=0;j< row;j++){
        System.out.print(arr[j][i]+" ");
        }
       System.out.println();
    }
     
  }
}