package news;

/**
 * @author zhang
 * 2021/9/11 16:45
 */
public class WinnerState implements State {
    private final NewGumBallMachine gumBallMachine;

    public WinnerState(NewGumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insert() {
        System.out.println("error");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("error");
    }

    @Override
    public void turnCrank() {
        System.out.println("error");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setCurrentState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.releaseBall();
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setCurrentState(gumBallMachine.getNoQuarterState());
            } else {
                gumBallMachine.setCurrentState(gumBallMachine.getSoldOutState());
            }
        }
    }
}
