/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Maria
 */
public class Calculadora {
    private double numero1;
    private double numero2;
    private String marca;
    private String modelo;

    public Calculadora(double numero1, double numero2, String marca, String modelo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.marca=marca;
        this.modelo=modelo;
    }

    public Calculadora(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public Calculadora(){
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double suma (){
        return(this.numero1+this.numero2);
    }
    public double resta (){
        return(this.numero1-this.numero2);
    }
    public double multi (){
        return(this.numero1*this.numero2);
    }
    public double div (){
        return(this.numero1/this.numero2);
    }
    
    public double div1 (){
    return(this.numero1/this.numero2);
    }    
}
