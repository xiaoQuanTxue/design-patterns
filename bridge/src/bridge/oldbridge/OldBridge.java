package bridge.oldbridge;

/**
 * @author zhang
 * 2021/9/20 14:12
 * 动机：
 * 由于某些类型的固有的实现逻辑，使得它们具有两个变化的维度，乃至多个维度的变化。
 * <p>
 * 如何应对这种”多维度“的变化？如何利用面向对象技术来使得类型可以轻松的沿着两个乃至多个方向变化，而不
 * 引入额外的复杂度？
 */
public class OldBridge {
    public static void main(String[] args) {
        // 编译时决定
        bridge.oldbridge.Message message = new bridge.oldbridge.PcMessageLite();
        message.login("zhang san", "123456");
    }
}

class Image {
}

interface Message {
    // 业务抽象
    void login(String username, String password);

    void sendMessage(String message);

    void sendPicture(bridge.oldbridge.Image image);

    // 平台实现
    void playSound();

    void drawShape();

    void connection();

    void write();
}

//平台实现
abstract class PcMessageBase implements bridge.oldbridge.Message {
    @Override
    public void playSound() {
        // ****************
    }

    @Override
    public void drawShape() {
        // ****************
    }

    @Override
    public void connection() {
        // ****************
    }

    @Override
    public void write() {
        // ****************
    }
}

abstract class MobileMessage implements bridge.oldbridge.Message {
    @Override
    public void playSound() {
        // ###############
    }

    @Override
    public void drawShape() {
        // ###############
    }

    @Override
    public void connection() {
        // ###############
    }

    @Override
    public void write() {
        // ###############
    }
}

// 业务抽象
class PcMessageLite extends bridge.oldbridge.PcMessageBase {
    @Override
    public void login(String username, String password) {
        super.connection();
    }

    @Override
    public void sendMessage(String message) {
        super.write();
    }

    @Override
    public void sendPicture(bridge.oldbridge.Image image) {
        super.drawShape();
    }
}

class PcMessagePerfect extends bridge.oldbridge.PcMessageBase {
    @Override
    public void login(String username, String password) {
        super.playSound();
        super.connection();
    }

    @Override
    public void sendMessage(String message) {
        super.playSound();
        super.write();
    }

    @Override
    public void sendPicture(bridge.oldbridge.Image image) {
        super.playSound();
        super.drawShape();
    }
}

class MobileMessageLite extends bridge.oldbridge.MobileMessage {
    @Override
    public void login(String username, String password) {
        super.connection();
    }

    @Override
    public void sendMessage(String message) {
        super.write();
    }

    @Override
    public void sendPicture(bridge.oldbridge.Image image) {
        super.drawShape();
    }
}

class MobileMessagePerfect extends bridge.oldbridge.MobileMessage {
    @Override
    public void login(String username, String password) {
        super.playSound();
        super.connection();
    }

    @Override
    public void sendMessage(String message) {
        super.playSound();
        super.write();
    }

    @Override
    public void sendPicture(bridge.oldbridge.Image image) {
        super.playSound();
        super.drawShape();
    }
}




