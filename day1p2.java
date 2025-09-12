import java.util.Scanner;
//even or odd
class day1p2{
    public static void main(String[]arge){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2  ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}