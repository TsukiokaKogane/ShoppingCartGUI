package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class _16211451_chenboyang_7_ShoppingCartUI extends JDialog implements _16211451_chenboyang_7_Observer, WindowListener{

	private JPanel panel; 
	private JPanel panel_1;
	private JScrollPane scrollPane ;
	private JLabel lblTotoalprice;
	private _16211451_chenboyang_7_Sale sale;
	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_ShoppingCartUI(_16211451_chenboyang_7_Sale s) {
		sale=s;
		this.addWindowListener(this);
		setTitle("ShoppingCartUI");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			panel = new JPanel();
			getContentPane().add(panel, BorderLayout.SOUTH);
			{
				 lblTotoalprice = new JLabel("TotoalPrice");
				panel.add(lblTotoalprice);
			}
		}
		{
			 scrollPane = new JScrollPane();
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				panel_1 = new JPanel();
				scrollPane.setViewportView(panel_1);
			}
		}
		Update(s);
		s.registerObserver(this);
	}
	@Override
	public void Update(_16211451_chenboyang_7_Sale s) {
		sale=s;
		ArrayList<_16211451_chenboyang_7_SaleLineItem>items =s.getSaleitems();
		if(items.isEmpty()==true) {
			panel_1 = new JPanel();
			scrollPane.setViewportView(panel_1);
			panel_1.setLayout(new FlowLayout());
			panel_1.add(new JLabel("Empty"));		
			lblTotoalprice.setText("Totoal Price: 0.00");
		}
		else {
		    panel_1 = new JPanel();
			scrollPane.setViewportView(panel_1);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{422, 0};
			gbl_panel_1.rowHeights = new int[items.size()+1];
			gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[items.size()+1];
			JLabel lblmyLabel[]=new JLabel[items.size()];
			for(int i=0;i<items.size();i++)gbl_panel_1.rowHeights[i]=50;
			gbl_panel_1.rowWeights[items.size()]=Double.MIN_VALUE;
			panel_1.setLayout(gbl_panel_1);
			for(int i=0;i<items.size();i++) {
				lblmyLabel[i]= new JLabel(items.get(i).getProdSpec().getTitle()+"  "+"x"+String.valueOf(items.get(i).getCopies()));
				GridBagConstraints gbc_lblNewLabel= new GridBagConstraints();
				gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
				gbc_lblNewLabel.fill = GridBagConstraints.NONE;
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = i;
				panel_1.add(lblmyLabel[i], gbc_lblNewLabel);
			}
			lblTotoalprice.setText("Totoal Price: "+String.format("%.2f", s.getTotal()));
		}
		this.validate();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		//System.out.println("start");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("final");
		sale.removeObserver(this);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
