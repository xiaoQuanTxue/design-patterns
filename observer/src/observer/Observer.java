package observer;

/**
 * @author zhang
 * @date 2021/8/17 21:03
 * 观察者接口
 */
public interface Observer {
    /**
     * 对观察者的参数进行更新
     */
    void update(float t, float h, float p);
}
