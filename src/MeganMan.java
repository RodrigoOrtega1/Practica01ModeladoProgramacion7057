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

    public void setSkill(MeganManSkills newSkill){
        actualSkill = newSkill;
    }

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
