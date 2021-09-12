package abstractfactory.pizza;

import abstractfactory.ingredient.abstractingredient.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 * 2021/9/12 16:00
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Peperoni peperoni;
    public Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("烧烤20到40秒");
    }

    public void cut() {
        System.out.println("切披萨");
    }

    public void box() {
        System.out.println("打包披萨");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
