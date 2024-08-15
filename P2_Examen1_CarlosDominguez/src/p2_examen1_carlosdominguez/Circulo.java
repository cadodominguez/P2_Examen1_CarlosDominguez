/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_carlosdominguez;

    
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    double calcularArea() {
       return 3.1416*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo(" + "R=" + radio + ')';
    }
    
}
