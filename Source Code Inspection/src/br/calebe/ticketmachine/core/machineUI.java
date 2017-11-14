/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Scanner;

/**
 *
 * @author 31530788
 */
public class machineUI {
    
    public void MainScreen() throws PapelMoedaInvalidaException{
        Scanner reader = new Scanner(System.in);
        TicketMachine ticket = new TicketMachine(2);
        int op = 0, valor= 0;
        
        while(op != 4){
            System.out.println("Saldo: "+ ticket.getSaldo());
            System.out.println("1 - Inserir");
            System.out.println("2 - Emitir");
            System.out.println("3 - Troco");
            System.out.println("4 - Sair");
            
            System.out.print("Escolho: ");
            op = reader.nextInt();
            
            if(op == 1){
                System.out.print("Valor: ");
                valor = reader.nextInt();
                
                try{
                    ticket.inserir(valor);
                }
                catch(PapelMoedaInvalidaException ex){
                    System.out.println("Valor da nota Invalida...");
                }
            }
            else if(op == 2){
                try{
                    System.out.println(ticket.imprimir());
                    System.out.println("Bilhete Impreso");
                }
                catch(SaldoInsuficienteException ex){
                    System.out.println("Saldo Infuficiente para imprimir bilhete");
                }
            }
            else if(op == 3){
                ticket.getTroco();
    
            }
            else if(op == 4)
                System.exit(0);
            else
               System.out.println("Invalido...");
            System.out.println("///////////////////////////////");
        }
    }
}
