import java.util.Random;

public class Korby extends Character{
   
    KorbySkills actualSkill = new NormalKorbySkill();


    /**
     * Constructor de Korby
     */
    public Korby(){
        super();
        setName("Korby");
        setAttackValue(10);
        setDefenseValue(0.75);
        setHealthValue(150);
    }
   
   /**
     * Metodo setter para establecer las habilidades del personaje Korby
     * @param newSkill la habilidad de un personaje
     */
    public void setSkill(KorbySkills newSkill){
        actualSkill = newSkill;
    }
   
   /**
     * Metodo que genera una numero aleatorio entre 1, 2 y 3, y dependiendo del número
     * estalece una habilidad para el personaje Korby
     */
    public void selectSkill(){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch(randomInt){
            case 1:
                actualSkill = new UltraSwordSkill();
                break;
            case 2:
                actualSkill = new KorbySkill2();
                break;
            case 3:
                actualSkill = new KorbySkill3();
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
