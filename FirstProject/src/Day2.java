import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){
        double d = 3.67;
        int a = 5;
        d = a; //implicit casting
        d = 3.9;
        a = (int) d;
        System.out.println(a);

        if(a>30){
            System.out.println("Hot Day");
        }
        else{
            System.out.println("Not Hot Day");
        }

        while(a>0){
            System.out.println("looping in a while");
            a--;
        }

//        alternetavely int i;
        //for(i=0;i<10;i++), in this case we can live even after the looping is finished,
        // the below can only use this in the cycle

        for(int i=0;i<10; i++){
            System.out.println("i=  "+i);
        }

        for(int i = 0; i<13; i++){
            switch(i){
                case 1:
                    System.out.println("On vacation");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Studying");
                    break;
                case 6:
                    System.out.println("Case 6");
                    break;
                case 11:
                    System.out.println("Not on vacation");
                    break;
                case 12:
                    System.out.println("Studying");
                    break;
                default:
                    System.out.println("Vacation");
            }
        }

        int[] nums = new int[10];
        int i;
        for(i=0; i< nums.length; i++){
            nums[i] = i;
        }
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        for(int x:nums){
            nums[x]=i++;
            if(nums[x]==nums[nums.length-1])
                System.out.println(x);
        }
        System.out.println(Arrays.toString(nums));
//        for(int x:nums){
//            x=i++;
//            if(x-1==nums[nums.length-1])
//                System.out.println(x);
//        }

        int n = 3;
        int m = 4;

        int[][] matrix = new int[n][m];
        for(i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j] = i+j;
            }
        System.out.println(Arrays.deepToString(matrix));
        double[] darr ={1.0, 2.0, 3.0};
        int[] iarr = {1,2,3,4};

//        command line arguments
//        System.out.println("First parameter "+ args[0]);
//        System.out.println("Second parameter "+ args[1]);

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your GPA: ");
        double gpa = scan.nextDouble();

        System.out.println("Hi " + name);
        if(gpa>=3.5){
            System.out.println("Your are a High Honor Student ");
        }
        else{
            System.out.println("You're a regular student ");
        }

         */
        System.out.println(mortgageCalculator());
    }

    public static double mortgageCalculator() {
        double p, rate, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        p = sc.nextInt();
        System.out.println("Enter interest rate: ");
        rate = sc.nextDouble() / 12;
        System.out.println("Enter number of months: ");
        num = sc.nextInt();

        double mort = (p * rate * Math.pow((1 + rate), num)) / (Math.pow((1 + rate), num) - 1);
        System.out.println("The monthly mortage payement: " + mort);
        return mort;
    }
}
