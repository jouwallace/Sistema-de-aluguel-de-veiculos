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
public class Carro {
private int id;
private String modelo;
private String marca;
private Double valorPorKm;

    

    public void cadastrarCarro (){
      this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
      this.marca = JOptionPane.showInputDialog("Digite a marca do carro");
      this.valorPorKm = Double.valueOf(JOptionPane.showInputDialog("Digite o valor por Km "));
    
    
    }
    public String mostrarDadosCarro(){
      String msg = "Dados do Carro\n";
      msg = msg + "Modelo: " + this.modelo + "\n";
      msg = msg + "Marca: " + this.marca + "\n";
      msg += "Valor por Km: " + this.valorPorKm + "\n";
 
      return msg;
        
    }

    public Double getValorPorKm() {
        return valorPorKm;
    }
    


}
