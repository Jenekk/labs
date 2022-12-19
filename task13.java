public class task13 {
    public static void main(String[] args){
        Test2 obj = new Test2();
        System.out.println("a = " + obj.get_a());
        System.out.println("b = " + obj.get_b());
        System.out.println(" ");
        obj.set_a(67); //obj.a = 67;
        obj.set_b(11); //obj.b = 11;
        System.out.println("a = " + obj.get_a());
        System.out.println("b = " + obj.get_b());
        System.out.println(" ");
        obj = new Test2(4, 3);
        System.out.println("a = " + obj.get_a());
        System.out.println("b = " + obj.get_b());
        System.out.println(" ");
    }
}


class Test2 {
    private int a, b;
    public Test2() {
        a = 0;
        b = 1000000;
    }
    public Test2(int a_, int b_) {
        a = a_;
        b = b_;
    }
    public int get_a() {
        return a;
    }
    public int get_b() {
        return b;
    }
    public void set_a(int a_) {
        a = a_;
    }
    public void set_b(int b_) {
        b = b_;
    }
}
