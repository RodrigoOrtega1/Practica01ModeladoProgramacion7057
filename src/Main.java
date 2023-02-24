import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        Fight fight1 = new Fight();
        Fight fight2 = new Fight();
        Fight fight3 = new Fight();
        Fight fight4 = new Fight();
        fight1.initialize();
        fight2.initialize();
        fight3.initialize();
        fight4.initialize();
        User usuario1 = new User("usuario1", fight1.getFighterList().get(0), fight1);
        User usuario2 = new User("usuario2", fight1.getFighterList().get(1), fight2);
        User usuario3 = new User("usuario3", fight1.getFighterList().get(2), fight3);
        User usuario4 = new User("usuario4", fight4.getFighterList().get(1), fight4);
        fight1.fight();
        fight2.fight();
        fight3.fight();
        fight4.fight();
        usuario1.writeLog();
        usuario2.writeLog();
        usuario3.writeLog();
        usuario4.writeLog();
    }
}