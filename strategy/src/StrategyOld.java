/**
 * @author zhang
 * @date 2021/8/8 16:58
 *
 * 策略模式解决的痛点
 * 动机:
 *     在软件构建过程中，某些对象使用的算法可能多种多样，经常改变，如果将这些算法都编码到对象中，
 *     将会使对象变得异常复杂；而且有时候支持不使用的算法也是一个性能负担。
 *
 *     如何在运行时根据需要透明地更改对象的算法？将算法与对象本身解耦，从而避免上述问题？
 */
public class StrategyOld {
    public static void main(String[] args) {
        System.out.println(TaxBase.CN_TAX.equals("CN_TAX"));
    }
}

enum TaxBase{
    CN_TAX("CN_TAX"),
    DE_TAX("DE_TAX"),
    US_TAX("US_TAX");

    TaxBase(String value){
    }

}

class SaleOrderOld{
    TaxBase calType;
    public double calculateTax(){
        if(TaxBase.CN_TAX==calType){
            //
        }else if(TaxBase.US_TAX==calType){

        }else if(TaxBase.DE_TAX==calType){

        }
        return -1;
    }
}
