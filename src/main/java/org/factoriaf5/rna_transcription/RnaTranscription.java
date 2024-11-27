package org.factoriaf5.rna_transcription;

public class RnaTranscription {
    String transcribe(String dnaStrand) {

        if (dnaStrand == null) {
            return "";
        }

        StringBuilder newDna = new StringBuilder();
        for (char letter : dnaStrand.toCharArray()) {
            switch (letter) {
                case 'G':
                    newDna.append('C');
                    break;
                case 'C':
                    newDna.append('G');
                    break;
                case 'T':
                    newDna.append('A');
                    break;
                case 'A':
                    newDna.append('U');
                    break;
                default:
                    break;
            }
        }

        return dnaStrand.replace(dnaStrand, newDna);
    }

}
