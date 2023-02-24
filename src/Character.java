/**
 * Clase que representa a un personaje del juego
 * @version 1.0 24-02-2023
 * @since Modelado y Programación 7075
 */
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
    
    /**
     * Metodo que devuelve la capacidad de ataque de un personaje
     * @return attackValue la capacidad de ataque de un personaje
     */
    public double getAttackValue() {
        return attackValue;
    }
    
    /**
     * Metodo que devuelve la capacidad de defensa de un personaje
     * @return defenseValue la capacidad de defensa de un personaje
     */
    public double getDefenseValue() {
        return defenseValue;
    }
    
    /**
     * Metodo que devuelve la cantidad de vida de un personaje
     * @return healthValue la cantidad de vida de un personaje
     */
    public double getHealthValue() {
        return healthValue;
    }
    
    /**
     * Metodo que devuelve el nombre de un personaje
     * @return name el nombre de un personaje
     */
    public String getName() {
        return name;
    }
    

    /**
     * Metodo que realiza la accion de atacar a otro personaje
     * @param target personaje a atacar
     * @return la acción del personaje que ataca
     */
    public String attack(Character target){
        return "";
    }

}
