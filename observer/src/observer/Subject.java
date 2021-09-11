package observer;

/**
 * @author zhang
 * @date 2021/8/17 21:04
 * 被观测者 可以进行观察者的注册，删除，更新活动
 */
public interface Subject {
    /**
     * 注册一个观察者
     * @param observer
     */
    void registryObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知一个观察者
     */
    void notifyObservers();
}
