public class StringArg {
    public static void main(String[] args) {
        String message=MyGreet("Aakanksha");
        System.out.println(message);

    }

    static String MyGreet(String name) {
        String msg="hello "+name;
        return msg;
    }

}
