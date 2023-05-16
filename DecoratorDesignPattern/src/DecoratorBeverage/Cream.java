package DecoratorBeverage;

import BaseBeverage.Coffee;

public class Cream extends BeverageDecorator{

    Coffee baseCoffee;

    public Cream(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int price(){
        return this.baseCoffee.price()+50;
    }
}
