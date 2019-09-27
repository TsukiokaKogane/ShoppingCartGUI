package homework7;

public class _16211451_chenboyang_7_FlatRateStrategy extends _16211451_chenboyang_7_StrategyInfo {
	private double discountPerBook;
	public double getDiscountPerBook() {
		return discountPerBook;
	}
	public _16211451_chenboyang_7_FlatRateStrategy(String strategy_name,int available_type,double discountPerBook,String number){
		super(strategy_name,available_type,number);
		this.discountPerBook=discountPerBook;
	}
	@Override
	public double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item){
		// TODO Auto-generated method stub
		return (item.getProdSpec().getPrice()-getDiscountPerBook())*item.getCopies();
	}
	public String getDynmaic() {
		return String.valueOf(discountPerBook);
	}
}

