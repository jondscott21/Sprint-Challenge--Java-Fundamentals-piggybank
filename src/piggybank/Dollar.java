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
            // System.out.println(total + " Quarters(s)");
            // System.out.println(val);
            if (val > getTotalValue())
            {
                System.out.println(total + " Dollar(s)");
                System.out.println(val);
                val = val - value;
            } else
            {
                break;
            }
        }
        System.out.println("sub amount" + val);
        return val;
    }
}