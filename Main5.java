import java.io.FileWriter;
import java.io.IOException;
public class Main5{
    public static void main(String[]arge){
        try{
        FileWriter Writer = new FileWriter("Student.txt");
        Writer.write("ID : 101 , Name : aslah");
        Writer.write("ID : 102 , Name : ismayeel");
        Writer.close();
        System.out.println("Data Added");
        }
        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}