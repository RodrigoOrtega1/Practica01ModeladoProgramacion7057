public class Character{
    private String name;
    private double healthValue;
    private double attackValue;
    private double defenseValue;

    public void setName(String newName){
        name = newName;
    }

    public void setAttackValue(double newAttackValue){
        attackValue = newAttackValue;
    }

    public void setDefenseValue(double newDefenseValue){
        defenseValue = newDefenseValue;
    }

    public void setHealthValue(double newHealthValue) {
        healthValue = newHealthValue;
    }

    public double getAttackValue() {
        return attackValue;
    }

    public double getDefenseValue() {
        return defenseValue;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public String getName() {
        return name;
    }

    public Powers powers;

    public void attack(Character target){
        double characterAttackValue = this.getAttackValue();
        if(Math.random() < 0.25){
            target.setHealthValue(target.healthValue - (characterAttackValue / target.defenseValue));
            System.out.println(target.name + " se ha defendido del ataque de " + this.name + " , toma dano reducido");
        } else {
            target.setHealthValue(target.healthValue - characterAttackValue);
            System.out.println(this.name + " ha atacado a " + target.name);
        }
    }
}