package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.UIManager;

public class _16211451_chenboyang_7_StrategiesUI extends JDialog implements  ActionListener{

	private final JPanel contentPanel = new JPanel();
	private _16211451_chenboyang_7_Controller controller;
	private JButton btnAddstrategy;
	private JButton btnEditstrategy;
	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_StrategiesUI(_16211451_chenboyang_7_Controller c) {
		setAutoRequestFocus(false);
		setResizable(false);
		controller=c;
		setTitle("StrategiesUI");
		setModal(true);
		setBounds(100, 100, 345, 341);
		this.setContentPane(contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{77, 21, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{79, 0, 0, 82, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		btnAddstrategy = new JButton("Add New Strategy");
		GridBagConstraints gbc_btnAddstrategy = new GridBagConstraints();
		gbc_btnAddstrategy.anchor = GridBagConstraints.SOUTH;
		gbc_btnAddstrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddstrategy.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddstrategy.gridx = 3;
		gbc_btnAddstrategy.gridy = 2;
		contentPanel.add(btnAddstrategy, gbc_btnAddstrategy);
		btnAddstrategy.addActionListener(this);
		
		btnEditstrategy = new JButton("Edit Current Strategy");
		GridBagConstraints gbc_btnEditstrategy = new GridBagConstraints();
		gbc_btnEditstrategy.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditstrategy.anchor = GridBagConstraints.NORTH;
		gbc_btnEditstrategy.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditstrategy.gridx = 3;
		gbc_btnEditstrategy.gridy = 6;
		contentPanel.add(btnEditstrategy, gbc_btnEditstrategy);
		btnEditstrategy.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAddstrategy) {
			_16211451_chenboyang_7_AddStrategyUI addstrategyui=new _16211451_chenboyang_7_AddStrategyUI(controller);
			addstrategyui.setVisible(true);
		}
		else if(e.getSource()==btnEditstrategy) {
			_16211451_chenboyang_7_InputStrategyNumber inputstrategynumber=new _16211451_chenboyang_7_InputStrategyNumber(controller);
			inputstrategynumber.setVisible(true);
		}
		
		
	}

}
