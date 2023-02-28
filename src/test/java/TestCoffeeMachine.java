import org.example.Americano;
import org.example.Coffee;
import org.example.CoffeeMachine;
import org.example.CoffeeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoffeeMachine {

    @Test
    public void TestCreateCoffee(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Coffee coffee = coffeeMachine.createCoffee(CoffeeType.AMERICANO);

        Assertions.assertInstanceOf(Americano.class, coffee);

        Assertions.assertEquals(1, coffee.getMilk());
    }
}
