package main_task;

public class reversedArgoment {
    public static void main(String[] args) {
        int insertElement = args.length;
        for(int i=0; i<insertElement; insertElement--){
            System.out.print(args[insertElement - 1] + " ");
        }
    }
}
