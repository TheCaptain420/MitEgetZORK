package The.Cap;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Genstand> genstandArrayList;
    int posX = 2;
    int posY = 2;
    int styrke = 1;
    boolean alive = true;
    Kort hentKortData = new Kort();


    public Player(String navn){
        this.name=navn;
        System.out.println("Welcome to Zork "+navn+"!");
    }

    void displayPos(){
        System.out.println("X:"+posX+" - Y:"+posY);
    }

    public void setPosition(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
    }

    public void moveNorth() {
        if (posY >= 1) {
            posY -= 1;
            System.out.println(hentKortData.look(posX, posY));
        }else{
            System.out.println("You cant go further North");
        }
    }
    public void moveWest() {
        if (posX >= 1) {
            posX -= 1;
            System.out.println(hentKortData.look(posX, posY));
        }else{
            System.out.println("You cant go further West");
        }
    }
    public void moveSouth(){
        if (posY < 4) {
            posY += 1;
        System.out.println(hentKortData.look(posX,posY));
    }else{
            System.out.println("You cant go further South");
        }
    }
    public void moveEast(){
        if (posX < 4) {
            posX += 1;
        System.out.println(hentKortData.look(posX,posY));
        }else{
            System.out.println("You cant go further East");
        }
    }

    void playerFight(){
        if(hentKortData.kort[posX][posY].skabning.styrke < styrke){
            System.out.println("The creature has been slain, you stand victorious!");
            hentKortData.kort[posX][posY].skabning.skabningdead();
        }else if(hentKortData.kort[posX][posY].skabning.styrke > styrke){
            playerDeath();
        }
    }
    void playerPickUp(){
        genstandArrayList.add(hentKortData.kort[posX][posY].genstand);
        System.out.println("You've successfully picked up "+ hentKortData.kort[posX][posY].genstand.navn);
    }


    void playerDeath(){
        alive = false;
        System.out.println("You have died! Start over!");
    }




}
