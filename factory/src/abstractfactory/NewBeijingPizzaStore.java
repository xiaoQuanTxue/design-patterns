package abstractfactory;

import abstractfactory.factory.BeijingIngredientFactory;
import abstractfactory.pizza.Pizza;
import abstractfactory.pizza.CheesePizza;
import abstractfactory.pizza.VeggiePizza;

/**
 * @author zhang
 * 2021/9/12 19:06
 */
public class NewBeijingPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        BeijingIngredientFactory f = new BeijingIngredientFactory();
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(f,"北京口味 cheese pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(f,"北京口味 veggie pizza");
        }
        return pizza;
    }
}
