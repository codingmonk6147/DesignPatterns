import StaminaStrategy.StaminaInterface;

public class Athlete implements StaminaInterface {
    StaminaInterface obj;
    String name;

    Athlete(StaminaInterface obj, String name){
        this.obj=obj;
        this.name = name;
    }

    public void stamina(){
        obj.stamina();
        System.out.println(name);
    }
}
