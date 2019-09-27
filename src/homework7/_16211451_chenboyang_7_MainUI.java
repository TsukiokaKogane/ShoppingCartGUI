package homework7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class _16211451_chenboyang_7_MainUI extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JButton btnAddbookui;
	private JButton btnAddstrategyui;
	private JButton btnBuyui;
	public _16211451_chenboyang_7_Controller controller;

	/**
	 * Create the frame. 
	 */
	public _16211451_chenboyang_7_MainUI() {
		setResizable(false);
		controller =new _16211451_chenboyang_7_Controller();
		setTitle("MainUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{82, 201, 0};
		gbl_contentPane.rowHeights = new int[]{56, 39, 39, 39, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		btnAddstrategyui = new JButton("StrategyUI");
		btnAddstrategyui.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		btnAddstrategyui.addActionListener(this);
		
		btnAddbookui = new JButton("AddBookUI");
		btnAddbookui.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		btnAddbookui.addActionListener(this);
		GridBagConstraints gbc_btnAddbookui = new GridBagConstraints();
		gbc_btnAddbookui.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddbookui.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddbookui.gridx = 1;
		gbc_btnAddbookui.gridy = 1;
		contentPane.add(btnAddbookui, gbc_btnAddbookui);
		GridBagConstraints gbc_btnAddstrategyui = new GridBagConstraints();
		gbc_btnAddstrategyui.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddstrategyui.anchor = GridBagConstraints.NORTH;
		gbc_btnAddstrategyui.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddstrategyui.gridx = 1;
		gbc_btnAddstrategyui.gridy = 2;
		contentPane.add(btnAddstrategyui, gbc_btnAddstrategyui);
		
		btnBuyui = new JButton("BuyUI");
		btnBuyui.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		GridBagConstraints gbc_btnBuyui = new GridBagConstraints();
		gbc_btnBuyui.fill = GridBagConstraints.BOTH;
		gbc_btnBuyui.gridx = 1;
		gbc_btnBuyui.gridy = 3;
		contentPane.add(btnBuyui, gbc_btnBuyui);
		btnBuyui.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAddbookui) {
			_16211451_chenboyang_7_AddBookUI addbookui =new _16211451_chenboyang_7_AddBookUI(controller);
			addbookui.setVisible(true);
			
		}
		else if(e.getSource()==btnAddstrategyui) {
			_16211451_chenboyang_7_StrategiesUI strategiesui =new _16211451_chenboyang_7_StrategiesUI(controller);
			strategiesui.setVisible(true);
			
		}
		else if(e.getSource()==btnBuyui) {
			_16211451_chenboyang_7_BuyUI buyui=new _16211451_chenboyang_7_BuyUI(controller);
		}
		
	}
}
