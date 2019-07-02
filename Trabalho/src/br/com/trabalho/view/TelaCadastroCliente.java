package br.com.trabalho.view;


import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaCadastroCliente extends JInternalFrame {

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        TelaCadastroCliente frame = new TelaCadastroCliente();
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
        public TelaCadastroCliente() {
                setBounds(100, 100, 450, 300);

        }

}
