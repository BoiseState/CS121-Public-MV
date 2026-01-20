import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Demo String formatting classes and printf.
 * @author mvail
 */
public class FormattingStrings {
    public static void main(String[] args) {
        double oneHundredth = 0.01;
        double fiveHundredths = 0.05;
        double nineHundredths = 0.09;
        double zero = 0.0;
        double oneAndOneHundredth = 1.011;

        DecimalFormat showTenthsNoLeading = new DecimalFormat("#.0");
        DecimalFormat optTenthsNoLeading = new DecimalFormat("#.#");
        DecimalFormat showTenthsWithLeading = new DecimalFormat("0.0");
        DecimalFormat optTenthsWithLeading = new DecimalFormat("0.#");

        System.out.println("0.01 with showTenthsNoLeading: " + showTenthsNoLeading.format(oneHundredth));
        System.out.println("0.05 with showTenthsNoLeading: " + showTenthsNoLeading.format(fiveHundredths));
        System.out.println("0.09 with showTenthsNoLeading: " + showTenthsNoLeading.format(nineHundredths));
        System.out.println("0.0 with showTenthsNoLeading: " + showTenthsNoLeading.format(zero));
        System.out.println("1.01 with showTenthsNoLeading: " + showTenthsNoLeading.format(oneAndOneHundredth));
        System.out.println();
        System.out.println("0.01 with optTenthsNoLeading: " + optTenthsNoLeading.format(oneHundredth));
        System.out.println("0.05 with optTenthsNoLeading: " + optTenthsNoLeading.format(fiveHundredths));
        System.out.println("0.09 with optTenthsNoLeading: " + optTenthsNoLeading.format(nineHundredths));
        System.out.println("0.0 with optTenthsNoLeading: " + optTenthsNoLeading.format(zero));
        System.out.println("1.01 with optTenthsNoLeading: " + optTenthsNoLeading.format(oneAndOneHundredth));
        System.out.println();
        System.out.println("0.01 with showTenthsWithLeading: " + showTenthsWithLeading.format(oneHundredth));
        System.out.println("0.05 with showTenthsWithLeading: " + showTenthsWithLeading.format(fiveHundredths));
        System.out.println("0.09 with showTenthsWithLeading: " + showTenthsWithLeading.format(nineHundredths));
        System.out.println("0.0 with showTenthsWithLeading: " + showTenthsWithLeading.format(zero));
        System.out.println("1.01 with showTenthsWithLeading: " + showTenthsWithLeading.format(oneAndOneHundredth));
        System.out.println();
        System.out.println("0.01 with optTenthsWithLeading: " + optTenthsWithLeading.format(oneHundredth));
        System.out.println("0.05 with optTenthsWithLeading: " + optTenthsWithLeading.format(fiveHundredths));
        System.out.println("0.09 with optTenthsWithLeading: " + optTenthsWithLeading.format(nineHundredths));
        System.out.println("0.0 with optTenthsWithLeading: " + optTenthsWithLeading.format(zero));
        System.out.println("1.01 with optTenthsWithLeading: " + optTenthsWithLeading.format(oneAndOneHundredth));
        System.out.println();

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.println("0.01 with currencyFormat: " + currencyFormat.format(oneHundredth));
        System.out.println("0.05 with currencyFormat: " + currencyFormat.format(fiveHundredths));
        System.out.println("0.09 with currencyFormat: " + currencyFormat.format(nineHundredths));
        System.out.println("0.0 with currencyFormat: " + currencyFormat.format(zero));
        System.out.println("1.01 with currencyFormat: " + currencyFormat.format(oneAndOneHundredth));
        System.out.println();

        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        System.out.println("0.01 with percentFormat: " + percentFormat.format(oneHundredth));
        System.out.println("0.05 with percentFormat: " + percentFormat.format(fiveHundredths));
        System.out.println("0.09 with percentFormat: " + percentFormat.format(nineHundredths));
        System.out.println("0.0 with percentFormat: " + percentFormat.format(zero));
        System.out.println("1.01 with percentFormat: " + percentFormat.format(oneAndOneHundredth));
        System.out.println();

        System.out.printf("0.01 with printf .1f: %10.1f\n", oneHundredth);
        System.out.printf("0.05 with printf .1f: %10.1f\n", fiveHundredths);

        System.out.println(String.format("%10.1f", 0.01));
        System.out.println(String.format("%10.1f", 0.05));
    }
}
