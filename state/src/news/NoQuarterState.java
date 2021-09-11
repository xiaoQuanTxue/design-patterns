package news;

/**
 * @author zhang
 * 2021/9/11 16:43
 */
public class NoQuarterState implements State{
    private final NewGumBallMachine gumBallMachine;

    public NoQuarterState(NewGumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insert() {
        System.out.println("投入了25分");
        gumBallMachine.setCurrentState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没有投入一个币");
    }

    @Override
    public void turnCrank() {
        System.out.println("没给钱就没有糖果");
    }

    @Override
    public void dispense() {
        System.out.println("没给钱没有糖果");
    }
}
