package piggybank;

public class Quarter extends Money
{
    private double value = 0.25;
    private int total = 1;

    public Quarter()
    {
    }

    public Quarter(int total)
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
            return total + " Quarter";
        } else
        {
            return total + " Quarters";
        }
    }

    @Override
    double getTotalValue() 
    {
        return value * total;
    }
}