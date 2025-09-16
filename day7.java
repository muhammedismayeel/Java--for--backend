import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class Student{
     String name();
     int age();
     int rollno();
    public  Student(String name,int age,int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    public String getname(){
    return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getage(){
        return age;
    }
    public void Setage(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age should be 18or above");
        }this.age = age;
    }
    public void displayDetails(){
        System.out.println("\n==================");
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Roll number : " + rollno);
    }
}
class day7{
    public static void main(String[]arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter Roll number :");
        int rollno = sc.nextInt();
        int age = 0;
        boolean validage = false;
        while(!validage){
            try{
                System.out.println("Enter Age (18 or above) :");
                age = sc.nextInt();
                Student student = new Student(name,age,rollno);
                student.Setage(age);
                student.displayDetails();
                validage = true;
            }
            catch(InvalidAgeException e){
                System.out.println("Error :", e.getmessage());
                sc.nextLine();
            }
            catch(Exception e){
                System.out.println("Invaild input! Please enter a vaild age");
                sc.nextLine();
            }
        }
    }
}