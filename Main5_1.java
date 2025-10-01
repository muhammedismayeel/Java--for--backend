import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class Main5_1{
    public static void main(String[]arge){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
    }
}