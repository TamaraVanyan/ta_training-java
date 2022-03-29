package main_task;

public class mounthNumber {
    public static void main(String[] args) {
        String [] mountArr = { "January" , "February" , "March" , "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December" };
        int index = Integer.parseInt(args[0]) - 1;
        for (int i=0; i<12; i++){
            if(i == index) {
                System.out.println("number " + args[0] + " mounth is " + mountArr[index]);
            }
        }
    }
}
