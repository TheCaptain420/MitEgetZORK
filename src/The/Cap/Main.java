package The.Cap;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player spiller = new Player("Frank");
        System.out.println("Following Commands are available:");
        System.out.println("w(north), s(south), d(east), a(west), f(fight), p(current power/iventory), u(use/pickup).");
        Kort kortet = new Kort();


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


        }

        //IF else unknown command til move



    }
}
