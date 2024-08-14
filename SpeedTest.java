import java.util.*;

public class SpeedTest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = "The best way to predict the future is to invent it";
        System.out.println("Kindly Enter the following sentences to check the speed");
        System.out.println(str);
        
        long start_time = System.currentTimeMillis();

        String str1 = s.nextLine();

        long end_time = System.currentTimeMillis();

        long time_counted = (end_time - start_time)/1000;

        String[] str_arr = str.split(" ");
        String[] str1_arr = str1.split(" ");

        int correct_count = 0;
        int wrong_count = 0;

        for(int i=0;i<Math.min(str_arr.length,str1_arr.length);i++){
            if(str_arr[i].equalsIgnoreCase(str1_arr[i])){
                correct_count++;
            }
            else{
                wrong_count++;
            }
        }
        wrong_count = wrong_count + Math.max(0,str1_arr.length-str_arr.length);

        double speed = (correct_count/(double)time_counted)*60; 

        System.out.println("Time taken : "+time_counted+" sec");
        System.out.println("Correct type : "+correct_count);
        System.out.println("Wrong type : "+wrong_count);
        System.out.println("Result : "+speed+" word per minute");
        System.out.println("Thank You");
        s.close();
    }
}