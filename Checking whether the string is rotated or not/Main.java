import java.util.Scanner;
class Main{
   public static int search(StringBuilder temp,int templen,StringBuilder sb2,int s2len){
    int index=-1;
     for(int i=0;i<(templen-s2len+1);i++){
       boolean istrue=true;
       for(int j=0;j<s2len;j++){
          if(temp.charAt(i+j)!=sb2.charAt(j)){
            	istrue=false;
            	break;
          }
         
       }
       if(istrue==true)
         	index=i;
     }
       
       return index;
     
   }
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      StringBuilder sb1=new StringBuilder(str1);
      StringBuilder sb2=new StringBuilder(str2);
      StringBuilder temp=new StringBuilder("");
      for(int i=0;i<str1.length();i++){
       	temp.append(str1.charAt(i)); 
      }
     for(int i=0;i<str1.length();i++){
       	temp.append(str1.charAt(i)); 
      }
       int templen=temp.length();
      int s2len=sb2.length();
      int index=search(temp,templen,sb2,s2len);
      if(index!=-1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}