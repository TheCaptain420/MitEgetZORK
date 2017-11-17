package The.Cap;

import The.Cap.Genstande.Swords;
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
        Troll testTroll = new Troll("TestTroll", 4,"In front of you, you see a troll. His power is 4!");
        kort[1][1].skabning = testTroll;

        GreatApe testApe = new GreatApe("TestApe",8,"In front of you, you see a GreatApe. His power is 8!");
        kort[1][2].skabning = testApe;

        Swords dawnBreaker = new Swords("DawnBreaker","A mighty sword!",10);

        Swords vilkasSword = new Swords("Vilkas's Sword", "A unique Skyforge Steel Sword lays infront of you!",5);
        int vilkaSwordPosX=2,vilkaSwordPosY=2;
        kort[vilkaSwordPosX][vilkaSwordPosY].genstand = vilkasSword;
    }

    String look(int x, int y){
        return kort[x][y].getBeskrivelse()+ kort[x][y].skabning.look ;

    }


}
