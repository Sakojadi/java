import java.util.Arrays;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        arrayStat();
        polindromCheck();
    }
    public static void arrayStat(){
        int sum = 0, size, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, max2 = max, min2 = min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of ints in array: ");
        size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size+ " integer: ");
        for(int i=0; i<size; i++) {
            nums[i] = scan.nextInt();
            sum+=nums[i];
            if (nums[i]>max){
                max2 = max;
                max = nums[i];
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
            if(nums[i]<min){
                min2 = min;
                min = nums[i];
            }
            else if(nums[i]<min2){
                min2 = nums[i];
            }
        }
        double av = (double) sum/size;
        System.out.println(Arrays.toString(nums));
        System.out.println("Sum: "+ sum);
        System.out.println("Average: " + av);
        System.out.println("Max: "+ max);
        System.out.println("Max2: "+ max2);
        System.out.println("Min: "+min);
        System.out.println("Min2: "+min2);
    }
    public static void polindromCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string or an int: ");
        String input = scan.nextLine();
        input = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        String[] cleaned = input.split("");
        int is = 0;
        int len = input.length();
        for(int i= 0; i<len/2; i++){
            len--;
            if(cleaned[i].equals(cleaned[len])){
                continue;
            }
            else{
                is = 1;
                break;
            }
        }
        if(is==1){
            System.out.println("Is not a polindrom T-T");
        }
        else{
            System.out.println("Yay a polindrom!");
        }
    }
}
