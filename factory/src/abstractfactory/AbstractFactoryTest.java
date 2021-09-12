package abstractfactory;

/**
 * @author zhang
 * 2021/9/12 19:11
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        NewBeijingPizzaStore beijingPizzaStore = new NewBeijingPizzaStore();
        NewTianjinPizzaStore tianjinPizzaStore = new NewTianjinPizzaStore();

        beijingPizzaStore.orderPizza("cheese");
        tianjinPizzaStore.orderPizza("cheese");
    }
}
