package E8_2;

public class Coin {

    private String coin_name;
    private double coin_value;
    public void coin(double value,String name)
    {
        coin_name=name;
        coin_value=value;
    }
    public double getCoin_value()
    {
        return coin_value;
    }
    public String getCoin_name()
    {
        return coin_name;
    }


}
