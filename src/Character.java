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
    
    /**
     * Metodo setter para establecer la capacidad de defensa de un personaje
     * @param newDefenseValue la capacidad de defensa del personaje
     */
    public void setDefenseValue(double newDefenseValue){
        defenseValue = newDefenseValue;
    }
    
    /**
     * Metodo setter para establecer la cantidad de vida de un personaje
     * @param newHealthValue la cantidad de vida del personaje
     */
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

    public String attack(Character target){
        return "";
    }

}
