package The.Cap;


public class Player {
    String name;
    int posX = 2;
    int posY = 4;
    int styrke = 1;
    boolean alive = true;
    Kort hentKortData = new Kort();
    String vaabenBeskrivelse="You have no weapons!";
    static int point=0;


    public Player(String navn){
        this.name=navn;
        System.out.println("Welcome to Zork "+navn+"!");
    }

    void displayPos(){
        //System.out.println("Your current position is X:"+posX+" - Y:"+posY);
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
        System.out.println("FIGHTING!!!");
        if(hentKortData.kort[posX][posY].skabning.styrke>1){
            if(hentKortData.kort[posX][posY].skabning.styrke < styrke){
                System.out.println("The creature has been slain, you stand victorious!"+hentKortData.kort[posX][posY].skabning.PickUP);
                hentKortData.kort[posX][posY].skabning.skabningdead();
                point+=1;

            }else if(hentKortData.kort[posX][posY].skabning.styrke > styrke){
                playerDeath();
            }
        }else {
            System.out.println("No creatures to be seen!");
        }
    }
    void playerPickUp(){
        this.vaabenBeskrivelse = hentKortData.kort[posX][posY].genstand.navn;
        this.styrke = hentKortData.kort[posX][posY].genstand.styrke;
        System.out.println("You've successfully picked up: "+ hentKortData.kort[posX][posY].genstand.navn);
    }

    void currentPower(){
        System.out.println("Your current power is "+styrke+" out of 10. You are currently holding : "+ vaabenBeskrivelse);
    }

    void playerDeath(){
        alive = false;
        System.out.println("You have died! Start over!");
        System.out.println("Your score: "+point);
    }




}
