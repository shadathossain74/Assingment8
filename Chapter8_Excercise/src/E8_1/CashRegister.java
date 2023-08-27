package E8_1;

import E8_1.Coin;

public class CashRegister {
    public double purchase;
    public double payment;
   public CashRegister()
    {
        purchase=0;
        payment=0;
    }
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


}
