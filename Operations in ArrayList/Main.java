import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList al=new ArrayList();
      int n=1;
      while(n!=0){
      System.out.println("Choose any one:");
      System.out.println("1.Insert");
      System.out.println("2.delete");
      System.out.println("3.Display");
      System.out.println("4.Exit");
      String str=br.readLine();
      int n2=Integer.parseInt(str);
      
       switch(n2){
         case 1:
           String str1=br.readLine();
           String arr[]=str1.split(",");
           for(int i=0;i<arr.length;i++){
             al.add(arr[i]); 
           }
           break;
         case 2:
           
           String n1=br.readLine();
           System.out.println("Enter the index value to be deleted:"+n1);
           int a2=Integer.parseInt(n1);
           al.remove(a2);
           break;
         case 3:
           System.out.println(al);
           break;
         case 4:
           System.exit(0);
           
       }
        
        
      }
      
    }
}