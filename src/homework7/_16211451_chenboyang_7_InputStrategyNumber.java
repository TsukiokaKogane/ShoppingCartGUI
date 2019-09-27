package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class _16211451_chenboyang_7_InputStrategyNumber extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JButton cancelButton;
	private JLabel lblInputStrategyNumber;
	private JTextField txtStrategynumber;
	private _16211451_chenboyang_7_Controller controller;

	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_InputStrategyNumber(_16211451_chenboyang_7_Controller c) {
		setModal(true);
		controller=c;
		setTitle("Input strategy number you want to Edit");
		setBounds(100, 100, 450, 114);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblInputStrategyNumber = new JLabel("Input Strategy Number");
		contentPanel.add(lblInputStrategyNumber);
		
		txtStrategynumber = new JTextField();
		contentPanel.add(txtStrategynumber);
		txtStrategynumber.setColumns(10);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd=e.getActionCommand();
		if(cmd.equals("OK")) {
			try {
				if(txtStrategynumber.getText().equals("")) {
					throw new _16211451_chenboyang_7_generalException("please input strategy number!");
				}
				if(controller.getStrategy(txtStrategynumber.getText())==null)throw new _16211451_chenboyang_7_generalException("invalid strategy number!");
				_16211451_chenboyang_7_EditStrategyUI editstrategyui =new _16211451_chenboyang_7_EditStrategyUI(controller.getStrategy(txtStrategynumber.getText()),controller);
				this.dispose();
				editstrategyui.setVisible(true);
				
			}
			catch(_16211451_chenboyang_7_generalException i) {
				_16211451_chenboyang_7_WarningWindow newWarning=new _16211451_chenboyang_7_WarningWindow(i.getSrc());
				newWarning.setVisible(true);
				
			}
			
		}
		else if(cmd.equals("Cancel")) {
			this.dispose();
		}
	}

}
