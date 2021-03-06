package abstractfactory;

import abstractfactory.factory.TianjinIngredientFactory;
import abstractfactory.pizza.CheesePizza;
import abstractfactory.pizza.MilkPizza;
import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.VeggiePizza;

/**
 * @author zhang
 * 2021/9/12 18:57
 */
public class NewTianjinPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        TianjinIngredientFactory factory = new TianjinIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory, "天津cheese pizza");
        } else if (type.equals("mild")) {

            pizza = new MilkPizza(factory, "天津 milk pizza");
        }
        return pizza;
    }
}
