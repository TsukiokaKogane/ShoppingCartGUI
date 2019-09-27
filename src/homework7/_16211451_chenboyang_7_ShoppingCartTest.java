package homework7;

import java.awt.EventQueue;

public class _16211451_chenboyang_7_ShoppingCartTest {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16211451_chenboyang_7_StrategyCatalog catalog=new _16211451_chenboyang_7_StrategyCatalog();
					_16211451_chenboyang_7_IPricingStrategy strategy1=new _16211451_chenboyang_7_FlatRateStrategy("����ֵ�Żݲ���1",_16211451_chenboyang_7_ProductSpecification.textbook,1,"Discount001");
					catalog.addStrategy(strategy1,strategy1.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy2=new _16211451_chenboyang_7_PercentageStrategy("�ٷֱ��ۿ۲���1",_16211451_chenboyang_7_ProductSpecification.comic,7,"Discount002");
					catalog.addStrategy(strategy2,strategy2.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy3=new _16211451_chenboyang_7_PercentageStrategy("�ٷֱ��ۿ۲���2",_16211451_chenboyang_7_ProductSpecification.nontextbook,3,"Discount003");
					catalog.addStrategy(strategy3,strategy3.getSerial_number());
					_16211451_chenboyang_7_IPricingStrategy strategy4 =new _16211451_chenboyang_7_CopositeBestForCustomer("�˿����Ų���1",_16211451_chenboyang_7_ProductSpecification.health,"Discount004");
					((_16211451_chenboyang_7_CopositeStrategy)strategy4).add(strategy1);
					((_16211451_chenboyang_7_CopositeStrategy)strategy4).add(strategy3);
					catalog.addStrategy(strategy4,strategy4.getSerial_number());
					_16211451_chenboyang_7_PricingStrategyFactory.getInstance().setCatalgo(catalog);
					
					_16211451_chenboyang_7_MainUI frame = new _16211451_chenboyang_7_MainUI();
					frame.controller.AddBook(18, "UML��ģʽӦ��", _16211451_chenboyang_7_ProductSpecification.nontextbook, "978-7-302-2");
					frame.controller.AddBook(34, "Java��ģʽ", _16211451_chenboyang_7_ProductSpecification.textbook, "978-7-312-3");
					frame.controller.AddBook(58, "HeadFirst ���ģʽ", _16211451_chenboyang_7_ProductSpecification.textbook, "968-6-302-1");
					frame.controller.AddBook(30, "����˿���ռ�", _16211451_chenboyang_7_ProductSpecification.comic, "958-1-302-2");
					frame.controller.AddBook(20, "������ȫ", _16211451_chenboyang_7_ProductSpecification.health, "900-7-392-2");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
