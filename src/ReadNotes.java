import java.util.Scanner;

public class ReadNotes {
    public float[] readNotes(int totalNotes, Scanner readScanner){
       
        float notes[] = new float [totalNotes];
        /**
         * Loop scan set input values
         */
        for (int note = 0; note <= totalNotes - 1; note++) {
            notes[note]= readScanner.nextInt();
        }

        return notes;

    }
}
