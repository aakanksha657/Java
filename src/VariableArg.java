import java.util.Arrays;
public class VariableArg {
    public static void main(String[] args) {
        fun(10,20,30,40,50);
    }
    static void fun(int...v){  //can pass any number of arguments
        System.out.println(Arrays.toString(v)); // output in form of array [10, 20, 30, 40, 50]

    }
}
