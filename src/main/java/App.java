public class App {

    static  String global = "global variable";

    public static void main(String[] args){
//        String str;
//        str = "Data Type";

        String str = "Data Type";
        System.out.println(str);
        System.out.println(global);

        sum();

        final double PI = 3.14;
        // PI = 5; ko dc phép đổi giá trị của hằng số
        System.out.println(PI);
        System.out.println("name\tDOB");

        short s =10; // -32768 -> 32767
        int i = 100; // -2^31 -> 2^31-1
        long l = 1000000000; // -2^63 -> 2^63-1
        long l2 = 100L; // đây là số 100 nhưng kiểu long nên để chữ L vào

        float f = 3.1f;
        double d = 5.7d;

        char c = 'a';
        char c2 = '5';
        char c3 = 65;// vị trí của kỳ tự 65 trong bảng mã 'A'

        boolean b1 = true;
        boolean b2 = false;

        Integer ref_i = 100; // biến tham chiếu, nhưng thay đổi trong hàm nó đều lưu lại

        int a = 100;
        int b =100;
        System.out.println("a = " + a + ",b=" + b);
        swap(a,b);

        Season se = Season.SUMMER;
        System.out.println(se.getValue());

        SimpleSeason sse = SimpleSeason.WINTER;
        System.out.println(sse);
    }

    static void swap (int a, int b){
        int tmp = a;
        a =b ;
        b =tmp ;

    }




    public static void sum(){
        System.out.println(global);
    }
}
