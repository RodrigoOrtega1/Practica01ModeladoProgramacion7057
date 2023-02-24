import java.util.Random;

public class Dituu extends Character {
    
    DituuSkills actualSkill = new NormalDituuSkill();

    public Dituu(){
        super();
        setName("Dituu");
        setAttackValue(15);
        setDefenseValue(0.75);
        setHealthValue(120);
    }

    public void setSkill(DituuSkills newSkill){
        actualSkill = newSkill;
    }

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

    public void attack(Character target){
        if(Math.random() < 0.15){
            target.setHealthValue(target.getHealthValue() - (this.getAttackValue() / target.getDefenseValue()));
            System.out.println(target.getName() + " se ha defendido del ataque de " + this.getName() + ", toma dano reducido");
        } else if (Math.random() < 0.25) {
            selectSkill();
            System.out.print( "!!!" + this.getName() + " ha tomado su habilidad: " + actualSkill.getName() + "!!!\n");
        } else {
            target.setHealthValue(target.getHealthValue() - this.getAttackValue());
            System.out.println(actualSkill.skill(target));
        }
    }
}
