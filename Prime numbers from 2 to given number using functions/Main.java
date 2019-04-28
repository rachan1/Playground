import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      prime_num(num);
	}
  public static void prime_num(int a){
   for(int i=2;i<=a;i++){
     int isPrime=1;
     
     for(int j=2; j<=i/2;j++){
      if(i%j==0){
       isPrime=0;
        break;}  
      }
       if(isPrime==1){
         
        System.out.println(i); 
         
       }
       
       
       
     }
     
     
   }
    
    
}
    
  
