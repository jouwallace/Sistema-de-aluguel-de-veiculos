/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeveiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
 
    public void cadastrarUsuario(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        this.cpf = JOptionPane.showInputDialog("Digite o cpf");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone");
        
    }
    public String mostrarDadosUsuario(){
    String msg = "Cliente\n";
    msg = msg + "nome: " + this.nome + "\n";
    msg = msg + "cpf: " + this.cpf + "\n";
    msg = msg + "telefone: " + this.telefone + "\n";
            
    return msg;
}
    

}
    
    