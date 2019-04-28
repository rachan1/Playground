import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
       TreeSet<String> unique = new TreeSet<String>();
 
      String s=br.readLine();
      String arr[]=s.split(",");
      
      System.out.println("Duplicate Entry is:");
       for(String str:arr){
 
           if(!unique.add(str)){
 
            System.out.println(str);
 
           }
    
       }
      System.out.println("TreeSet is : "+unique);
    }
}