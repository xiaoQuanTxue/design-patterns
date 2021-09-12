package abstractfactory.factory;

import abstractfactory.ingredient.abstractingredient.*;

/**
 * @author zhang
 * 2021/9/12 16:47
 * 抽象工厂
 * 抽象工厂模式提供了一个接口，用于创建   相关或依赖对象的家族   而不需要明确指定具体类
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Clams createClams();

    Cheese createCheese();

    Veggies[] createVeggies();

    Peperoni createPeperoni();
}
