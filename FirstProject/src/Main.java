//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.print("hello\nkak dela");
        System.out.print("world" + "\n");
        System.out.println("\u2122");
        final int r = 30;
        final int t;
        t = 20;
//        r = 10; cant do this cuz final is not changable it stays as 30, and the t changed because i didnt declare its num

        int x = 12;
        int y = 2*x;
        System.out.println(y);
        int z = (y-x)%5;
        System.out.println(z);
        final float pi = 3.1415F;
        float f = pi/0.62F;
        System.out.println(f);

        int i = 35, j = 44;
        System.out.println("The value of i is " + i + " The value of j is " + j);

        String str = " ait";
        System.out.println(str.toUpperCase());
        System.out.println(str.endsWith("!"));
        System.out.println(str.trim());

        String u = str + " hell";
        System.out.println(u);

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        if (s1==s2)
            System.out.println("Yayy "+s1+" and "+ s2+ " are equal");
        if (s2==s3)
            System.out.println("Yayy "+s2+" and "+ s3+ " are equal");

        Point p1 = new Point(1,1);
        Point p2 = new Point(2, 0);
        p1 = p2;
        p1.x = -1;
        System.out.println(p2);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hi"));

        Point pp = new Point(4,4);
        Point ppp = new Point(4,4);
        if (pp==ppp)
            System.out.println("hhh");
        if (pp.equals(ppp))
            System.out.println("ggg");
        pp = ppp;
        if (pp==ppp)
        System.out.println("hhh");


    }
}
