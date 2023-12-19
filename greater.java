import java.util.Scanner;
public class greatestamong
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        System.out.print("enter c: ");
        int c = sc.nextInt();
        int tm1 = ((a+b+c)/2)-1;
        if (a>tm1)
        {
            System.out.println("a is greatest");
        }
        else if (b>tm1)
        {
            System.out.println("b is greatest");
        }
        else
            System.out.println("c is greatest");
    }

}
