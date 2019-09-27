package homework7;

import java.util.Iterator;

public class _16211451_chenboyang_7_CopositeBestForCustomer extends _16211451_chenboyang_7_CopositeStrategy {
	public _16211451_chenboyang_7_CopositeBestForCustomer(String strategy_name,int available_type,String number) {
		super(strategy_name,available_type,number);
	}
	@Override
	public double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item) {
		double minPrice=Double.MAX_VALUE;
		//System.out.println("!!!!!!");
		Iterator<_16211451_chenboyang_7_IPricingStrategy> iter=super.strategies.iterator();
		while(iter.hasNext()) {
			_16211451_chenboyang_7_IPricingStrategy tmp=(_16211451_chenboyang_7_IPricingStrategy)iter.next();
			double tmpPrice=tmp.getSubTotoal(item);
			if(minPrice>tmpPrice)minPrice=tmpPrice;
		}
		return minPrice;
	}
}
