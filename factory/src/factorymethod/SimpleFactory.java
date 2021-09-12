package factorymethod;

import java.util.Objects;

/**
 * @author zhang
 * 2021/9/12 16:09
 * 简单工厂 模式
 */
public class SimpleFactory {

    public Pizza createPizza(String type){
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("veggie")){
            pizza=new VeggiePizza();
        }else {
            pizza=null;
        }
        return pizza;
    }
}


