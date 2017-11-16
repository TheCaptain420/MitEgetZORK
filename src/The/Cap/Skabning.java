package The.Cap;

public class Skabning {
    String navn;
    int styrke;
    public String look = "No creatures to be seen!";

    public Skabning(String navn, int styrke, String look){
        this.navn= navn;
        this.styrke = styrke;
        this.look= look;
    }

    public int getStyrke() {
        return styrke;
    }

    public String getLook() {
        return look;
    }

    void skabningdead(){
        this.styrke=0;
        this.look ="In front of you, you see a dead creature!";
    }
}
