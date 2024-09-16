package piggybank;

public abstract class Money
{
    abstract double getValue();
    abstract String printTotal();
    abstract int getTotal();
    abstract double getTotalValue();
    abstract double removeTotalValue(double val);

    public double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}