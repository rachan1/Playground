import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numcopy= n;
        int count = 0;
        if(n < 0)
        {
            n = n * -1;
        }
        while(n>0)
        {
            count++;
            n = n/10;
        }
        if(numcopy<0)
            count = count + 1;
        char array[] = new char[count];
        if(numcopy< 0)
        {
            numcopy = numcopy * -1;
            array[0] = '-';
        }
        count = count - 1;
        while(numcopy > 0)
        {
            char ch = (char)((numcopy % 10) + '0');
            array[count] = ch;
            numcopy=numcopy/10;
            count--;    
        }
        System.out.print(array);
    }
}