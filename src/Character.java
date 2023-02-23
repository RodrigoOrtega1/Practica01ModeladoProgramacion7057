public class Character{
    
    /**
     * Nombre del personaje
     */
    private String name;
    
    /**
     * Cantidad de vida del personaje
     */
    private double healthValue;
    
    /**
     * Capacidad de ataque del personaje
     */
    private double attackValue;
    
    /**
     * Capacidad defensiva del personaje
     */
    private double defenseValue;

    public Skill skillType;

    /**
     * Metodo setter para establecer el nombre de un personaje
     * @param newName el nombre del personaje
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * Metodo setter para establecer la capacidad de ataque de un personaje
     * @param newAttackValue la capacidad de ataque del personaje
     */
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

    public void setSkill(Skill newSkill){
        skillType = newSkill;
    }

    public void attack(Character target){
        this.setSkill(skillType);
        double characterAttackValue = this.getAttackValue();
        if(Math.random() < 0.25){
            target.setHealthValue(target.healthValue - (characterAttackValue / target.defenseValue));
            System.out.println(target.name + " se ha defendido del ataque de " + this.name + ", toma dano reducido");
        } else {
            target.setHealthValue(target.healthValue - characterAttackValue);
            System.out.println(skillType.skill(this, target));
        }
    }
    
}