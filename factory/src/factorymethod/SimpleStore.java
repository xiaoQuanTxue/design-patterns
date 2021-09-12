package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:14
 */
public class SimpleStore {
    SimpleFactory store;

    public SimpleStore(SimpleFactory store){
        this.store=store;
    }

    public Pizza order(String type){
        Pizza pizza;
        pizza = store.createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
