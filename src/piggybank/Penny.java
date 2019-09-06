package piggybank;

public class Penny extends Money
{
    private double value = 0.01;
    private int total = 1;

    public Penny()
    {
    }

    public Penny(int total)
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
        if (total == 1)
        {
            return total + " Penny";
        } else
        {
            return total + " Pennies";
        }
    }

    @Override
    double getTotalValue() 
    {
        return value * total;
    }
}