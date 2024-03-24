public class OverLoading {
    public static void main(String[] args) {
        fun(49);
        fun("Akki");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String a){
        System.out.println(a);

    }
}
