/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeveiculos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Aluguel {
    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;
    private double KmFinal;
    private double KmInicial;
    
    
    
    public void iniciarLocacao(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
        this.kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km inicial:"));
        this.qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias"));
    }
    
   

    public double fecharLocacao() {
    this.kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km final:"));
    
    
    if (kmFinal > kmInicial) {
        int kmPercorridos = kmFinal - kmInicial;
        valorTotalAluguel = kmPercorridos * carro.getValorPorKm();
    

        if (qtdDias > 20) {
            valorTotalAluguel *= 0.8; 
        } else if(qtdDias > 10) {
            valorTotalAluguel *= 0.9;
        }
        

        return valorTotalAluguel;
    } else {
        return 0;//retornará 0 se o usuario digitar o valor KmFinal sendo menor que o KmInicial.
    }
    
    }
    public String mostrarResumoLocacao() {
    DecimalFormat df = new DecimalFormat("#,##0.00"); // Colocando o formato de duas casas decimais após a vírgula

    String msg = "Resumo Aluguel\n";
    msg += cliente.mostrarDadosUsuario() + "\n";
    msg += "Carro\n";
    msg += carro.mostrarDadosCarro() + "\n";
    msg += "Aluguel\n";
    msg += "Quantidade de dias: " + qtdDias + "\n";
    msg += "Km Inicial: " + kmInicial + "\n";
    msg += "Km Final: " + kmFinal + "\n";
    msg += "Valor Total: R$" + df.format(valorTotalAluguel) + "\n";

    return msg;
}
    


}