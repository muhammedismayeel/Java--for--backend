// day4 student management system
// using class and object and constuructor
import java.util.Scanner;
class student{
    String name;
    int rollno;
    int []marks;

    student(String name,int rollno,int []marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    int calculatetotal(){
        int total = 0;
        for(int m : marks){
            total += m ;
        }
        return total;
    }

    double calculateAverage(){
        return(double)calculatetotal()/marks.length;
    }

    String getgrade(){
        double avg = calculateAverage();
        if(avg >=90){
            return "A";
        }
        if(avg >=75){
            return "B";
        }
        if(avg >=50){
            return "C";
        }
        else{
            return "fail";
        }
    }

    void displaydetails(){
        System.out.println("\n =====Student Details");
        System.out.println("Name :"+ name);
        System.out.println("Roll Number :"+ rollno);
        System.out.println("Total marks :"+ calculatetotal());
        System.out.println("Average :"+ calculateAverage());
        System.out.println("Grade :"+ getgrade());
    }
}

class day4{
    public static void main(String[]arge){
        Scanner scan = new Scanner(System.in);
        for(int i = 1;i<=3;i++){
            System.out.println("Enter student Name : ");
            String name = scan.nextLine();
            System.out.println("Enter Roll number : ");
            int rollno = scan.nextInt();
            int[]marks = new int[3];
            System.out.println("Enter 3 subject marks :");
            for(int j = 0 ; j < 3 ; j++){
                marks[j] = scan.nextInt();
            }
            scan.nextLine();
            student s = new student(name,rollno,marks);
            s.displaydetails();
        }
    }
}