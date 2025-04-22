package variable;

public class Var1 {

    public static void main(String[] args) {
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20

        var1_(null);
    }

    static void var1_(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
