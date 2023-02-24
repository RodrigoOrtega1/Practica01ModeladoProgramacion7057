import java.util.Random;

public class MeganMan extends Character {
    
    MeganManSkills actualSkill = new NormalMeganManSkill();

    public MeganMan(){
        super();
        setName("MeganMan");
        setAttackValue(25);
        setDefenseValue(0.5);
        setHealthValue(100);
    }
    
    /**
     * Metodo setter para establecer las habilidades del personaje MeganMan
     * @param newSkill la habilidad de un personaje
     */
    public void setSkill(MeganManSkills newSkill){
        actualSkill = newSkill;
    }
    
    /**
     * Metodo que genera una numero aleatorio entre 1, 2 y 3, y dependiendo del número
     * estalece una habilidad para el personaje MeganMan
     */
    public void selectSkill(){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch(randomInt){
            case 1:
                actualSkill = new MeganManSkill1();
                break;
            case 2:
                actualSkill = new MeganManSkill2();
                break;
            case 3:
                actualSkill = new MeganManSkill3();
                break;
        }
    }

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
