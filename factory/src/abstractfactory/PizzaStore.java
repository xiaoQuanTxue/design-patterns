package abstractfactory;


import abstractfactory.pizza.Pizza;

/**
 * @author zhang
 * 2021/9/12 16:05
 * 工厂方法模式
 *
 * 让子类决定具体使用的类型
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类
 *
 * 依赖于抽象
 */
public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);
}
