import java.util.Scanner;


public class ImplementPowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(pow(A,B,C));
    }
    public static int pow(int a,int b,int c)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        int p = pow(a,b/2,c) % c;
        if(b%2==0)
        {
            return (p * p)%c;
        }
        return  (p * p * a)%c;
    }
}