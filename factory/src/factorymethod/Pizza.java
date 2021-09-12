package factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 * 2021/9/12 16:00
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings=new ArrayList<>();

    void prepare(){
        System.out.println("preparing"+name);
        System.out.println("tossing dough..");
        System.out.println("adding sauce");
    }

    void bake(){
        System.out.println("烧烤20到40秒");
    }

    void cut(){
        System.out.println("切披萨");
    }

    void box(){
        System.out.println("打包披萨");
    }

    public String getName(){
        return name;
    }
}
