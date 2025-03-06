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
        HashMap <Integer, String> hash = new HashMap <Integer, String>();
        hash.put(1,"lol");
        hash.put(9, "pop");
        hash.put(2, "kok");
        System.out.println(hash);
        System.out.println(hash.get(1));
    }

}
