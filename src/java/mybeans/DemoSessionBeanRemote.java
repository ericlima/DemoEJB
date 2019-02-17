package mybeans;

import javax.ejb.Remote;

@Remote
public interface DemoSessionBeanRemote {

    int getI();

    void setI(int i);

    int getJ();

    void setJ(int j);

    int getK();

    void setK(int k);
    
    void add() ;  
}
