package The.Cap.Skabninger;

import The.Cap.Skabning;

public class Troll extends Skabning {
    String navn;
    int Styrke;
    String look;
    String PickUP = " I think he dropped something? Try to pick it up.";


    public Troll(String navn, int styrke, String look, String PickUP) {
        super(navn, styrke, look, PickUP);
    }

    @Override
    public String getLook() {
        return look;
    }
}
