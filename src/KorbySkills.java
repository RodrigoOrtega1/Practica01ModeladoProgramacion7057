public interface KorbySkills {
    String skill(Character target);
    String getName();
}

class NormalKorbySkill implements KorbySkills{
    String skillName = "Ataque Normal";
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName();
    }
    
    /**
     * Método que devuelve el nombre de la habilidad "Ataque Normal"
     * @return skillName el nombre de la habilidad
     */
    public String getName(){
        return skillName;
    }
}

class UltraSwordSkill implements KorbySkills{
    String skillName = "Hyper Sword";
    
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    /**
     * Método que devuelve el nombre de la habilidad "Hyper Sword"
     * @return skillName el nombre de la habilidad
     */
    public String getName(){
        return skillName;
    }
}

class KorbySkill2 implements KorbySkills{
    
    String skillName = "Mecha";
    
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    /**
     * Método que devuelve el nombre de la habilidad "Mecha"
     * @return skillName el nombre de la habilidad
     */
    public String getName(){
        return skillName;
    }

}

class KorbySkill3 implements KorbySkills{

    String skillName = "Mazo";
    
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    /**
     * Método que devuelve el nombre de la habilidad "Mazo"
     * @return skillName el nombre de la habilidad
     */
    public String getName(){
        return skillName;
    }

}


