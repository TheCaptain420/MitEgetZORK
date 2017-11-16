package The.Cap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Zork! Following Commands are available:");
        System.out.println("n(north), s(south), e(east), w(west)");
        Kort kortet = new Kort();


        Player spiller = new Player("Frank");
        spiller.displayPos();
        spiller.setPosition(1,1);
        spiller.displayPos();

        //kortet;
        while(spiller.alive){
            Scanner input = new Scanner(System.in);
            String func = input.next();
            if(func=="n"){
                spiller.moveNorth();
            }else if(func=="s"){
                spiller.moveSouth();
            }else if(func=="e"){
                spiller.moveEast();
            }else if(func=="w"){
                spiller.moveWest();
            }else{
                System.out.println("Unknown command, try again");
            }
            spiller.displayPos();


        }

        //IF else unknown command til move



    }
}
