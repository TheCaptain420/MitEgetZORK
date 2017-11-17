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
        Troll testTroll = new Troll("TestTroll", 4,"In front of you, you see a troll. His power looks to be 4.","I think he dropped something? Try to pick it up.");
        kort[2][1].skabning = testTroll;

        GreatApe testApe = new GreatApe("TestApe",8,"In front of you, you see a Great Ape, the ruler of this land. His power looks to be 8.", " ");
        kort[0][2].skabning = testApe;

        Swords dawnBreaker = new Swords("DawnBreaker","\n A sword even the ruler of this land would fear lays beneath him.",10);
        kort[2][1].genstand = dawnBreaker;

        Swords vilkasSword = new Swords("Vilkas's Sword", "A unique Skyforge Steel Sword lays infront of you!",5);
        int vilkaSwordPosX=4,vilkaSwordPosY=2;
        kort[vilkaSwordPosX][vilkaSwordPosY].genstand = vilkasSword;


        //Mappet
        kort[2][4].setBeskrivelse("You just stepped upon a gravel path, to both sides you see dense forest, north of you there is path leading ahead.");
        kort[2][3].setBeskrivelse("You are still on a gravel path with dense forest on both sides, the path seems to lead further north.");
        kort[2][2].setBeskrivelse("You stand on a crossroad;\n North: A shadow of a big thing seems to be infront of you. I would not head that way unless youre equipt to deal with it! \n West/East: Path seems to continue this way.  ");
        kort[3][2].setBeskrivelse("You are on a path, north and south looks to be dense forest, however something shiny sparkles to the east");
        kort[1][2].setBeskrivelse("You are on a path, north and south looks to be dense forest, however you see something up ahead, something even bigger than what you saw before. Is it him? yes it might be...");
        kort[2][1].setBeskrivelse("");//Gem denne blank
        kort[0][2].setBeskrivelse("");//Gem denne blank
        kort[4][2].setBeskrivelse("");//Gem denne blank



    }

    String look(int x, int y){
        return kort[x][y].getBeskrivelse()+ kort[x][y].skabning.look+kort[x][y].genstand.beskrivelse ;

    }


}
