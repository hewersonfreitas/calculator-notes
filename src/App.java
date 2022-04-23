import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /**
         * Variable format number decimals
         */
        NumberFormat numberFormat = new DecimalFormat("#0.00");

        /**
         * Variable instance Scanner
         */
        Scanner readScanner = new Scanner(System.in);

        /**
         * Create intance read notes
         */

        ReadNotes readNotes = new ReadNotes();

        /**
         * Create instace calculator media
         */
        CalculatorMedia calculator = new CalculatorMedia();

        /**
         * Create instace minor and maximum
         */
        GetMinorMaximum minorMaximum = new GetMinorMaximum();

        /**
         * Get number of notes
         */
        System.out.println("Digite o total de notas: ");
        int totalNotes = readScanner.nextInt();

        System.out.printf("Digite %s numeros: \n", totalNotes);
        float[] notes = readNotes.readNotes(totalNotes, readScanner);

        /**
         * Sum notes
         */
        float sum = calculator.getSum(notes);

        /**
         * Calc media notes
         */

        float media = calculator.getMedia(sum, totalNotes);

        /**
         * Get minor and maximum
         */

         float minor = minorMaximum.getMinorNote(notes);
         float maximum = minorMaximum.getMaximumNote(notes);

        /**
         * Output note
         */
        System.out.printf("Maximum value: %s\n", numberFormat.format(maximum));
        System.out.printf("Minor value: %s\n", numberFormat.format(minor));
        System.out.printf("Media: %s\n", numberFormat.format(media));
        System.out.printf("Soma: %s\n", numberFormat.format(sum));
    }
}
