// using Array and methods
import java.util.Scanner;
class day3{
        static int calculatetotal(int[]marks){
            int total = 0;
            for(int m : marks){
                total += m;
            }
            return total;
        }
        static double calculateAverage(int total,int subjents){
            return(double) total / subjents;
        }
        static String getgrade(double average){
            if (average>=90){
                return "A";
            }
            else if(average>=75){
                return "B";
            }
            else if(average>=50){
                return "c";
            }
            else{
                return "fail";
            }
        }
    public static void main(String[]arge){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects :");
        for(int i =0 ; i<marks.length;i++){
            marks[i]  = sc.nextInt();
        }
        int total = calculatetotal(marks);
        double average = calculateAverage(total,marks.length);
        String grade = getgrade(average);
        System.out.println("Total Marks :" + total);
        System.out.println("Average :" + average);
        System.out.println("Grade :" + grade);
    }
}