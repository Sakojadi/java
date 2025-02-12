import java.util.Arrays;
import java.util.HashMap;

public class Tests {
    public static void main(String[] args){
//        reverse();
        calc();
    }
//    public static void reverse() {
//        char[] arr = {'c', 'b', 'd', 't', 'c', 'd'};
//        int len = arr.length - 1;
//        char[] rev = new char[len + 1];
//        for (int i = 0; i <= len; i++) {
//            rev[i] = arr[len - i];
//        }
//        System.out.println(Arrays.toString(rev));
//        HashMap<Character, Integer> count = new HashMap<>();
//        for (char i : arr) {
//            count.put(i, count.getOrDefault(i, 0) + 1);
//        }
//        System.out.println(count);
//    }

    public static void calc(){
        int num1 = 5;
        double num2 = 5.6;
        double result = num1+num2;
        System.out.println(result);
    }

}
