public interface MeganManSkills {
    String skill(Character target);
    String getName();
}

class NormalMeganManSkill implements MeganManSkills{
    String skillName = "Ataque Normal";

    public String getName(){
        return skillName;
    }
    
    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName();
    }
}

class MeganManSkill1 implements MeganManSkills{

    String skillName = "Lanza-cohetes";
    
    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    public String getName(){
        return skillName;
    }
}

class MeganManSkill2 implements MeganManSkills{

    String skillName = "Megan Buster";
    
    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    public String getName(){
        return skillName;
    }

}

class MeganManSkill3 implements MeganManSkills{

    String skillName = "Megan Arm";
    
    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su " + skillName;
    }
    
    public String getName(){
        return skillName;
    }

}
