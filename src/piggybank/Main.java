package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main 
{
    public static void main(String[] args) {

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        
        ArrayList<Money> piggybank = new ArrayList<>();

        piggybank.add(new Quarter());
        piggybank.add(new Dime());
        piggybank.add(new Dollar(5));
        piggybank.add(new Nickel(3));
        piggybank.add(new Dime(7));
        piggybank.add(new Dollar());
        piggybank.add(new Penny(10));

        piggybank.forEach((m) -> System.out.println(m.getTotal()));
        piggybank.forEach((m) -> System.out.println("The piggy bank holds " + fp.format(m.getTotalValue())));
    }
}