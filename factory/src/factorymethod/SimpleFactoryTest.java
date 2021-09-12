package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:30
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        SimpleStore simpleStore = new SimpleStore(simpleFactory);
        Pizza cheese = simpleStore.order("cheese");
        System.out.println(cheese.name);
    }
}
