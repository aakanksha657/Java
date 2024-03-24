import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        String name=Greet();
        System.out.println("hello "+name+ "!");

    }
    static String Greet(){
        Scanner in= new Scanner(System.in);
        String name=in.next();
        return name;
    }
}
