import java.util.Scanner;
class Main 
{
  public static void rightrotate(int arr[],int size,int nor){
   int odd_first_ele=0;
   int odd_last_ele;
    if(size%2==1)
      odd_last_ele=size-1;
    else
      odd_last_ele=size-2;	
    for(int j=1;j<=nor;j++){
    int first=arr[odd_last_ele];
    for(int i =(odd_last_ele-2);i>=0;i=i-2){
    	arr[i+2]=arr[i];         
    }
    arr[0]=first;
    
  } }
  public static void leftrotate(int arr[],int size,int nor){
   int evem_first_ele=1;
   int even_last_ele;
    if(size%2==0)
      even_last_ele=size-1;
    else
      even_last_ele=size-2;	
   
    for(int j=1;j<=nor;j++){
       int first=arr[1];
    for(int i =3;i<size;i=i+2){
      arr[i-2]=arr[i];         
    }
    arr[even_last_ele]=first;
    
  }}
 
  
  
  public static void main(String args[])
    {
    	//Try your code here
    	Scanner in=new Scanner(System.in);
    	int size=in.nextInt();
    	int arr[]=new int[size];
    	for(int i=0;i<=size-1;i++){
         arr[i]=in.nextInt(); 
        }
    	int nor=in.nextInt();
      rightrotate(arr,size,nor);
  leftrotate(arr,size,nor);
    for(int i=0;i<=size-1;i++){
      System.out.print(arr[i]+" "); 
    }
  	}
}