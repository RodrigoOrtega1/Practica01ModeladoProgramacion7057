public interface Skill {
    String skill(Character c, Character target);
}

class defaultSkill implements Skill{

    @Override
    public String skill(Character c, Character  target) {
        return c.getName() + " ha atacado a " + target.getName();
    }

}

class KorbySkills implements Skill{

    @Override
    public String skill(Character c, Character  target) {
        return c.getName() + " ha atacado a " + target.getName() + " con su habilidad especial";
    }

}

class MeganManSkills implements Skill{

    @Override
    public String skill(Character c, Character  target) {
        return c.getName() + " ha atacado a " + target.getName() + " con su habilidad especial";
    }

}

class DituuSkills implements Skill{

    @Override
    public String skill(Character c, Character  target) {
        return c.getName() + " ha atacado a " + target.getName() + " con su habilidad especial";
    }

}
