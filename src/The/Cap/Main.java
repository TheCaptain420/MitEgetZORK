package The.Cap;

import java.util.Objects;
import java.util.Scanner;

import static The.Cap.Player.point;

public class Main {

    public static void main(String[] args) {
        Player spiller = new Player("Frank");
        System.out.println("Following Commands are available:");
        System.out.println("w(north), s(south), d(east), a(west), f(fight), p(current power/iventory), u(use/pickup).");
        Kort kortet = new Kort();
        System.out.println(kortet.kort[spiller.posX][spiller.posY].beskrivelse);
        System.out.println("Your current power seems to be "+spiller.styrke+". I would find some weapons before you meet something you regret.");

        spiller.displayPos();


        //commands;
        while(spiller.alive){
            Scanner input = new Scanner(System.in);
            String func = input.next();
            if(Objects.equals(func, "w")){
                spiller.moveNorth();
            }else if(Objects.equals(func, "s")){
                spiller.moveSouth();
            }else if(Objects.equals(func, "d")){
                spiller.moveEast();
            }else if(Objects.equals(func, "a")){
                spiller.moveWest();
            }else if(Objects.equals(func, "u")){
                spiller.playerPickUp();
            }else if(Objects.equals(func, "p")){
                spiller.currentPower();
            }else if(Objects.equals(func, "f")){
                spiller.playerFight();
            }
            else{
                System.out.println("Unknown command, try again");
            }
            spiller.displayPos();

            if (point==2){
                System.out.println("You have killed all creatures, you win!");
            }
        }




    }
}
