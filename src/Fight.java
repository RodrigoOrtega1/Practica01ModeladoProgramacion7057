import java.util.ArrayList;
import java.util.Random;

public class Fight implements Subject{
    public ArrayList<Character> fighters = new ArrayList<>();
    public ArrayList<Observer> observersList = new ArrayList<>();
    String fightEvent;

    public void initialize(){
        Character korby = new Korby();
        Character dituu = new Dituu();
        Character meganMan = new MeganMan();
        fighters.add(meganMan);
        fighters.add(dituu);
        fighters.add(korby);
    }

    public void setFightEvent(String fightEvent){
        this.fightEvent = fightEvent;
    }

    public void fight(){
        Random random = new Random();
        while (fighters.size() != 1){
            for(int i = 0; i < fighters.size(); i++){
                int randomTarget = random.nextInt(fighters.size());

                if (fighters.size() == 1){
                    break;
                }

                if (i == randomTarget){
                    continue;
                } else {
                    setFightEvent(fighters.get(i).attack(fighters.get(randomTarget)));
                }

                if (fighters.get(randomTarget).getHealthValue() <= 0){
                    setFightEvent("- " + fighters.get(randomTarget).getName() + " ha sido eliminado :( -");
                    fighters.remove(fighters.get(randomTarget));
                }
            }
        }
        setFightEvent("--- " + fighters.get(0).getName() + " gana! ---");
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
        for (Observer o : observersList){
            o.update();
        }   
    }

    public static void main(String[] args) {
        Fight fight = new Fight();
        fight.initialize();
        fight.fight();
    }
}