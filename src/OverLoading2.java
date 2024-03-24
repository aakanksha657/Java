public class OverLoading2 {
    public static void main(String[] args) {
        sum(3,4,10);

    }
    static void sum(int a,int b){ // if 2 arg passed to sum() this executes
        int add=a+b;
        System.out.println(add);

    }
    static void sum(int a,int b,int c){ // if 3 arg passed to sum() this executes
        int add=a+b+c;
        System.out.println(add);
    }

}
