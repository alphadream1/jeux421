package monPackage;

import java.awt.EventQueue;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Ihm window = new Ihm();
					window.frame.setVisible(true);
					Controler controler = new Controler();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
