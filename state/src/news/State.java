package news;

/**
 * @author zhang
 * 2021/9/11 16:40
 * 添加一个状态接口
 * 定义每个状态需要的动作
 * 面向接口编程，而不是面向实现
 *
 * 多态相当于另类的if判断
 *
 * 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类
 *
 * 状态转换，可以放到context中，也可以放到状态对象中，放到状态对象中更动态，状态流动固定的话可以放到context
 *
 */
public interface State {
    void insert();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
