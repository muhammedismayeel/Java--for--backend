import java.util.Scanner;
class day2{
    public static void main (String[]arge){
        //entering name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scan.nextLine();
        // entering roll number
        System.out.println("Enter you roll number");
        int rollno = scan.nextInt();
        //entering marks
        int[]marks = new int [5];
        int total =0; 
        for(int i=0;i<5;i++){
            System.out.println("Enter your marks"+(i+1)+":");
            marks[i]=scan.nextInt();
            total += marks[i];
        }
        //calculate average
        double average = total/ 5.0;
        String grade;
        //dicide grands
        if(average>=90){
            grade = "A";
        }
        else if(average>=75){
            grade = "B";
        }
        else if(average>=50){
            grade = "C";
        }
        else{
            grade = "fail";
        }
        //Display result
        System.out.println("\n ==== student result ====");
        System.out.println("name :" + name);
        System.out.println("Roll number :"+rollno);
        System.out.println("Total Marks : "+total);
        System.out.println("Average :"+average);
        System.out.println("Grade : "+ grade);

        // switch for grade
        System.out.println("\n Choose an option :");
        System.out.println("1.See grade meaning");
        System.out.println("2.exit");
        int choose = scan.nextInt();
        switch(choose){
            case 1 : switch(grade){
                case "A" : System.out.println("Excellent");
                break;
                case "B" :System.out.println("Good");
                break;
                case "c" : System.out.println("Average");
                break;
                case "fail" :System.out.println("needs improvement");
                break;
            }
            break;
            case 2 : System.out.println("Exit");
            break;
            default : System.out.println("invalid choice!");
        }
    }
}