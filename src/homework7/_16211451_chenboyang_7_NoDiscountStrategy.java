package homework7;

public class _16211451_chenboyang_7_NoDiscountStrategy extends _16211451_chenboyang_7_StrategyInfo {
	public _16211451_chenboyang_7_NoDiscountStrategy() {
		super("",0,"");
	}
	public String getDynmaic() {
		throw new RuntimeException();
	}
	public double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item) {
		return item.getProdSpec().getPrice()*item.getCopies();
	}
}
