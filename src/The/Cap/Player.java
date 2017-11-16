package The.Cap;

public class Player {
    String name;
    //Arraylist<Genstand?> inventory;
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

    public void moveNorth(){
        posY -= 1;
        System.out.println(hentKortData.look(posX,posY));
    }
    public void moveWest(){
        posX += 1;
        System.out.println(hentKortData.look(posX,posY));
    }
    public void moveSouth(){
        posY += 1;
        System.out.println(hentKortData.look(posX,posY));
    }
    public void moveEast(){
        posX -= 1;
        System.out.println(hentKortData.look(posX,posY));
    }

    void playerDeath(){
        alive = false;
        System.out.println("You have died!");
    }




}
