/**
 * Clase que representa al personaje Dituu del juego
 * @version 1.0 24-02-2023
 * @since Modelado y Programación 7075
 */
import java.util.Random;

public class Dituu extends Character {
    

    /**
     * Habilidad que esta usando actualmente el personaje
     */
    DituuSkills actualSkill = new NormalDituuSkill();


    /**
     * Constructor de Dituu
     */
    public Dituu(){
        super();
        setName("Dituu");
        setAttackValue(15);
        setDefenseValue(0.75);
        setHealthValue(120);
    }
    
    /**
     * Metodo setter para establecer las habilidades del personaje Dituu
     * @param newSkill la habilidad de un personaje
     */
    public void setSkill(DituuSkills newSkill){
        actualSkill = newSkill;
    }
    
    /**
     * Metodo que genera una numero aleatorio entre 1, 2 y 3, y dependiendo del número
     * estalece una habilidad para el personaje Dituu
     */
    public void selectSkill(){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch(randomInt){
            case 1:
                actualSkill = new DituuSkill1();
                break;
            case 2:
                actualSkill = new DituuSkill2();
                break;
            case 3:
                actualSkill = new DituuSkill3();
                break;
        }
    }

    @Override
    public String attack(Character target){
        if(Math.random() < 0.15){
            target.setHealthValue(target.getHealthValue() - (this.getAttackValue() / target.getDefenseValue()));
            return target.getName() + " se ha defendido del ataque de " + this.getName() + ", toma dano reducido";
        } else if (Math.random() < 0.25) {
            selectSkill();
            return "¡¡¡" + this.getName() + " ha tomado su habilidad: " + actualSkill.getName() + "!!!";
        } else {
            target.setHealthValue(target.getHealthValue() - this.getAttackValue());
            return actualSkill.skill(target);
        }
    }
}
