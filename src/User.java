import java.util.ArrayList;

public class User implements Observer{

    String id;
    Character betOn;
    String currentFightEvent;
    Fight currentFight;
    ArrayList<String> fight = new ArrayList<>();

    public User(String id, Character betFor, Fight currentFight){
        this.id = id;
        this.betOn = betFor;
        this.currentFight = currentFight;
        currentFight.register(this);
    }
    
    public void setID(String newId){
        id = newId;
    }
    
    public void setBet(Character betOn){
        this.betOn = betOn;
    }

    @Override
    public void update() {
       currentFightEvent = currentFight.getFightEvent();
       fight.add(currentFightEvent);
    }

    public void replayFight(){
        for (String fightEvents : fight){
            System.out.println(fightEvents + "\n");
        }
    }
}
