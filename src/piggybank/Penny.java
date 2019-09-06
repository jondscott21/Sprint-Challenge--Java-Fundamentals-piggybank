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
    public String printTotal() 
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
        for (int i = 0; i < total; total -= 1) {
            if (val >= value)
            {
                val = val - value;
                val = roundAvoid(val, 2);
            } else
            {
                break;
            }
        }
        val = roundAvoid(val, 2);
        return val;
    }
}