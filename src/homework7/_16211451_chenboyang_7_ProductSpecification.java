package homework7;

public class _16211451_chenboyang_7_ProductSpecification {
	private double price;
	private String title;
	private int type;
	private String isbn;
	public static final int nontextbook=1;
	public static final int textbook=2;
	public static final int comic=3;
	public static final int health=4;
	public static final int others=5;
	_16211451_chenboyang_7_ProductSpecification(double price,String title,int type,String isbn){
		
		setPrice(price);
		setTitle(title);
		setType(type);
		setIsbn(isbn);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	String getBookType(int type) {
		 switch(type) {
		 case _16211451_chenboyang_7_ProductSpecification.nontextbook:return "non-textbook computer";
		 case _16211451_chenboyang_7_ProductSpecification.textbook:return "textbook";
		 case _16211451_chenboyang_7_ProductSpecification.comic:return "comic";
		 case _16211451_chenboyang_7_ProductSpecification.health:return "health";
		 case _16211451_chenboyang_7_ProductSpecification.others:return "others";
		 default:throw new RuntimeException();
		 }
	 }
	public String toString(){
		return "<html><body>"+"<p>Title:"+getTitle()+"</p>"+"<p>ISBN:"+getIsbn()+"</p>"+"<p>Book Type:"+getBookType(this.getType())+"</p>"+"<p>Price:"+String.format("%.2f", this.getPrice())+"</p>"+"<body></html>";
		
	}
}
