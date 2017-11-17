package The.Cap;

public class Felt {
    String beskrivelse;
    Genstand genstand= new Genstand("No objects to see..."," ", 0);
    Skabning skabning= new Skabning("No creatures to see...",0," ", " ") ;



    public Felt(){
        beskrivelse = "You are in a dense forest, i would head back where you came from.";
    }


    public String getBeskrivelse() {
        return beskrivelse;
    }
    void setBeskrivelse(String beskrivelse){this.beskrivelse= beskrivelse;}

}
