package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:20
 * 子类决定生产什么样的pizza
 */
public class TianjinPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("milk")) {
            pizza = new MilkPizza();
        }
        return pizza;
    }
}
