package auditoria;

import env.Banco;
import env.IBanco;

public class Auditor {

  public boolean investigaSaudeBanco(IBanco banco){
    Object o;
    if (banco.saldoTotal()/banco.numeroContas() >= 500){
      return true;
    }
    return false;
  }

}
