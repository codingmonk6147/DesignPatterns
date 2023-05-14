import StaminaStrategy.BoxingStaminaStrategy;
import StaminaStrategy.StaminaInterface;

public class Boxer extends Athlete{


    Boxer() {
        super(new BoxingStaminaStrategy(), "Bibhuti");
    }
}
