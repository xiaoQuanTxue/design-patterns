package news;

/**
 * @author zhang
 * 2021/9/11 16:43
 */
public class SoldState implements State {
    private final NewGumBallMachine gumBallMachine;

    public SoldState(NewGumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insert() {
        System.out.println("你已经投入了25个比");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你已经转动了把手");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能转动两次把手");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setCurrentState(gumBallMachine.getNoQuarterState());
        } else {
            System.out.println("球卖完了");
            gumBallMachine.setCurrentState(gumBallMachine.getSoldOutState());
        }
    }
}
