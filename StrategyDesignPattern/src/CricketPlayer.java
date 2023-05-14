import StaminaStrategy.CricketStaminaStrategy;

public class CricketPlayer extends Athlete{
    CricketPlayer(){
        super(new CricketStaminaStrategy(),"Virat");
    }
}
