package The.Cap.Skabninger;

import The.Cap.Skabning;

public class Troll extends Skabning {
    String navn;
    int Styrke;
    String look;



    public Troll(String navn, int styrke, String look) {
        super(navn, styrke, look);
    }

    @Override
    public String getLook() {
        return look;
    }
}
