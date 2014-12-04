package dk.cphbusiness.soa.tax;

import java.math.BigDecimal;

public class TaxBillLine {
  private String type;
  private BigDecimal amount;

  public TaxBillLine(String type, BigDecimal amount) {
    this.type = type;
    this.amount = amount;
    }

  public String getType() {
    return type;
    }

  public BigDecimal getAmount() {
    return amount;
    }
  
  }
