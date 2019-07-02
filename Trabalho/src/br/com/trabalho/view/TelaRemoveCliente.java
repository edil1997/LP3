package br.com.trabalho.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaRemoveCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRemoveCliente frame = new TelaRemoveCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaRemoveCliente() {
		setBounds(100, 100, 450, 300);

	}

}
