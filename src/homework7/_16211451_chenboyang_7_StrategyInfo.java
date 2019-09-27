package homework7;

public abstract class _16211451_chenboyang_7_StrategyInfo implements _16211451_chenboyang_7_IPricingStrategy{
	private String strategy_name;
	private int available_type;
	private String serial_number;
	_16211451_chenboyang_7_StrategyInfo(String strategy_name,int available_type,String number){
		setStrategy_name(strategy_name);
		setAvailable_type(available_type);
		setSerial_number(number);
	}
	public String getStrategy_name() {
		return strategy_name;
	}
	public void setStrategy_name(String strategy_name) {
		this.strategy_name = strategy_name;
	}
	public abstract double getSubTotoal(_16211451_chenboyang_7_SaleLineItem item);
	public abstract String getDynmaic();
	public int getAvailable_type() {
		return available_type;
	}
	public void setAvailable_type(int available_type) {
		this.available_type = available_type;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
}