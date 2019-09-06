package piggybank;

public class Dime extends Money
{
    private double value = 0.10;
    private int total = 1;

    public Dime()
    {
    }
    public Dime(int total)
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
            return total + " Dime";
        } else
        {
            return total + " Dimes";
        }
    }

    @Override
    double getTotalValue() 
    {
        return value * total;
    }
}