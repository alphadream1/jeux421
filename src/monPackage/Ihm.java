package monPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ihm {

	// --------
	// attribut
	// --------

	JFrame frame;
	private JTextField textFieldDe1;
	private JTextField textFieldDe2;
	private JTextField textFieldDe3;
	private JTextField txtScoreJoueur1;
	private JTextField txtScoreJoueur2;

	/**
	 * Create the application.
	 */
	public Ihm() {
		initialize();
	}

	// --------
	// methodes
	// --------

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(144, 238, 144));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textFieldDe1 = new JTextField();
		textFieldDe1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDe1.setText("0");
		textFieldDe1.setBounds(150, 230, 55, 55);
		frame.getContentPane().add(textFieldDe1);
		textFieldDe1.setColumns(10);

		textFieldDe2 = new JTextField();
		textFieldDe2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDe2.setText("0");
		textFieldDe2.setColumns(10);
		textFieldDe2.setBounds(260, 230, 55, 55);
		frame.getContentPane().add(textFieldDe2);

		textFieldDe3 = new JTextField();
		textFieldDe3.setText("0");
		textFieldDe3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDe3.setColumns(10);
		textFieldDe3.setBounds(375, 230, 55, 55);
		frame.getContentPane().add(textFieldDe3);

		JLabel lblDe1 = new JLabel("De 1");
		lblDe1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe1.setBounds(150, 205, 55, 14);
		frame.getContentPane().add(lblDe1);

		JLabel lblDe2 = new JLabel("De 2");
		lblDe2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe2.setBounds(250, 205, 55, 14);
		frame.getContentPane().add(lblDe2);

		JLabel lblDe3 = new JLabel("De 3");
		lblDe3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe3.setBounds(350, 205, 55, 14);
		frame.getContentPane().add(lblDe3);

		JButton btnBlockDe1 = new JButton("stop");
		btnBlockDe1.setForeground(new Color(255, 0, 0));
		btnBlockDe1.setBackground(new Color(255, 0, 0));
		btnBlockDe1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBlockDe1.setBounds(150, 302, 55, 36);
		frame.getContentPane().add(btnBlockDe1);

		JButton btnBlockDe2 = new JButton("Stop");
		btnBlockDe2.setBackground(new Color(255, 0, 0));
		btnBlockDe2.setForeground(new Color(255, 0, 0));
		btnBlockDe2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBlockDe2.setBounds(260, 302, 55, 36);
		frame.getContentPane().add(btnBlockDe2);

		JButton btnBlockDe3 = new JButton("Stop");
		btnBlockDe3.setForeground(new Color(255, 0, 0));
		btnBlockDe3.setBackground(new Color(255, 0, 0));
		btnBlockDe3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBlockDe3.setBounds(375, 302, 55, 36);
		frame.getContentPane().add(btnBlockDe3);

		JButton btnLancerLesDes = new JButton("Lancer le(s) de(s)");
		btnLancerLesDes.setForeground(new Color(0, 0, 255));
		btnLancerLesDes.setBackground(new Color(0, 0, 255));
		btnLancerLesDes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLancerLesDes.setBounds(221, 139, 129, 41);
		frame.getContentPane().add(btnLancerLesDes);

		txtScoreJoueur1 = new JTextField();
		txtScoreJoueur1.setHorizontalAlignment(SwingConstants.CENTER);
		txtScoreJoueur1.setText("Score joueur 1");
		txtScoreJoueur1.setBounds(10, 163, 86, 31);
		frame.getContentPane().add(txtScoreJoueur1);
		txtScoreJoueur1.setColumns(10);

		txtScoreJoueur2 = new JTextField();
		txtScoreJoueur2.setText("Score joueur 2");
		txtScoreJoueur2.setHorizontalAlignment(SwingConstants.CENTER);
		txtScoreJoueur2.setColumns(10);
		txtScoreJoueur2.setBounds(488, 163, 86, 31);
		frame.getContentPane().add(txtScoreJoueur2);

		JLabel lblJoueur1 = new JLabel("Joueur 1");
		lblJoueur1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoueur1.setBounds(10, 121, 86, 31);
		frame.getContentPane().add(lblJoueur1);

		JLabel lblJoueur2 = new JLabel("Joueur 2");
		lblJoueur2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoueur2.setBounds(488, 121, 86, 31);
		frame.getContentPane().add(lblJoueur2);

		JButton btnNouvellePartie = new JButton("Nouvelle Partie");
		btnNouvellePartie.setFont(new Font("Sitka Heading", Font.BOLD, 12));
		btnNouvellePartie.setForeground(new Color(255, 0, 255));
		btnNouvellePartie.setBackground(new Color(255, 0, 255));
		btnNouvellePartie.setBounds(10, 11, 123, 36);
		frame.getContentPane().add(btnNouvellePartie);

		JLabel lblTour = new JLabel("N\u00B0 du TOUR");
		lblTour.setForeground(new Color(0, 0, 255));
		lblTour.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblTour.setBackground(new Color(127, 255, 0));
		lblTour.setHorizontalAlignment(SwingConstants.CENTER);
		lblTour.setBounds(478, 16, 96, 24);
		frame.getContentPane().add(lblTour);

		JLabel lblNbrTour = new JLabel("12");
		lblNbrTour.setForeground(new Color(0, 0, 255));
		lblNbrTour.setBackground(new Color(0, 0, 255));
		lblNbrTour.setHorizontalAlignment(SwingConstants.CENTER);
		lblNbrTour.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNbrTour.setBounds(478, 51, 96, 24);
		frame.getContentPane().add(lblNbrTour);

		JLabel lblLancer = new JLabel("N\u00B0 du LANCER");
		lblLancer.setHorizontalAlignment(SwingConstants.CENTER);
		lblLancer.setForeground(Color.BLUE);
		lblLancer.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblLancer.setBackground(new Color(127, 255, 0));
		lblLancer.setBounds(221, 66, 129, 24);
		frame.getContentPane().add(lblLancer);

		JLabel lblNbrLancer = new JLabel("3");
		lblNbrLancer.setHorizontalAlignment(SwingConstants.CENTER);
		lblNbrLancer.setForeground(Color.BLUE);
		lblNbrLancer.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNbrLancer.setBackground(Color.BLUE);
		lblNbrLancer.setBounds(221, 101, 129, 24);
		frame.getContentPane().add(lblNbrLancer);
	}

	// ----------------
	// getter & setter
	// ---------------
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldDe1() {
		return textFieldDe1;
	}

	public void setTextFieldDe1(JTextField textFieldDe1) {
		this.textFieldDe1 = textFieldDe1;
	}

	public JTextField getTextFieldDe2() {
		return textFieldDe2;
	}

	public void setTextFieldDe2(JTextField textFieldDe2) {
		this.textFieldDe2 = textFieldDe2;
	}

	public JTextField getTextFieldDe3() {
		return textFieldDe3;
	}

	public void setTextFieldDe3(JTextField textFieldDe3) {
		this.textFieldDe3 = textFieldDe3;
	}

	public JTextField getTxtScoreJoueur1() {
		return txtScoreJoueur1;
	}

	public void setTxtScoreJoueur1(JTextField txtScoreJoueur1) {
		this.txtScoreJoueur1 = txtScoreJoueur1;
	}

	public JTextField getTxtScoreJoueur2() {
		return txtScoreJoueur2;
	}

	public void setTxtScoreJoueur2(JTextField txtScoreJoueur2) {
		this.txtScoreJoueur2 = txtScoreJoueur2;
	}
}
