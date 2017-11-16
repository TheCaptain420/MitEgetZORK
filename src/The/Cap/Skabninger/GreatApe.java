package The.Cap.Skabninger;

import The.Cap.Skabning;

public class GreatApe extends Skabning {
    String navn;
    int Styrke;
    String look;



    public GreatApe(String navn, int styrke, String look) {
        super(navn, styrke, look);
    }

    @Override
    public String getLook() {
        return look;
    }
}