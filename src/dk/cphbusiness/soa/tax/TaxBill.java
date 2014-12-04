package dk.cphbusiness.soa.tax;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TaxBill {
  private BigDecimal amount;
  private List<TaxBillLine> lines = new ArrayList<TaxBillLine>();

  public TaxBill(BigDecimal amount) {
    this.amount = amount;
    }
  
  public void add(TaxBillLine line) {
    lines.add(line);
    }

  public BigDecimal getAmount() {
    return amount;
    }

  public List<TaxBillLine> getLines() {
    return lines;
    }
  
  }
