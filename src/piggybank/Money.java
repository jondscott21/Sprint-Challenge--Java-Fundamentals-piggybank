package piggybank;

public abstract class Money
{
    abstract double getValue();
    abstract String printTotal();
    abstract int getTotal();
    abstract double getTotalValue();
    abstract double removeTotalValue(double val);
}