package abstractfactory.factory;

import abstractfactory.ingredient.abstractingredient.*;
import abstractfactory.ingredient.beijing.*;

/**
 * @author zhang
 * 2021/9/12 18:44
 */
public class BeijingIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new BeijingDough();
    }

    @Override
    public Sauce createSauce() {
        return new BeijingSauce();
    }

    @Override
    public Clams createClams() {
        return new BeijingClams();
    }

    @Override
    public Cheese createCheese() {
        return new BeijingCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BeijingVeggies()};
    }

    @Override
    public Peperoni createPeperoni() {
        return new BeijingPeperoni();
    }
}
