public interface KorbySkills {
    /**
     * Devuelve el ataque de Dituu
     * @param target objetivo de dituu
     * @return ataque de dituu
     */
    String skill(Character target);

    /**
     * Método que devuelve el nombre de la habilidad
     * @return el nombre de la habilidad
     */
    String getName();
}

class NormalKorbySkill implements KorbySkills{
    String skillName = "Ataque Normal";
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName();
    }
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
    public String getName(){
        return skillName;
    }

}


