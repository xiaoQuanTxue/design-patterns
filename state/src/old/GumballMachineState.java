package old;

/**
 * @author zhang
 * 2021/9/11 16:03
 *
 * 如果增加一个状态的话，下面的所有代码都得发生改动
 */
public class GumballMachineState {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachineState(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insert(){
        if(state==SOLD_OUT){
            System.out.println("糖果已经卖光了");
        }else if(state == NO_QUARTER){
            System.out.println("你投入了25分");
            state = HAS_QUARTER;
        }else if(state == HAS_QUARTER){
            System.out.println("你已经投过了，不能在投了");
        }else if(state == SOLD){
            System.out.println("稍等，我们已经给过你糖果了");
        }
    }

    /**
     * 退钱
     */
    public void ejectQuarter(){
        if(state==SOLD_OUT){
            System.out.println("你不能退回，你没有投入过25分");
        }else if(state == NO_QUARTER){
            System.out.println("你没有投入过25分");
            state = HAS_QUARTER;
        }else if(state == HAS_QUARTER){
            System.out.println("钱退回了");
            state = NO_QUARTER;
        }else if(state == SOLD){
            System.out.println("对不起，你已经转过手柄了");
        }
    }

    /**
     * 转动手柄
     */
    public void turnCrank(){
        if(state==SOLD_OUT){
            System.out.println("糖果已经卖光了");
        }else if(state == NO_QUARTER){
            System.out.println("你需要投入25分");
        }else if(state == HAS_QUARTER){
            System.out.println("正在给你糖果");
            state =SOLD;
            dispense();
        }else if(state == SOLD){
            System.out.println("已经给过你糖果了");
        }
    }

    public void dispense(){
        if(state==SOLD_OUT){
            System.out.println("糖果已经卖光了");
        }else if(state == NO_QUARTER){
            System.out.println("你需要投入25分");
        }else if(state == HAS_QUARTER){
            System.out.println("没有糖果发放");
        }else if(state == SOLD){
            System.out.println("稍等，我们已经给过你糖果了");
            count--;
            if(count==0){
                System.out.println("没有糖果了");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }
    }

    @Override
    public String toString() {
        return "GumballMachineState{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        GumballMachineState gumballMachine = new GumballMachineState(5);
        System.out.println(gumballMachine);
        gumballMachine.insert();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insert();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insert();
        gumballMachine.turnCrank();
        gumballMachine.insert();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);

        gumballMachine.insert();
        gumballMachine.insert();
        gumballMachine.turnCrank();
        gumballMachine.insert();
        gumballMachine.turnCrank();
        gumballMachine.insert();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

    }
}
