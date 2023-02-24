import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class User implements Observer{

    /**
     * El nombre del usuario
     */
    String id;
    /**
     *Personaje por el que aposto
     */
    Character betOn;
    /**
     *Evento que esta ocurriendo en la pelea observada
     */
    String currentFightEvent;
    /**
     *Pelea que se esta observando
     */
    Fight currentFight;
    /**
     * Lista de eventos de la pelea observada
     */
    ArrayList<String> fightEventList = new ArrayList<>();

    /**
     * Constructor de un usuario
     * @param id Nombre del usuario
     * @param betFor Peleador por el que apostó el usuario
     * @param currentFight Pelea que esta observando el usuario
     */
    public User(String id, Character betFor, Fight currentFight){
        this.id = id;
        this.betOn = betFor;
        this.currentFight = currentFight;
        currentFight.register(this);
    }
    
    @Override
    public void update() {
       currentFightEvent = currentFight.getFightEvent();
       fightEventList.add(currentFightEvent);
       if(currentFight.getIsItOver() == true){
            fightEventList.add(checkWin());
       }
    }


    /**
     * Checa si el personaje por el que usuario aposto gano
     * @return Una String de acuerdo a si el personaje por el que aposto el usuario gano
     */
    public String checkWin(){
        if(betOn.getName() == currentFight.getWinner()){
            return id + " el personaje por el que apostaste (" + betOn.getName() + ") ha ganado!";
        } else {
            return id + " el personaje por el que apostaste (" + betOn.getName() + ") ha perdido :(";
        }
    }


    /**
     * Escribe los eventos de la pelea en una bitacora txt
     * @throws IOException
     */
    public void writeLog() throws IOException{
        File file = new File("./bitacora" + id + ".txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i = 0; i < fightEventList.size(); i++){
            bufferedWriter.write(fightEventList.get(i).toString() + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
