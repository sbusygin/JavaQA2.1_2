public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 5000;

        if (refill > 1000){
            balance += refill;
            balance += (refill/100);
            System.out.println("Ваш баланс с учетом бонусов: " + balance);
        }
        else {
            balance += refill;
            System.out.println("Ваш баланс: " + balance);
        }



    }
}
