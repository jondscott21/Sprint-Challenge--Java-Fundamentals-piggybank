package piggybank;

public class Nickel extends Money
{
    private double value = 0.05;
    private int total = 1;

    public Nickel()
    {
    }

    public Nickel(int total)
    {
        this.total = total;
    }

    @Override
    public double getValue() 
    {
        return value;
    }

    @Override
    public String printTotal() 
    {
        if (total == 1)
        {
            return total + " Nickel";
        } else
        {
            return total + " Nickels";
        }
    }

    @Override
    public int getTotal() {
        
        return total;
    }

    @Override
    double getTotalValue() 
    {
        return value * total;
    }

    @Override
    double removeTotalValue(double val)
    {
        for (int i = 0; i < total; total--) {
            if (val > getTotalValue())
            {
               val = val - getValue();
            }
        }
        return val;
    }
}