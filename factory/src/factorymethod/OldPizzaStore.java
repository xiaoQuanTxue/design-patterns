package factorymethod;

/**
 * @author zhang
 * 2021/9/12 16:34
 *
 * 如果新增一个披萨商店 ，就得更改代码  不符合开发扩展，封闭修改原则
 *
 * 因为实例化一个类就是在依赖他的具体类
 * 所以这一个类依赖的类太多
 * 应该依赖抽象，而不是具体的类
 *
 * 依赖倒置原则
 *
 * 要依赖抽象，不要依赖具体类
 *
 * 遵守下边的方针可以避免违反依赖倒置原则
 *
 * 1）变量不可以持有具体类的引用  可以使用工厂方法避免
 * 2）不要让类派生自具体类    派生自具体类，就会依赖具体来
 * 3） 不要覆盖类中已经实现的方法
 */
public class OldPizzaStore {

    public Pizza createPizza(String style,String type){
        Pizza pizza=null;
        if(style.equals("tianjin")){
            if(type.equals("cheese")){
                pizza=new CheesePizza();
            }else if(type.equals("milk")){
                pizza=new MilkPizza();
            }
        }else if(style.equals("newyork")){
            if(type.equals("cheese")){
                pizza=new CheesePizza();
            }else if(type.equals("veggie")){
                pizza=new VeggiePizza();
            }
        }
        return pizza;
    }
}
