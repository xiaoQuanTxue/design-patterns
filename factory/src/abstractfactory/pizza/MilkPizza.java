package abstractfactory.pizza;

import abstractfactory.factory.PizzaIngredientFactory;

/**
 * @author zhang
 * 2021/9/12 18:52
 */
public class MilkPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public MilkPizza(PizzaIngredientFactory ingredientFactory, String name) {
        super.setName(name);
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.printf("正在准备%s的食材%n", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
