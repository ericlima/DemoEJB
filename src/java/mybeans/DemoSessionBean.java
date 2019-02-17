package mybeans;

import javax.ejb.Stateful;

@Stateful
public class DemoSessionBean implements DemoSessionBeanRemote{

    private int i,j,k;

    @Override
    public int getI() {
        return i;
    }

    @Override
    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int getJ() {
        return j;
    }

    @Override
    public void setJ(int j) {
        this.j = j;
    }
    
    @Override
    public int getK() {
        return k;
    }

    @Override
    public void setK(int k) {
        this.k = k;
    }
    
    @Override
    public void add() {
        k = i+j;
    }
    
}
