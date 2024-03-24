public class LoopScope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        for(int i=0;i<=4;i++){
            System.out.println(i);
            System.out.println(a); //can use outside variables inside

        }
        //System.out.println(i); //cant use inside variables outside

    }
}
