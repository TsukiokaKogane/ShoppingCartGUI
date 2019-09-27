package homework7;

import java.util.ArrayList;
import java.util.Iterator;
public class _16211451_chenboyang_7_Sale implements _16211451_chenboyang_7_Subject{
	ArrayList<_16211451_chenboyang_7_SaleLineItem> items;
	private ArrayList<_16211451_chenboyang_7_Observer> observers;
	public _16211451_chenboyang_7_Sale(){
		items=new ArrayList<_16211451_chenboyang_7_SaleLineItem>();
		observers =new ArrayList<_16211451_chenboyang_7_Observer>();
	}
	public ArrayList<_16211451_chenboyang_7_SaleLineItem> getSaleitems(){
		return items;
	}
	public void addSaleLineItem(_16211451_chenboyang_7_SaleLineItem item){
		for(int i=0;i<items.size();i++) 
			if(items.get(i).getProdSpec().getIsbn().equals(item.getProdSpec().getIsbn())==true)
					{
						items.get(i).setCopies(items.get(i).getCopies()+item.getCopies());
						notifyObserver();
						return;
				}
		items.add(item);
		notifyObserver();
	}
	public double getTotal(){
		double total=0.0;
		Iterator<_16211451_chenboyang_7_SaleLineItem> iter= items.iterator();
		 while(iter.hasNext()){
			 _16211451_chenboyang_7_SaleLineItem tmp=(_16211451_chenboyang_7_SaleLineItem)iter.next();
			 total+=tmp.getSubTotal();
         }
		 return total;
	}
	@Override
	public void removeObserver(_16211451_chenboyang_7_Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	@Override
	public void registerObserver(_16211451_chenboyang_7_Observer o) {
		observers.add(o);
	}
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			_16211451_chenboyang_7_Observer observer = (_16211451_chenboyang_7_Observer)observers.get(i);
			observer.Update(this);
			}
	}

}
