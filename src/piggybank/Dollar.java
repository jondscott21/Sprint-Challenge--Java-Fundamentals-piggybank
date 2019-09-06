package piggybank;

public class Dollar extends Money
{
    private double value = 1.00;
    private int total = 1;

    public Dollar()
    {
    }

    public Dollar(int total)
    {
        this.total = total;
    }

    @Override
    public double getValue() 
    {
        return value;
    }

    @Override
    public String getTotal() 
    {
        return "$" + total;
    }

    @Override
    double getTotalValue() 
    {
        return value * total;
    }
}