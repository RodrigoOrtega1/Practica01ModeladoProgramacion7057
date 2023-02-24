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

    String skillName = "Habilidad 1";

    public String getName(){
        return skillName;
    }
    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su habilidad 1";
    }
}

class MeganManSkill2 implements MeganManSkills{

    String skillName = "Habilidad 2";

    public String getName(){
        return skillName;
    }

    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su habilidad 2";
    }

}

class MeganManSkill3 implements MeganManSkills{

    String skillName = "Habilidad 3";

    public String getName(){
        return skillName;
    }

    @Override
    public String skill(Character target) {
        return "MeganMan ha atacado a " + target.getName() + " con su habilidad 3";
    }

}
