package homework7;

import java.awt.EventQueue;

public class _16211451_chenboyang_7_ShoppingCartTest {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16211451_chenboyang_7_StrategyCatalog catalog=new _16211451_chenboyang_7_StrategyCatalog();
					_16211451_chenboyang_7_IPricingStrategy strategy1=new _16211451_chenboyang_7_FlatRateStrategy("绝对值优惠策略1",_16211451_chenboyang_7_ProductSpecification.textbook,1,"Discount001");
					catalog.addStrategy(strategy1,strategy1.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy2=new _16211451_chenboyang_7_PercentageStrategy("百分比折扣策略1",_16211451_chenboyang_7_ProductSpecification.comic,7,"Discount002");
					catalog.addStrategy(strategy2,strategy2.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy3=new _16211451_chenboyang_7_PercentageStrategy("百分比折扣策略2",_16211451_chenboyang_7_ProductSpecification.nontextbook,3,"Discount003");
					catalog.addStrategy(strategy3,strategy3.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy4 =new _16211451_chenboyang_7_CopositeBestForCustomer("顾客最优策略1",_16211451_chenboyang_7_ProductSpecification.health,"Discount004");
					((_16211451_chenboyang_7_CopositeStrategy)strategy4).add(strategy1);
					((_16211451_chenboyang_7_CopositeStrategy)strategy4).add(strategy3);
					catalog.addStrategy(strategy4,strategy4.getSerial_number());
					_16211451_chenboyang_7_PricingStrategyFactory.getInstance().setCatalgo(catalog);
					
					_16211451_chenboyang_7_MainUI frame = new _16211451_chenboyang_7_MainUI();
					frame.controller.AddBook(18, "UML与模式应用", _16211451_chenboyang_7_ProductSpecification.nontextbook, "978-7-302-2");
					frame.controller.AddBook(34, "Java与模式", _16211451_chenboyang_7_ProductSpecification.textbook, "978-7-312-3");
					frame.controller.AddBook(58, "HeadFirst 设计模式", _16211451_chenboyang_7_ProductSpecification.textbook, "968-6-302-1");
					frame.controller.AddBook(30, "爱丽丝历险记", _16211451_chenboyang_7_ProductSpecification.comic, "958-1-302-2");
					frame.controller.AddBook(20, "煲汤大全", _16211451_chenboyang_7_ProductSpecification.health, "900-7-392-2");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
