package homework7;

import java.util.ArrayList;

public abstract class _16211451_chenboyang_7_CopositeStrategy extends _16211451_chenboyang_7_StrategyInfo {
	ArrayList<_16211451_chenboyang_7_IPricingStrategy> strategies;
	public _16211451_chenboyang_7_CopositeStrategy(String strategy_name,int available_type,String number){
		super(strategy_name,available_type,number);
		strategies =new ArrayList<_16211451_chenboyang_7_IPricingStrategy>();
	}
	public void add(_16211451_chenboyang_7_IPricingStrategy strategy) {
		strategies.add(strategy);
	}
	@Override
	public abstract double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item) ;
	public String strategytoString() {
		String str=((_16211451_chenboyang_7_StrategyInfo)strategies.get(0)).getSerial_number();
		for(int i=1;i<strategies.size();i++) {
			str+="|"+((_16211451_chenboyang_7_StrategyInfo)strategies.get(i)).getSerial_number();
		}
		return str;
	}
	public String getDynmaic() {
		return strategytoString();
	}
}
