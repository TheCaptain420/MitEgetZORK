package The.Cap;

import The.Cap.Skabninger.*;

public class Kort {
    public Felt[][] kort = new Felt[5][5]; // 5*5


    public Kort(){
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                Felt feltet = new Felt();
                kort[x][y] = feltet;//fylder alle felter op med class Felt
            }
        }
        //Tilføjer skabning/Genstande på kortet herunder
        Troll testTroll = new Troll("TestTroll", 5,"In front of you, you see a troll!");
        kort[1][1].skabning = testTroll;

        GreatApe testApe = new GreatApe("TestApe",6,"In front of you, you see a GreatApe!");
        kort[1][2].skabning = testApe;



    }

    String look(int x, int y){
        return kort[x][y].beskrivelse + kort[x][y].skabning.look;

    }


}
