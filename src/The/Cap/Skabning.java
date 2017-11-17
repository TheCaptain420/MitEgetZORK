package The.Cap;

import static The.Cap.Player.point;

public class Skabning {
    String navn;
    int styrke;
    public String look = "No creatures to be seen!";
    String PickUP=" ";


    public Skabning(String navn, int styrke, String look, String PickUP){
        this.navn= navn;
        this.styrke = styrke;
        this.look= look;
        this.PickUP = PickUP;
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
