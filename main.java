class BankException extends Exception {
    BankException(String message) {
        super(message);
    }
}
class bankacc{
    int balanc;
    bankacc(int balanc){
        this.balanc = balanc;
    }
    void deposit (int amout) throws BankException{
        if(amout < 0){
            throw new BankException("no negative deposit");
        }
        balanc += amout;
        System.out.println("Depodit amout :" + amout + " new balanc : " + balanc);
    }
    void withraw (int amout) throws BankException{
        if(amout > balanc){
            throw new BankException("enter valid num");
        }
        balanc -= amout;
        System.out.println("Withrew :" + amout + " new balanc : " + balanc);
    }
}
class main{
    public static void main(String[]arge){
        bankacc acc = new bankacc(1000);
        try{
            acc.deposit(500);
            acc.withraw(5000);
        }
        catch(BankException e){
            System.out.println("error message" + e.getMessage());
        }
        try{
            acc.deposit(-500);
        }
        catch(BankException e){
            System.out.println("error message " + e.getMessage());
        }
    }
}