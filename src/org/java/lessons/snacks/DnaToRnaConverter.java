package org.java.lessons.snacks;

/*
* An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.

Given a DNA string t
 corresponding to a coding strand, its transcribed RNA string u
 is formed by replacing all occurrences of 'T' in t
 with 'U' in u


Sample Dataset
GATGGAACTTGACTACGTAAATT
Sample Output
GAUGGAACUUGACUACGUAAAUU
*/
public class DnaToRnaConverter {

  public static void main(String[] args) {
    // DNA da convertire
    String dna = "GATGGAACTTGACTACGTAAATT";
    // corrispondente RNA
    String rna;
    // 1) trasformo la stringa dna in un array di char
    char[] dnaCharArray = dna.toCharArray();
    // variabile per contenere i caratteri di RNA
    char[] rnaCharArray = new char[dnaCharArray.length];
    // 2) itero sull'array di caratteri
    for (int i = 0; i < dnaCharArray.length; i++) {
      // ad ogni iterazione
      // se il carattere è T lo trasformo in U
      if (dnaCharArray[i] == 'T') {
        rnaCharArray[i] = 'U';
      } else {
        // altrimenti lo copio com'è
        rnaCharArray[i] = dnaCharArray[i];
      }
    }

    // trasformo l'array di char di RNA in una string
    rna = String.valueOf(rnaCharArray);
    System.out.println(dna);
    System.out.println(rna);
  }
}
