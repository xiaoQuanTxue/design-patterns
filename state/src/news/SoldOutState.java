package news;

/**
 * @author zhang
 * 2021/9/11 16:43
 */
public class SoldOutState implements State{

    private final NewGumBallMachine gumBallMachine;

    public SoldOutState(NewGumBallMachine gumBallMachine){
        this.gumBallMachine=gumBallMachine;
    }
    @Override
    public void insert() {
        System.out.println("没球了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没投币");
    }

    @Override
    public void turnCrank() {
        System.out.println("没有钱");
    }

    @Override
    public void dispense() {

    }
}
