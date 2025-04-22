package variable;

public class Var6 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        InnerVar6.main2(args);
    }
}

class InnerVar6 {
    public static void main2(String[] args) {
        int aa = 1;
        System.out.println(aa);
    }

}