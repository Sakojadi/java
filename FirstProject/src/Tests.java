import java.util.*;

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
        PriorityQueue<String> list = new PriorityQueue<>();
        list.add("CCC");
        list.add("BBB");
        list.add("Aaaa");

        System.out.println(list.poll());

    }

}
