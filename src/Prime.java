import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(fun(num));

    }
    static boolean fun(int num){
        if(num<=1) {
            return false;
        }
            int c=2;
            while(c*c<=num){
                if(num%c==0){
                    return false;
                }
            c++;
        }
        return c*c>num;
    }
}
