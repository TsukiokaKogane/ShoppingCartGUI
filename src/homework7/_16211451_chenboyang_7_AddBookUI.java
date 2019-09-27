package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxEditor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class _16211451_chenboyang_7_AddBookUI extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JButton okButton;
	private _16211451_chenboyang_7_Controller controller;
	private JTextField txtIsbninput;
	private JLabel lblName;
	private JTextField txtNameinput;
	private JLabel lblNewbookinfo;
	private JLabel lblPrice;
	private JTextField txtPriceinput;
	private static String TypeSpace[]= {"non-textbook computer","textbook","comic","health","others"};
	JComboBox TypecomboBox;
	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_AddBookUI(_16211451_chenboyang_7_Controller c) {
		setResizable(false);
		setModal(true);
		setTitle("AddBookUI");
		controller=c;
		setBounds(100, 100, 443, 334);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("宋体", Font.PLAIN, 20));
		
		txtIsbninput = new JTextField();
		txtIsbninput.setFont(new Font("宋体", Font.PLAIN, 18));
		txtIsbninput.setColumns(10);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("宋体", Font.PLAIN, 20));
		
		txtNameinput = new JTextField();
		txtNameinput.setFont(new Font("宋体", Font.PLAIN, 18));
		txtNameinput.setColumns(10);
		
		lblNewbookinfo = new JLabel("New Book Information");
		lblNewbookinfo.setFont(new Font("宋体", Font.PLAIN, 22));
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("宋体", Font.PLAIN, 20));
		
		txtPriceinput = new JTextField();
		txtPriceinput.setFont(new Font("宋体", Font.PLAIN, 18));
		txtPriceinput.setColumns(10);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("宋体", Font.PLAIN, 20));
		
		TypecomboBox = new JComboBox(TypeSpace);
		TypecomboBox.setToolTipText("choose book type");
		TypecomboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(107)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewbookinfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(377))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblIsbn)
								.addComponent(lblName)
								.addComponent(lblPrice)
								.addComponent(lblType))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPriceinput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNameinput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtIsbninput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(TypecomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(151))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewbookinfo)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtIsbninput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIsbn))
					.addGap(15)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtNameinput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice)
						.addComponent(txtPriceinput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblType)
						.addComponent(TypecomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(119))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(this);
			
			
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(this);
			
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
	 int getBookType() {
		 String str=(String)TypecomboBox.getSelectedItem();
		 switch(str) {
		 case "non-textbook computer":return _16211451_chenboyang_7_ProductSpecification.nontextbook;
		 case "textbook":return _16211451_chenboyang_7_ProductSpecification.textbook;
		 case "comic":return _16211451_chenboyang_7_ProductSpecification.comic;
		 case "health":return _16211451_chenboyang_7_ProductSpecification.health;
		 case "others":return _16211451_chenboyang_7_ProductSpecification.others;
		 default:throw new RuntimeException();
		 }
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("OK")) {
			try {
				if(txtIsbninput.getText().equals(""))throw new _16211451_chenboyang_7_generalException("Please input book's ISBN number");
				if(txtNameinput.getText().equals(""))throw new _16211451_chenboyang_7_generalException("Please input book's name");
				if(txtPriceinput.getText().equals(""))throw new _16211451_chenboyang_7_generalException("Please input book's price");
				double price =  SafedoubleInput(txtPriceinput.getText(),"price format");
				if(controller.bookcatalog.getBookSpecification(txtIsbninput.getText())!=null)throw new _16211451_chenboyang_7_generalException("duplicate ISBN number");
				controller.AddBook(price,txtNameinput.getText(),getBookType(),txtIsbninput.getText());
				this.dispose();
				_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow("Book added successfully!");
				newWarning.setVisible(true);
			}
			catch(_16211451_chenboyang_7_generalException i) {
				_16211451_chenboyang_7_WarningWindow newWarning;
				if(i.getSrc()=="price format")newWarning=new _16211451_chenboyang_7_WarningWindow("Wrong "+i.src+" format!");
				else if(i.getSrc()=="duplicate")newWarning=new _16211451_chenboyang_7_WarningWindow("Same ISBN number is already in the bookcatalog");
				else newWarning=new _16211451_chenboyang_7_WarningWindow(i.getSrc());
				newWarning.setVisible(true);
			}
		}
		else if(cmd.equals("Cancel")) {
			this.dispose();
		}
		
	}
}
