package dk.cphbusiness.soa.tax;

import dk.cphbusiness.soa.contract.ServiceContract;
import java.math.BigDecimal;

public interface TaxService extends ServiceContract {
  TaxBill calculateBill(BigDecimal amount);
  }
