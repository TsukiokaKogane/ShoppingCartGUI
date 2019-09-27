package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class _16211451_chenboyang_7_EditStrategyUI extends JDialog implements ActionListener,ItemListener{

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rdbtnSimpleStrategy;
	private JRadioButton rdbtnCopositeStrategy;
	private _16211451_chenboyang_7_Controller controller;
	private JButton btnSubmit;
	private JTextField txtStrategynumber;
	private JTextField txtStrategyname;
	private static String TypeSpace[]= {"non-textbook computer","textbook","comic","health","others"};
	private JLabel lblType;
	private JComboBox comboBox;
	private GroupLayout gl_contentPanel;
	private JRadioButton rdbtnPercentage;
	private JRadioButton rdbtnAbsolute;
	private JPanel panel_1;
	private JLabel lblStrategytype;
	private JLabel lblDynamic;
	private JTextField txtDynamic;
	private JButton btnDelete;

	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_EditStrategyUI(_16211451_chenboyang_7_IPricingStrategy stg,_16211451_chenboyang_7_Controller c) {
		setResizable(false);
		setTitle("Strategy "+stg.getSerial_number()+" Info");
		setModal(true);
		controller=c;
		setBounds(100, 100, 451, 342);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblStrategynumber = new JLabel("Strategy Number:");
		
		txtStrategynumber = new JTextField();
		txtStrategynumber.setColumns(10);
		
		JLabel lblStrategyname = new JLabel("Strategy Name:");
		
		txtStrategyname = new JTextField();
		txtStrategyname.setColumns(10);
		
		lblType = new JLabel("Avalible Type:");
		
		comboBox = new JComboBox(TypeSpace);
		comboBox.setToolTipText("choose book type");
		
		panel_1 = new JPanel();
		
		lblStrategytype = new JLabel("Strategy Type:");
		
		lblDynamic = new JLabel("Discount Percentage:");
		
		txtDynamic = new JTextField();
		txtDynamic.setColumns(10);
		
		
		gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(106)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStrategyname)
						.addComponent(lblStrategynumber)
						.addComponent(lblType)
						.addComponent(lblStrategytype)
						.addComponent(lblDynamic))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStrategyname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStrategynumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDynamic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStrategynumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStrategynumber))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStrategyname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStrategyname))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblType))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(28)
							.addComponent(lblStrategytype)))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDynamic)
						.addComponent(txtDynamic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		ButtonGroup group_1=new ButtonGroup();
		rdbtnPercentage = new JRadioButton("Percentage");
		rdbtnPercentage.setSelected(true);
		panel_1.add(rdbtnPercentage);
		rdbtnPercentage.addItemListener(this);
		
		rdbtnAbsolute = new JRadioButton("Absolute");
		panel_1.add(rdbtnAbsolute);
		rdbtnAbsolute.addItemListener(this);
		
		group_1.add(rdbtnPercentage);
		group_1.add(rdbtnAbsolute);
		
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			btnDelete = new JButton("Delete");
			buttonPane.add(btnDelete);
			btnDelete.addActionListener(this);
			
			btnSubmit = new JButton("Submit");
			buttonPane.add(btnSubmit);
			btnSubmit.addActionListener(this);
			
		}
		{
			JPanel panel = new JPanel();
			ButtonGroup group=new ButtonGroup();
			
			getContentPane().add(panel, BorderLayout.NORTH);
			
				rdbtnSimpleStrategy = new JRadioButton("Simple Strategy");
				rdbtnSimpleStrategy.setSelected(true);
				panel.add(rdbtnSimpleStrategy);
				rdbtnSimpleStrategy.addItemListener(this);
				rdbtnCopositeStrategy = new JRadioButton("Coposite Strategy");
				panel.add(rdbtnCopositeStrategy);
			
			group.add(rdbtnSimpleStrategy);
			group.add(rdbtnCopositeStrategy);
			
		}
		txtStrategynumber.setText(stg.getSerial_number());
		txtStrategynumber.setEditable(false);
		txtStrategyname.setText(stg.getStrategy_name());
		comboBox.setSelectedItem(getBookType(stg.getAvailable_type()));
		if(stg.getClass().getSimpleName().equals("PercentageStrategy")) {
			rdbtnSimpleStrategy.setSelected(true);
			rdbtnPercentage.setSelected(true);
			txtDynamic.setText(stg.getDynmaic());
			
		}
		else if(stg.getClass().getSimpleName().equals("FlatRateStrategy")) {
			rdbtnSimpleStrategy.setSelected(true);
			rdbtnAbsolute.setSelected(true);
			txtDynamic.setText(stg.getDynmaic());
			
		}
		else  {
			rdbtnCopositeStrategy.setSelected(true);
			txtDynamic.setText(stg.getDynmaic());
			
		}
	}
	int getBookType() {
		 String str=(String)comboBox.getSelectedItem();
		 switch(str) {
		 case "non-textbook computer":return _16211451_chenboyang_7_ProductSpecification.nontextbook;
		 case "textbook":return _16211451_chenboyang_7_ProductSpecification.textbook;
		 case "comic":return _16211451_chenboyang_7_ProductSpecification.comic;
		 case "health":return _16211451_chenboyang_7_ProductSpecification.health;
		 case "others":return _16211451_chenboyang_7_ProductSpecification.others;
		 default:throw new RuntimeException();
		 }
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
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==rdbtnSimpleStrategy) {
			if(rdbtnSimpleStrategy.isSelected()) {
				if(rdbtnPercentage.isSelected()) {
					lblDynamic.setText("Discount Percentage:");
				}
				else {
					lblDynamic.setText("Discount absolute value:");
					
				}
				rdbtnPercentage.setVisible(true);
				rdbtnAbsolute.setVisible(true);
				lblStrategytype.setVisible(true);
			}
			else {
			rdbtnPercentage.setVisible(false);
			rdbtnAbsolute.setVisible(false);
			lblStrategytype.setVisible(false);
			lblDynamic.setText("consisting simple strategy ");
			}
			
		}
		if(e.getSource()==rdbtnPercentage) {
			if(rdbtnPercentage.isSelected()) {
				lblDynamic.setText("discount Percentage ");
			}
			else {
				lblDynamic.setText("discount absolute value ");
				
			}
		}
	}
	 double SafedoubleInput(String str,String src)throws _16211451_chenboyang_7_generalException{
	        int pos = -1;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
	                if (pos != -1) throw new _16211451_chenboyang_7_generalException();
	                if (str.charAt(i) != '.') throw new _16211451_chenboyang_7_generalException(src);
	                pos = i;
	            }
	        }
	        return Double.valueOf(str);
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSubmit) {
			try {
			//if(txtStrategynumber.getText().equals(""))throw new generalException("en");
			if(txtStrategyname.getText().equals(""))throw new _16211451_chenboyang_7_generalException("esn");
			if(txtDynamic.getText().equals(""))throw new _16211451_chenboyang_7_generalException("ed");
			//if(controller.getStrategy(txtStrategynumber.getText())!=null)throw new generalException("sn");
			
			if(rdbtnSimpleStrategy.isSelected()) {
				if(rdbtnPercentage.isSelected()) {
					double val=SafedoubleInput(txtDynamic.getText(),"bp");
					if(Double.valueOf(txtDynamic.getText())>100)throw new _16211451_chenboyang_7_generalException("bp");
					controller.addStrategy(new _16211451_chenboyang_7_PercentageStrategy(txtStrategyname.getText(),getBookType(),val,txtStrategynumber.getText()), txtStrategynumber.getText());
				}
				else {
					double val=SafedoubleInput(txtDynamic.getText(),"bf");
					controller.addStrategy(new _16211451_chenboyang_7_FlatRateStrategy(txtStrategyname.getText(),getBookType(),val,txtStrategynumber.getText()), txtStrategynumber.getText());
				}
				
			}
			else {
				
				String str=txtDynamic.getText();
				String tmp="";
				int i=0;
				boolean flag=false;
				_16211451_chenboyang_7_CopositeStrategy stategy=new _16211451_chenboyang_7_CopositeBestForCustomer(txtStrategyname.getText(),getBookType(),txtStrategynumber.getText());
				while(i<str.length()) {
					if(str.charAt(i)=='|') {
						if(tmp.equals("")==false) {
							if(tmp.equals(txtStrategynumber.getText()))throw new _16211451_chenboyang_7_generalException("es");
							if(controller.getStrategy(tmp)==null||controller.getStrategy(tmp).getClass().getSimpleName().equals("CopositeStrategy"))throw new _16211451_chenboyang_7_generalException("es");
							stategy.add(controller.getStrategy(tmp));
							flag=true;
						}
						tmp="";
						i++;
						continue;
						}
					else {
						tmp+=str.charAt(i);
						i++;
					}

				}
				if(tmp.equals("")==false) {
					if(tmp.equals(txtStrategynumber.getText()))throw new _16211451_chenboyang_7_generalException("es");
					if(controller.getStrategy(tmp)==null||controller.getStrategy(tmp).getClass().getSimpleName().equals("CopositeStrategy"))throw new _16211451_chenboyang_7_generalException("es");
					stategy.add(controller.getStrategy(tmp));
					flag=true;
				}
				if(flag==false)throw new _16211451_chenboyang_7_generalException("es");
				controller.addStrategy(stategy, txtStrategynumber.getText());
			}
			this.dispose();
			_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow("Strategy added successfully !");
			newWarning.setVisible(true);
			
		}
			catch (_16211451_chenboyang_7_generalException i)
			{
				_16211451_chenboyang_7_WarningWindow newWarning;
				if(i.getSrc().equals("en"))newWarning=new _16211451_chenboyang_7_WarningWindow("please input strategy number");
				else if(i.getSrc().equals("esn"))newWarning=new _16211451_chenboyang_7_WarningWindow("please input strategy name");
				else if(i.getSrc().equals("ed"))newWarning=new _16211451_chenboyang_7_WarningWindow("please input "+lblDynamic.getText());
				else if(i.getSrc().equals("sn"))newWarning=new _16211451_chenboyang_7_WarningWindow("This strategy number is already in the system!");
				else if(i.getSrc().equals("bp"))newWarning=new _16211451_chenboyang_7_WarningWindow("This pecentage is in an incorrect form!");
				else if(i.getSrc().equals("bf"))newWarning=new _16211451_chenboyang_7_WarningWindow("This flat rate is in an incorrect form!");
				else if(i.getSrc().equals("es"))newWarning=new _16211451_chenboyang_7_WarningWindow("Invalid consisting strategy!");
				else throw new RuntimeException();
				newWarning.setVisible(true);
			}
			
		}
		else if(e.getSource()==btnDelete) {
			controller.delStrategy(txtStrategynumber.getText());
			this.dispose();
			_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow("Strategy deleted successfully !");
			newWarning.setVisible(true);

		}
	}
}
