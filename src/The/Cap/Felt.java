package The.Cap;

public class Felt {
    String beskrivelse;
    Genstand genstand= new Genstand("No objects to see..."," ", 0);
    Skabning skabning= new Skabning("No creatures to see...",0," ") ;



    public Felt(){
        beskrivelse = "You are in a forest. ";
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
}
