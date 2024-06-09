import java.util.Arrays;

public class VarArgs {

    // variable length arguments
    public static void main(String[] args) {
        fun();
        fun(3,5, 5,2,4,67,8,2,7,4,9,2);
        multiple(2, 6, "Shams", "Jamiu", "Imran");

        demo(2, 4, 5, 9, 6, 3);
        demo("shams", "Jamiu", "Imran");
    }
    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void demo(String ...x){
        System.out.println(Arrays.toString(x));
    }

    static void fun(int... a) {
        System.out.println(Arrays.toString(a));
    }
    static void multiple(int  a, int b, String... c) {}
}
