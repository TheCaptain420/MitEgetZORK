package The.Cap.Skabninger;

import The.Cap.Skabning;

public class GreatApe extends Skabning {
    String navn= "ye";
    int Styrke = 5;
    String look= "look";
    String PickUP=" ";



    public GreatApe(String navn, int styrke, String look, String PickUP) {
        super(navn, styrke, look, PickUP);
    }

    @Override
    public String getLook() {
        return look;
    }
}