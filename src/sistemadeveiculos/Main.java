/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeveiculos;

import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarUsuario();
        
        Carro carro = new Carro();
        carro.cadastrarCarro();
        
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarLocacao(cliente, carro);
        aluguel.fecharLocacao();
        
        String resumoLocacao = aluguel.mostrarResumoLocacao();
        JOptionPane.showMessageDialog(null, resumoLocacao);
    }
}
