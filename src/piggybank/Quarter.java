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
    public String printTotal() 
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
                System.out.println(total + " Quarters(s)");
               val = val - getValue();
            }
        }
        System.out.println("sub amount" + val);
        return val;
    }
}