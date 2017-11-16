package The.Cap;

public class Felt {
    String beskrivelse;
    Genstand[] genstand;
    Skabning skabning;


    public Felt(){
        beskrivelse = "You are in a forest. ";
        genstand = new Genstand[3];//maks være 3 genstande på et felt
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
}
