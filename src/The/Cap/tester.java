package The.Cap;

import java.util.Objects;
import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String func = input.nextLine();
        System.out.println(func);
        if(Objects.equals(func, "w")){
            System.out.println("w22");
        }
    }
}
