package homework7;

import java.util.ArrayList;

public class _16211451_chenboyang_7_Controller {
	public _16211451_chenboyang_7_BookCatalog bookcatalog;
	public _16211451_chenboyang_7_Sale sale;
	_16211451_chenboyang_7_Controller() {
		bookcatalog=new _16211451_chenboyang_7_BookCatalog();
	}
	public void AddBook(double price,String name,int type,String isbn) {
		bookcatalog.add(new _16211451_chenboyang_7_ProductSpecification(price,name,type,isbn));
	}
	public _16211451_chenboyang_7_ProductSpecification getBookSpecification(String s){
		return  bookcatalog.getBookSpecification(s);
	}
	public _16211451_chenboyang_7_IPricingStrategy getStrategy(String number) {
		return _16211451_chenboyang_7_PricingStrategyFactory.getInstance().getCatalog().getStrategy(number);
	}
	public ArrayList<_16211451_chenboyang_7_IPricingStrategy> getStrategy(int type){
		return _16211451_chenboyang_7_PricingStrategyFactory.getInstance().getCatalog().getStrategy(type);
	}
	public void addStrategy(_16211451_chenboyang_7_IPricingStrategy s,String n) {
		_16211451_chenboyang_7_PricingStrategyFactory.getInstance().getCatalog().addStrategy(s, n);
	}
	public void delStrategy(String s) {
		_16211451_chenboyang_7_PricingStrategyFactory.getInstance().getCatalog().delStrategy(s);
	}
	public _16211451_chenboyang_7_Sale getSale() {
		sale=new _16211451_chenboyang_7_Sale();
		return sale;
	}

}
