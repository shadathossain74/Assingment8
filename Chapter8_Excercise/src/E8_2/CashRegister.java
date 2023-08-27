package E8_2;


public class CashRegister {
    public double purchase;
    public double payment;

    public void recordpurchases(double amount)
    {
        purchase=purchase+amount;
    }
    public void receive_payment(int numberofcoin, Coin coinname)
    {
        payment=payment+numberofcoin*coinname.getCoin_value();
    }
    public double getPurchase()
    {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }
    public double getchange()
    {
        return payment-purchase;
    }
    public int givechange(Coin coinname)
    {
        double change=payment-purchase;
        int numberofcoin=(int)(change/ coinname.getCoin_value());
        return numberofcoin;

    }
}

