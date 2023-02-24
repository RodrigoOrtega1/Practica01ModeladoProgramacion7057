import java.util.ArrayList;
import java.util.Random;

public class Fight implements Subject{
    /**
     * Lista de personajes peleando
     */
    private ArrayList<Character> fighterList = new ArrayList<>();

    /**
     * Lista de observadores viendo la pelea
     */
    private ArrayList<Observer> observerList = new ArrayList<>();
    /**
     * Un evento de la pelea
     */
    private String fightEvent;
    /**
     * El ganador de la pelea
     */
    private String winner;
    /**
     * Estado de la pelea
     */
    private Boolean isOver = false;

    /**
     * Crea a los personajes y los guarda en fighterList
     */
    public void initialize(){
        Character korby = new Korby();
        Character dituu = new Dituu();
        Character meganMan = new MeganMan();
        fighterList.add(meganMan);
        fighterList.add(dituu);
        fighterList.add(korby);
    }

    /**
     * Devuelve si la pelea ha acabado
     * @return True si la pelea ha acabado
     */
    public boolean getIsItOver(){
        return isOver;
    }

    /**
     * Devuelve la lista de peleadores
     * @return La lista de peleadores
     */
    public ArrayList<Character> getFighterList() {
        return fighterList;
    }


    /**
     * Establece el estado de la pelea
     * @param isOver True si la pelea ha terminado
     */
    public void setIsOver(Boolean isOver){
        this.isOver = isOver;
    }

    /**
     * Devuelve el ganador de la pelea
     * @return El ganador de la pelea
     */
    public String getWinner(){
        return winner;
    }

    /**
     * Establece el ganador de la pelea
     * @param winner El ganador de la pelea
     */
    public void setWinner(String winner){
        this.winner = winner;
    }

    /**
     * Establece un evento de la pelea
     * @param fightEvent Un evento de la pelea
     */
    public void setFightEvent(String fightEvent){
        this.fightEvent = fightEvent;
    }

    /**
     * Regresa un evento de la pelea
     * @return Un evento de la pelea
     */
    public String getFightEvent(){
        return fightEvent;
    }

    /**
     * Hace que los personajes peleen
     */
    public void fight(){
        Random random = new Random();
        while (fighterList.size() != 1){
            for(int i = 0; i < fighterList.size(); i++){
                int randomInt = random.nextInt(fighterList.size());
                Character target = fighterList.get(randomInt);
                if (fighterList.size() == 1){
                    break;
                }

                if (i == randomInt){
                    continue;
                } else {
                    setFightEvent(fighterList.get(i).attack(target));
                    notifyObserver();
                }

                if (target.getHealthValue() <= 0){
                    fighterList.remove(target);
                    setFightEvent("- " + target.getName() + " ha sido eliminado :( -");
                    notifyObserver();
                }
            }
        }
        setFightEvent("--- " + fighterList.get(0).getName() + " gana! ---");
        setWinner(fighterList.get(0).getName());
        setIsOver(true);
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        if (observerList.size() > 0){
            for (Observer o : observerList){
                o.update();
            }  
        }
    }
}