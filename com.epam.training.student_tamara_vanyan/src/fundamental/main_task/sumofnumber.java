package main_task;

public class sumofnumber {
    public static void main(String[] args) {
        int sum = 0;
        int multipl = 1;
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            multipl = multipl * Integer.parseInt(args[i]);
        }
        System.out.println("sum is " + sum);
        System.out.println("multipl is " + multipl);
    }
}
