import java.util.ArrayList;
import java.util.Random;

public class Fight{
    public ArrayList<Character> fighters = new ArrayList<>();

    public void initialize(){
        Character korby = new Korby();
        Character dituu = new Dituu();
        Character meganMan = new MeganMan();
        fighters.add(meganMan);
        fighters.add(dituu);
        fighters.add(korby);
        System.out.println(fighters.size());
    }

    public void fight(){
        Random random = new Random();
        while (fighters.size() != 1){
            for(int i = 0; i < fighters.size(); i++){
                int randomTarget = random.nextInt(fighters.size());

                if (fighters.size() == 1){
                    break;
                }
                if (i == randomTarget){
                    continue;
                } else {
                    fighters.get(i).attack(fighters.get(randomTarget));
                }

                if (fighters.get(randomTarget).getHealthValue() <= 0){
                    System.out.println(fighters.get(randomTarget).getName() + " ha sido eliminado");
                    fighters.remove(fighters.get(randomTarget));
                }
            }
        }
        System.out.println(fighters.get(0).getName() + " ha ganado");
    }

    public static void main(String[] args) {
        Fight fight = new Fight();
        fight.initialize();
        fight.fight();
    }
}