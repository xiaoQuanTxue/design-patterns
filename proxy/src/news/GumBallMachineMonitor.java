package news;

/**
 * @author zhang
 * 2021/9/11 17:55
 */
public class GumBallMachineMonitor {

    GumBallMachine gumBallMachine;

    public GumBallMachineMonitor(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    public void report() {
        System.out.println("location：" + gumBallMachine.getLocation());
        System.out.println("machine inventory:" + gumBallMachine.getCount());
    }

    public static void main(String[] args) {
        GumBallMachine machine = new GumBallMachine(5, "zhej");
        GumBallMachineMonitor mo = new GumBallMachineMonitor(machine);
        mo.report();
    }
}
