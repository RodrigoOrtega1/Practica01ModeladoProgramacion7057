import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
       if(currentFight.getIsItOver() == true){
            fight.add(verifyWin());
       }
    }

    public String verifyWin(){
        if(betOn.getName() == currentFight.getWinner()){
            return id + " el personaje por el que apostaste (" + betOn.getName() + ") ha ganado!";
        } else {
            return id + " el personaje por el que apostaste (" + betOn.getName() + ") ha perdido :(";
        }
    }

    public void replayFight(){
        for (String fightEvents : fight){
            System.out.println(fightEvents);
        }
    }

    public void writeLog() throws IOException{
        File file = new File("./bitacora" + id + ".txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i = 0; i < fight.size(); i++){
            bufferedWriter.write(fight.get(i).toString() + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
