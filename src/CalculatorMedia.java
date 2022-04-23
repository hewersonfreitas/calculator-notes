public class CalculatorMedia {
    public float getSum(float notes[]) {
        float sum = 0;
        for (int note = 0; note < notes.length; note++) {
            sum += notes[note];
        }
        return sum;
    }

    public float getMedia(float sum, float totalNotes) {
        return sum / totalNotes;
    }
}
