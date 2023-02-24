public class Main{
    public static void main(String[] args){
        Fight fight = new Fight();
        fight.initialize();
        User usuario1 = new User("usuario1", fight.fighters.get(0), fight);
        // User usuario2 = new User("usuario2", fight.fighters.get(0), fight);
        // User usuario3 = new User("usuario3", fight.fighters.get(0), fight);
        // User usuario4 = new User("usuario4", fight.fighters.get(0), fight);
        fight.fight();
        usuario1.replayFight();

    }
}