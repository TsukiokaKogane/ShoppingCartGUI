package homework7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class _16211451_chenboyang_7_WarningWindow extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JLabel lblWarningmessage;

	/**
	 * Create the dialog.
	 */
	public _16211451_chenboyang_7_WarningWindow() {
		this("");
	}
	public _16211451_chenboyang_7_WarningWindow(String msg) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(_16211451_chenboyang_7_WarningWindow.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		setModal(true);
		setAlwaysOnTop(true);
		setTitle("SystemInfo");
		setBounds(100, 100, 587, 199);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblWarningmessage = new JLabel(msg);
			lblWarningmessage.setForeground(Color.RED);
			lblWarningmessage.setHorizontalAlignment(SwingConstants.CENTER);
			lblWarningmessage.setBackground(new Color(255, 255, 255));
			lblWarningmessage.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		}
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		contentPanel.add(lblWarningmessage);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			buttonPane.add(okButton);
			okButton.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("OK")) {
			this.dispose();
		}
	}

}
