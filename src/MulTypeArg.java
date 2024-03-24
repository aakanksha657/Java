import java.util.Arrays;

public class MulTypeArg {
    public static void main(String[] args) {
        Types(10,20,"Aakanksha","Akki","Chinnu");

    }
    static void Types(int a, int b, String...v){
        System.out.println(Arrays.toString(v));


    }

}
