public class Shadowing {
    static int x=49;
    public static void main(String[] args) {
        System.out.println(x);
        int x=16;
        System.out.println(x);// 49 is shadowed
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
