package template_methods;

/**
 * @author zhang
 * @date 2021/8/7 19:39
 *
 * template method 设计模式
 * 在软件构建过程中，对于某一项任务，它常常有稳定的整体操作 结构，
 * 但各个子步骤却有很多改变的需求，或者由于固有的原因 （比如框架与应用之间的关系）而无法和任务的整体结构同时实现。
 *
 * 如何在确定稳定操作结构的前提下，来灵活应对各个子步骤的变 化或者晚期实现需求？
 * ----------------------------------------------------------------------------------------------------
 *   Library_old 开发人员：开发具体步骤
 *   Application_old 开发人员：开发步骤，记忆程序主流程
 *   Application_old 调用 Library_old (早绑定)
 */
public class TemplateMethodOld {
    public static void main(String[] args) {
        // 稳定的算法结构  有应用调用库 早绑定
        LibraryOld library = new LibraryOld();
        ApplicationOld application = new ApplicationOld();
        library.step1();
        if (application.step2()) {
            library.step3();
        }
        for (int i = 0; i < 4; i++) {
            application.step4();
        }
        library.step5();
    }
}

/**
 * 稳定部分，由库开发人员开发
 */
class LibraryOld {

    public void step1() {
    }

    public void step3() {
    }

    public void step5() {
    }
}

/**
 * 不稳定部分，由application开发人员开发
 */
class ApplicationOld {

    public boolean step2() {
        return false;
    }

    public void step4() {
    }
}
