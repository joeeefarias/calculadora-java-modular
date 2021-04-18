package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.DivHelper;
import digital.innovation.one.utils.internal.MultiHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();

    }

    public int sum(int a, int b) {
        return subHelper.execute(a,b);

    }

    public int sub(int a, int b) {
        return subHelper.execute(a,b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a,b);
    }

    public int mult(int a, int b) {
        return multiHelper.execute(a,b);
    }

}
