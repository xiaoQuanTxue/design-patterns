package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:20
 */
public class MilkPizza extends Pizza{
    public MilkPizza(){
        name="牛奶披萨";
        dough="牛奶dough";
        sauce="牛奶sauce";
        toppings.add("MILK");
    }
}
