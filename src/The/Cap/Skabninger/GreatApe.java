package The.Cap.Skabninger;

import The.Cap.Skabning;

public class GreatApe extends Skabning {
    String navn= "ye";
    int Styrke = 5;
    String look= "look";



    public GreatApe(String navn, int styrke, String look) {
        super(navn, styrke, look);
    }

    @Override
    public String getLook() {
        return look;
    }
}