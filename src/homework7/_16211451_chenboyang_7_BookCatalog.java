package homework7;

import java.util.ArrayList;
import java.util.Iterator;

public class _16211451_chenboyang_7_BookCatalog {
	ArrayList<_16211451_chenboyang_7_ProductSpecification>books;
	_16211451_chenboyang_7_BookCatalog(){
		books = new ArrayList<_16211451_chenboyang_7_ProductSpecification>();
	}
	public _16211451_chenboyang_7_ProductSpecification getBookSpecification(String s) {
		Iterator<_16211451_chenboyang_7_ProductSpecification> iter = books.iterator();
		while(iter.hasNext()){
			_16211451_chenboyang_7_ProductSpecification tmp =(_16211451_chenboyang_7_ProductSpecification) iter.next();
			if(tmp.getIsbn().equals(s))return tmp;
		}
		return null;
	}
	public void add(_16211451_chenboyang_7_ProductSpecification book) {
		books.add(book);
	}
}
