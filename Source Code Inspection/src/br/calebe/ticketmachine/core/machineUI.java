/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 31530788
 */
public class machineUI {
    
    public void MainScreen(){
        JFrame frame;
        frame = new JFrame("Sistema de Emição de Passagens");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        
        frame.setSize(400,300);
        frame.setLocation(
                dim.width/2-frame.getSize().width/2,
                dim.height/2-frame.getSize().height/2);
        
        frame.add(PanelSaldo());
        
	frame.setVisible(true);
    }
    
    private JPanel PanelSaldo(){
        JPanel panel = new JPanel();
        
        panel.setSize(100, 100);
        
        panel.add(LabelSaldo());

        return panel;
    }
    
    private JLabel LabelSaldo(){
        TicketMachine ticket = new TicketMachine();
        JLabel saldoAtual = new JLabel("R$ "+ticket.getSaldo());
        
        saldoAtual.setForeground(Color.red);
        saldoAtual.setFont (saldoAtual.getFont().deriveFont (48.0f));
        
        return saldoAtual;
    }
}
