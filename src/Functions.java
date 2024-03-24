import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int ans=sum();
    }
    static int sum(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 1 num: ");
        int num1= in.nextInt();
        System.out.print("Enter 2 num: ");
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.println("Sum= "+ sum);
        return sum;
    }
}
