package E8_2;
public class CashRegistorRunner {
    public static void main(String[] args) {

        Coin Dollar= new Coin();
        Dollar.coin(1,"dollar");
        Coin Quarter=new Coin();
        Quarter.coin(.25,"quarter");
        Coin Dime=new Coin();
        Dime.coin(.1,"dime");
        Coin Nickel=new Coin();
        Nickel.coin(.05,"nickel");
        CashRegister customer1=new CashRegister();
        customer1.recordpurchases(3.5);
        customer1.recordpurchases(1.4);
        customer1.recordpurchases(.78);
        customer1.recordpurchases(3.01);
        customer1.receive_payment(6,Dollar);
        customer1.receive_payment(7,Dime);
        customer1.receive_payment(9,Quarter);
        customer1.receive_payment(10,Nickel);
        System.out.printf("Total amount of purchases:%.2f",customer1.getPurchase());
        System.out.println();
        System.out.println("Total amount of receive money:"+customer1.getPayment());
        System.out.printf("Amount of change: %.2f",customer1.getchange());
        System.out.println();
        System.out.println("Give the change by quarter: "+customer1.givechange(Quarter));
        System.out.println("Give the change by dime: "+customer1.givechange(Dime));
        System.out.println("Give the change by nickel: "+customer1.givechange(Nickel));


    }
}
