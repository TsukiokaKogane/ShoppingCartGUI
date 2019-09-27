package homework7;

public class _16211451_chenboyang_7_SaleLineItem {
	private int copies;
	private _16211451_chenboyang_7_ProductSpecification prodSpec;
	private _16211451_chenboyang_7_IPricingStrategy strategy;
	_16211451_chenboyang_7_SaleLineItem(int copies,_16211451_chenboyang_7_ProductSpecification prodSpec){
		setCopies(copies);
		setProdSpec(prodSpec);
		this.strategy=_16211451_chenboyang_7_PricingStrategyFactory.getPricingStrategy(this);
	}
	double getSubTotal() {
		return strategy.getSubTotoal(this);
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public _16211451_chenboyang_7_ProductSpecification getProdSpec() {
		return prodSpec;
	}
	public void setProdSpec(_16211451_chenboyang_7_ProductSpecification prodSpec) {
		this.prodSpec = prodSpec;
	}
}
