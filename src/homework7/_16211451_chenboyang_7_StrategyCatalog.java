package homework7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class _16211451_chenboyang_7_StrategyCatalog {
	HashMap<String,_16211451_chenboyang_7_IPricingStrategy> strategies;
	_16211451_chenboyang_7_StrategyCatalog(){
		strategies=new HashMap<String,_16211451_chenboyang_7_IPricingStrategy>();
	}
	public void addStrategy(_16211451_chenboyang_7_IPricingStrategy s,String n){
		strategies.put(n,s);
	}
	public ArrayList<_16211451_chenboyang_7_IPricingStrategy> getStrategy(int type) {
		ArrayList<_16211451_chenboyang_7_IPricingStrategy>tempList =new ArrayList<_16211451_chenboyang_7_IPricingStrategy>();
		if(strategies.isEmpty()==true)return null;
		Collection<_16211451_chenboyang_7_IPricingStrategy> c=strategies.values();
		Iterator<_16211451_chenboyang_7_IPricingStrategy> iter= c.iterator();
		while(iter.hasNext()) {
			_16211451_chenboyang_7_IPricingStrategy currentStrategy = (_16211451_chenboyang_7_IPricingStrategy)iter.next();
			if(currentStrategy.getAvailable_type()==type)tempList.add(currentStrategy);
		}
		return tempList;
	}
	public _16211451_chenboyang_7_IPricingStrategy getStrategy(String number) {
		if(strategies.containsKey(number)==false)return null;
		return strategies.get(number);
	}
	public void delStrategy(String s) {
		strategies.remove(s);
	}
}