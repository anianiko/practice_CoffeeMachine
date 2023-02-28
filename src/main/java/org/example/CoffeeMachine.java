package org.example;

public class CoffeeMachine {

    public Coffee createCoffee(CoffeeType type){
        if (type == CoffeeType.AMERICANO){
            Americano americano = new Americano();
            return americano;
        }
        else if (type == CoffeeType.CAPPUCINO) {
            Cappucino cappucino = new Cappucino();
            return cappucino;
        }
        else if (type == CoffeeType.ESPRESSO) {
            Espresso espresso = new Espresso();
            return espresso;
        }
        else{
            return null;
        }
    }
}
