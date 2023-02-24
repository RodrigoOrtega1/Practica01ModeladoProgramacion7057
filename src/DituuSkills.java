public interface DituuSkills {
    String skill(Character target);
    String getName();
}

class NormalDituuSkill implements DituuSkills{
    String skillName = "Ataque Normal";

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
    
    public String getName(){
        return skillName;
    }

}
