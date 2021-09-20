package bridge.newbridge;

/**
 * @author zhang
 * 2021/9/20 15:21
 * Bridge模式使用”对象间的组合关系“解耦了抽象和实现之之间固有的绑定关系，使得抽象和实现之间可以沿着各自的维度
 * 来变化，所谓抽象和实现沿着各自维度的变化，即”子类化“它们。
 * Bridge模式有时候类似于多继承方案，但是多继承方案往往违背单一职责原则(即一个类只有一个变化的原因)，复用性比较差。
 * Bridge模式是比多继承更好的解决方法。
 * Beidege模式的应用一般在”两个非常强的变化维度“，有时候一个类也有多余两个的变化维度，这时候可以使用Bridge的扩展模式。
 */
public class NewBridge {
    public static void main(String[] args) {
        //运行时决定
        MobileMessageImpl mobileMessage = new MobileMessageImpl();
        MessageLite messageLite = new MessageLite(mobileMessage);
    }
}

class Image {
}

abstract class Message {
    MessageImpl messageImpl;

    public Message() {
    }

    public Message(MessageImpl messageImpl) {
        this.messageImpl = messageImpl;
    }

    // 业务抽象
    abstract void login(String username, String password);

    abstract void sendMessage(String message);

    abstract void sendPicture(Image image);
}

// 平台实现
interface MessageImpl {

    void playSound();

    void drawShape();

    void connection();

    void write();
}

class MobileMessageImpl implements MessageImpl {
    @Override
    public void playSound() {

    }

    @Override
    public void drawShape() {

    }

    @Override
    public void connection() {

    }

    @Override
    public void write() {

    }
}

class MessageLite extends Message {
    public MessageLite(MessageImpl message) {
        super(message);
    }

    public void login(String username, String password) {
        messageImpl.connection();
    }

    public void sendMessage(String message) {
        messageImpl.write();
    }

    public void sendPicture(Image image) {
        messageImpl.drawShape();
    }
}

class MessagePerfect extends Message {
    public MessagePerfect(MessageImpl message) {
        super(message);
    }

    public void login(String username, String password) {
        messageImpl.playSound();
        messageImpl.connection();
    }

    public void sendMessage(String message) {
        messageImpl.playSound();
        messageImpl.write();
    }

    public void sendPicture(Image image) {
        messageImpl.playSound();
        messageImpl.drawShape();
    }
}
