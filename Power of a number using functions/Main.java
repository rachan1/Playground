import java.util.Scanner;

class Main{
  
  public static void main(String args[]){
   Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int power=sol(base,exponent);
    System.out.println(power);
  }
  public static int sol(int a,int b){
 int res=1;
    for(int i=1;i<=b;i++){
      res=res*a;
    }
    return res;
  }
}
