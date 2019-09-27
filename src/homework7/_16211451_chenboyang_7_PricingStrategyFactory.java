package homework7;

import java.util.ArrayList;
import java.util.Iterator;

public class _16211451_chenboyang_7_PricingStrategyFactory{
	public static _16211451_chenboyang_7_PricingStrategyFactory instance;
	public static _16211451_chenboyang_7_StrategyCatalog catalog;
    public synchronized static _16211451_chenboyang_7_PricingStrategyFactory getInstance(){  
        if(instance == null)instance = new _16211451_chenboyang_7_PricingStrategyFactory();  
        return instance;  
    }
	public static _16211451_chenboyang_7_IPricingStrategy getPricingStrategy(_16211451_chenboyang_7_SaleLineItem book) {
		ArrayList<_16211451_chenboyang_7_IPricingStrategy> strategies;
		_16211451_chenboyang_7_IPricingStrategy bestStrategy=new _16211451_chenboyang_7_NoDiscountStrategy();
		if(catalog==null)return bestStrategy;
		strategies = catalog.getStrategy(book.getProdSpec().getType());
		if(strategies==null)return bestStrategy;
		Iterator iter =strategies.iterator();
		while(iter.hasNext()){
			_16211451_chenboyang_7_IPricingStrategy currentStrategy=(_16211451_chenboyang_7_IPricingStrategy)iter.next();
			if(currentStrategy.getSubTotoal(book)<bestStrategy.getSubTotoal(book))bestStrategy=currentStrategy;
		}
		return bestStrategy;
	}
	public void setCatalgo(_16211451_chenboyang_7_StrategyCatalog catalog)
	{
		this.catalog=catalog;
	}
	public _16211451_chenboyang_7_StrategyCatalog getCatalog()
	{
		return this.catalog;
	}
	
}
