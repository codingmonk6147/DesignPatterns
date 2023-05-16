package DecoratorBeverage;

import BaseBeverage.Coffee;

public class Caramel extends BeverageDecorator{

    Coffee baseCoffee;

    public Caramel(Coffee baseCoffee){
        this.baseCoffee=baseCoffee;

    }

    @Override
    public int price(){
        return this.baseCoffee.price() + 10;
    }
}
