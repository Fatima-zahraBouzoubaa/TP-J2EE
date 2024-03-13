package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//au demarrage, creation d'une instance "metier"
@Component("metier")
public class MetierImpl implements IMetier{
    //injection des dependances
   @Autowired
    @Qualifier("dao")
    private IDao dao ;
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*647/Math.sin(tmp*Math.PI);
        return res;
    }
    //injection des dependances
  // public MetierImpl(IDao dao) {
     //   this.dao = dao;
   // }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
