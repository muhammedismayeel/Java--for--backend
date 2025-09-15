abstract class payment{
    double amount;
    payment(double amount){
        this.amount = amount;
    }
    abstract void makePayment();
    void showAmount(){
        System.out.println("Payment amount :" + amount);
    }
}
interface Refundable{
   void refund(double refundAmount);
}
class Creditcardpayment extends payment
    implements Refundable{
        Creditcardpayment(double amount){
            super(amount);
        }
        void makePayment(){
            System.out.println("Paid "+amount+" Using Credit card.");
        }
        public void refund(double refundAmount){
            System.out.println("Refunded "+refundAmount+" to Credit card.");
        }
    }
class UPIPayment extends payment
    implements Refundable{
        UPIPayment(double amount){
            super(amount);
        }
        void makePayment(){
            System.out.println("Paid "+amount+" using UPI");
        }
    
    public void refund(double refundAmount){
        System.out.println("Refunded "+refundAmount +" to UPI");
        }
    }
public class day6{
    public static void main(String[]arge){
        payment p1 = new Creditcardpayment(5000);
        p1.showAmount();
        p1.makePayment();
        ((Refundable)p1).refund(1000);
        System.out.println("-------------------------");
        payment p2 = new UPIPayment(2000);
        p2.showAmount();
        p2.makePayment();
        ((Refundable)p2).refund(500);
    }
}    
    