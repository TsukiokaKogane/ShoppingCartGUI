package homework7;

public class _16211451_chenboyang_7_PercentageStrategy extends _16211451_chenboyang_7_StrategyInfo {
	
	private double discountPercentage;
	public _16211451_chenboyang_7_PercentageStrategy(String strategy_name,int available_type,double discountPercentage,String number) {
		super(strategy_name,available_type,number);
		this.discountPercentage=discountPercentage;
		//System.out.println(String.format("%.2f", this.discountPercentage));
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	@Override
	public double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item) {
		return item.getProdSpec().getPrice()*item.getCopies()*(100.0-getDiscountPercentage())/100.0;
	}
	public String getDynmaic() {
		return String.valueOf(discountPercentage);
	}
}
