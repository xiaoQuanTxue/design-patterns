package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:27
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        BeijingPizzaStore nyPizzaStore = new BeijingPizzaStore();
        Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(cheesePizza.name);

        TianjinPizzaStore tianjinPizzaStore = new TianjinPizzaStore();
        Pizza milk = tianjinPizzaStore.orderPizza("milk");
        System.out.println(milk.name);
    }
}
