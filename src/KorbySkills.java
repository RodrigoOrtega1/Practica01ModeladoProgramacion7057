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
    public String getName(){
        return skillName;
    }
}

class UltraSwordSkill implements KorbySkills{
    String skillName = "UltraSword";
    
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con la ultra espada";
    }
    
    public String getName(){
        return skillName;
    }
}

class KorbySkill2 implements KorbySkills{
    
    String skillName = "Habilidad 2";

    public String getName(){
        return skillName;
    }
    
    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con su habilidad 2";
    }

}

class KorbySkill3 implements KorbySkills{

    String skillName = "Habilidad 3";

    public String getName(){
        return skillName;
    }

    @Override
    public String skill(Character target) {
        return "Korby ha atacado a " + target.getName() + " con su habilidad 3";
    }

}


