import java.util.ArrayList;
import java.util.Random;

public class Fight implements Subject{
    public ArrayList<Character> fighters = new ArrayList<>();
    public ArrayList<Observer> observersList = new ArrayList<>();
    String fightEvent;
    String winner;
    Boolean isOver = false;

    public void initialize(){
        Character korby = new Korby();
        Character dituu = new Dituu();
        Character meganMan = new MeganMan();
        fighters.add(meganMan);
        fighters.add(dituu);
        fighters.add(korby);
    }

    public boolean getIsItOver(){
        return isOver;
    }

    public void setIsOver(Boolean isOver){
        this.isOver = isOver;
    }

    public String getWinner(){
        return winner;
    }

    public void setWinner(String winner){
        this.winner = winner;
    }

    public void setFightEvent(String fightEvent){
        this.fightEvent = fightEvent;
    }

    public String getFightEvent(){
        return fightEvent;
    }

    public void fight(){
        Random random = new Random();
        while (fighters.size() != 1){
            for(int i = 0; i < fighters.size(); i++){
                int randomInt = random.nextInt(fighters.size());
                Character target = fighters.get(randomInt);
                if (fighters.size() == 1){
                    break;
                }

                if (i == randomInt){
                    continue;
                } else {
                    setFightEvent(fighters.get(i).attack(target));
                    notifyObserver();
                }

                if (target.getHealthValue() <= 0){
                    fighters.remove(target);
                    setFightEvent("- " + target.getName() + " ha sido eliminado :( -");
                    notifyObserver();
                }
            }
        }
        setFightEvent("--- " + fighters.get(0).getName() + " gana! ---");
        setWinner(fighters.get(0).getName());
        setIsOver(true);
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        observersList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObserver() {
        if (observersList.size() > 0){
            for (Observer o : observersList){
                o.update();
            }  
        }
    }
}