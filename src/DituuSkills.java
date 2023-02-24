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
    String skillName = "Habilidad 1";

    public String getName(){
        return skillName;
    }
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su habilidad 1";
    }
}

class DituuSkill2 implements DituuSkills{
    String skillName = "Habilidad 2";

    public String getName(){
        return skillName;
    }
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su habilidad 2";
    }

}

class DituuSkill3 implements DituuSkills{
    String skillName = "Habilidad 3";

    public String getName(){
        return skillName;
    }
    @Override
    public String skill(Character target) {
        return "Dituu ha atacado a " + target.getName() + " con su habilidad 3";
    }

}
