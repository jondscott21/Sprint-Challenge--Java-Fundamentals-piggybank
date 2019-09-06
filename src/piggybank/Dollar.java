package piggybank;

public class Dollar extends Money
{
    private int value = 1;
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
    public String printTotal() 
    {
        return "$" + total;
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