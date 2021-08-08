/**
 * @author zhang
 * @date 2021/8/8 19:18
 * 定义:
 *     定义一系列算法，把它们一个个封装起来，并且使它们可互相替换(变化)。
 *     该模式使得算法可独立于使用它的客户程序(稳定)而变化(扩展，子类化)
 * 总结:
 *     Strategy及其子类为组件提供了一系列可重用的算法，从而可以使得类型
 *     在运行时方便的根据需要在各个算法之间进行切换.
 *
 *     提供了用条件判断语句以外的另一种选择，消除条件判断语句，就是在解耦合。
 *     含有许多条件判断语句的代码通常都需要Strategy模式
 *
 */
public class StrategyNew {

}
class Context{

}
interface TaxStrategy{
    double calclate(Context context);
}

class CnTax implements TaxStrategy{
    @Override
    public double calclate(Context context) {
        return 0;
    }
}
class UsTax implements TaxStrategy{
    @Override
    public double calclate(Context context) {
        return 0;
    }
}
class DeTax implements TaxStrategy{
    @Override
    public double calclate(Context context) {
        return 0;
    }
}

/**
 * 扩展-遵循了开放封闭原则
 */
class FrTax implements TaxStrategy{
    @Override
    public double calclate(Context context) {
        return 0;
    }
}

class SalesOrderNew{
    private TaxStrategy taxStrategy;

    /**
     * 让调用者选择调用哪个tax strategy
     * 后续的工厂模式的构造函数
     * 返回堆对象
     * SalesOrder_new(SrategyFactory* startegyfactory) {
     *     this->startegy = strategyfactor->CreateStartegy();
     * }
     * @param taxStrategy
     */
    public SalesOrderNew(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double taxCal(){
        Context context = new Context();

        return taxStrategy.calclate(context);
    }
}
