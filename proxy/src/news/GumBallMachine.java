package news;

/**
 * @author zhang
 * 2021/9/11 16:47
 */
public class GumBallMachine {

    private int count;
    private String location;
    // 其他实例变量

    public GumBallMachine(int count, String location) {
        this.count = count;
        this.location = location;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "GumBallMachine{" +
                "count=" + count +
                ", location='" + location + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(5, "fef");

    }


}
