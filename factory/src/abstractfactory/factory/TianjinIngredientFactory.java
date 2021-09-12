package abstractfactory.factory;

import abstractfactory.ingredient.abstractingredient.*;
import abstractfactory.ingredient.tianjin.*;

/**
 * @author zhang
 * 2021/9/12 18:40
 */
public class TianjinIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new TianjinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TianjinSauce();
    }

    @Override
    public Clams createClams() {
        return new TianjinClams();
    }

    @Override
    public Cheese createCheese() {
        return new TianjinCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new TianjinVeggies()};
    }

    @Override
    public Peperoni createPeperoni() {
        return new TianjinPeperoni();
    }
}
