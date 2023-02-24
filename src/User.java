public class User implements Observer{

    String id;
    Character betOn;
    Fight currentFight;

    public User(String id, Character betFor, Fight currentFight){
        this.id = id;
        this.betOn = betFor;
        this.currentFight = currentFight;
        currentFight.register(this);
    }
    
    public void setID(String newId){
        id = newId;
    }
    
    public void setBet(Character betOn){
        this.betOn = betOn;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
