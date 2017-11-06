/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

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
        JFrame janela;
        janela = new JFrame("Sistema de Emição de Passagens");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        janela.pack();
        
        janela.setSize(400,300);
        janela.setLocation(
                dim.width/2-janela.getSize().width/2,
                dim.height/2-janela.getSize().height/2);
        
        janela.add(PanelSaldo());
        
	janela.setVisible(true);
    }
    
    private JPanel PanelSaldo(){
        JPanel panel = new JPanel();
        
        panel.add(LabelSaldo());
        
        return panel;
    }
    
    private JLabel LabelSaldo(){
        JLabel saldoAtual = new JLabel();
        
        return saldoAtual;
    }
}
