public class GetMinorMaximum {
      
    public float getMinorNote(float notes[]) {
        float minor = 0;
        for (int note = 0; note < notes.length; note++) {
            if (note == 0 && minor == 0) {
                minor = notes[0];
            }

            if (minor > notes[note]) {
                minor = notes[note];
            }
        }

        return minor;
    }

    public float getMaximumNote(float notes[]) {
        float maximum = 0;
        for (int note = 0; note < notes.length; note++) {
            if (note == 0 && maximum == 0) {
                maximum = notes[0];
            }

            if (maximum < notes[note]) {
                maximum = notes[note];
            }
        }

        return maximum;
    }
}
