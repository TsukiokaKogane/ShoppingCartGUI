package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Color;
import javax.swing.JTextField;

public class _16211451_chenboyang_7_BuyUI extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIsbninput;
	private JTextField txtNumberinput;
	private JLabel lblBookinfo;
	private JButton okButton;
	private _16211451_chenboyang_7_Controller controller;
	private _16211451_chenboyang_7_Sale asale;
	//private ShoppingCartUI shoppingcartui;
	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_BuyUI(_16211451_chenboyang_7_Controller c) {
		
		setTitle("BuyUI");
		controller=c;
		asale=controller.getSale();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			
			lblBookinfo = new JLabel("BookInfo");
			panel.add(lblBookinfo);
			lblBookinfo.setText("No Book Found");
			
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.SOUTH);
			{
				JLabel lblIsbn = new JLabel("ISBN:");
				panel.add(lblIsbn);
			}
			{
				txtIsbninput = new JTextField();
				panel.add(txtIsbninput);
				txtIsbninput.setColumns(10);
			}
			txtIsbninput.getDocument().addDocumentListener(new DocumentListener() {
				   //监听文本内容的插入事件；
				   public void removeUpdate(DocumentEvent e) {
					   lblBookinfo.setText(getBookInfo());
				   }
				   //监听文本内容的插入事件； 
				   public void insertUpdate(DocumentEvent e) {
					   lblBookinfo.setText(getBookInfo());
				   }
				@Override
				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}
				  });
			{
				JLabel lblNumber = new JLabel("Number:");
				panel.add(lblNumber);
			}
			{
				txtNumberinput = new JTextField();
				panel.add(txtNumberinput);
				txtNumberinput.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
			    okButton = new JButton("Buy");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(this);
			}
		}
		this.setVisible(true);
		_16211451_chenboyang_7_ShoppingCartUI shoppingcartui =new _16211451_chenboyang_7_ShoppingCartUI(asale);
		shoppingcartui.setVisible(true);
	}
	String getBookInfo() {
		_16211451_chenboyang_7_ProductSpecification book=controller.getBookSpecification(txtIsbninput.getText());
		if(book==null)return "No Book Found";
		return book.toString();
	}
	boolean CheckInt(String s) {
		if(s.length()==0)return false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'0'||s.charAt(i)>'9')return false;
		}
		return true;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd=e.getActionCommand();
		if(cmd.equals("OK")) {
			try {
				if(txtIsbninput.getText().equals("")||controller.getBookSpecification(txtIsbninput.getText())==null) throw new _16211451_chenboyang_7_generalException("ii");
				if(txtNumberinput.getText().equals("")||CheckInt(txtNumberinput.getText())==false)throw new _16211451_chenboyang_7_generalException("in");
				if(Integer.valueOf(txtNumberinput.getText())<=0)throw new _16211451_chenboyang_7_generalException("in");
				asale.addSaleLineItem(new _16211451_chenboyang_7_SaleLineItem(Integer.valueOf(txtNumberinput.getText()),controller.getBookSpecification(txtIsbninput.getText())));
			}
			catch(_16211451_chenboyang_7_generalException i) {
				if(i.getSrc().equals("ii")) {
					_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow("Invalid ISBN number!");
					newWarning.setVisible(true);
					
				}
				else if(i.getSrc().equals("in")) {
					_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow("Invalid quantity!");
					newWarning.setVisible(true);
				}
			}
		}

	}

}
