import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter number");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        if(num%2==0)
System.out.println("number is even");
else if(num%3==0)
System.out.println("number is odd ");
    }
    }