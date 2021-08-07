package template_methods;

/**
 * @author zhang
 * @date 2021/8/7 19:38
 * 定义:
 *     定义一个操作中的算法的骨架(稳定)，而将一些步骤延迟(变化)到子类中。Template Method设计模式
 *     使得子类可以不改变(复用)一个算法的结构即可重定义(override 重写)该算法的某些特定步骤
 *
 *   Library_new 开发人员: 开发具体步骤，及程序主流程
 *     Application_new 开发人员：开发具体步骤
 *     Library_new 调用 Application_new (晚绑定)
 */
public class TemplateMethodNew {
    public static void main(String[] args) {
        LibraryNew app = new ApplicationNew();
        app.run();
    }
}

abstract class LibraryNew {
    /**
     * 稳定部分
     */
    protected void run() {
        step1();
        if (step2()) {
            step3();
        }
        for (int i = 0; i < 4; i++) {
            step4();
        }
        step5();
    }

    protected void step1() {
    }

    /**
     * 不稳定部分，交给库调用人员实现
     *
     * @return
     */
    protected abstract boolean step2();

    protected void step3() {
    }

    /**
     * 不稳定部分，交给库调用人员实现
     *
     * @return
     */
    protected abstract void step4();

    protected void step5() {
    }
}

/**
 * 库调用者实现不稳定的部分即可，稳定的部分库开发者已经开发好
 *
 * 这样可以做到稳定的抽象由库开发人员开发，剩下的变化将之暴露出来供拓展
 */
class ApplicationNew extends LibraryNew {
    @Override
    protected boolean step2() {
        return false;
    }

    @Override
    protected void step4() {

    }
}
