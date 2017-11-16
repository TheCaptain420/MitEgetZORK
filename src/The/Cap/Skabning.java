package The.Cap;

public class Skabning {
    String navn;
    int styrke;
    String look;

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
}
