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
    public String printTotal() 
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