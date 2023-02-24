public interface DituuSkills {
    
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

class NormalDituuSkill implements DituuSkills{
    String skillName = "Ataque Normal";
    
    @Override
    public String getName(){
        return skillName;
    }
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName();
    }
}

class DituuSkill1 implements DituuSkills{
    String skillName = "poder de Peekachi";
    
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    @Override
    public String getName(){
        return skillName;
    }
}

class DituuSkill2 implements DituuSkills{
    String skillName = "poder de Gardevooar";
    
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    @Override
    public String getName(){
        return skillName;
    }

}

class DituuSkill3 implements DituuSkills{
    String skillName = "poder de Dragoonite";
    
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    @Override
    public String getName(){
        return skillName;
    }

}
