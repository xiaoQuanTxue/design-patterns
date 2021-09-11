package news;

import java.lang.management.GarbageCollectorMXBean;

/**
 * @author zhang
 * 2021/9/11 16:47
 */
public class NewGumBallMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;
    private State currentState = soldOutState;
    private int count;

    public NewGumBallMachine(int count) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldState(this);
        this.soldState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            setCurrentState(this.noQuarterState);
        }
    }

    public void insert() {
        currentState.insert();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        System.out.println("一个糖球正在滚出来");
        if (count != 0) {
            count--;
        }
    }

    void refill(int count) {
        this.count = count;
        currentState = noQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "NewGumBallMachine{" +
                "currentState=" + currentState +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        NewGumBallMachine gumBallMachine = new NewGumBallMachine(5);

        System.out.println(gumBallMachine);

        gumBallMachine.insert();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);

        gumBallMachine.insert();
        gumBallMachine.turnCrank();
        gumBallMachine.insert();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);
    }


}
