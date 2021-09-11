package news;

import java.util.Random;

/**
 * @author zhang
 * 2021/9/11 16:44
 */
public class HasQuarterState implements State {
    private final NewGumBallMachine gumBallMachine;
    private final Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(NewGumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insert() {
        System.out.println("你已经投入了25分");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在退钱");
        gumBallMachine.setCurrentState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你正在转动把手");
        int winner = random.nextInt();
        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            System.out.println("你赢了");
            gumBallMachine.setCurrentState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setCurrentState(gumBallMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("没有球正在发放");
    }
}
