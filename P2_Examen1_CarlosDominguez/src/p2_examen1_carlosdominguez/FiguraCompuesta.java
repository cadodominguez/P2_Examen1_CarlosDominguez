/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_carlosdominguez;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();
    
    protected void agregarFigura (Figura figura){
        figuras.add(figura);
    }
    @Override
    double calcularArea() {
        double area = 0;
        for (int i = 0; i < figuras.size(); i++) {
            Figura actual = figuras.get(i);
            if (actual instanceof Circulo) {
                area += 3.1416*(((Circulo) actual).getRadio()*((Circulo) actual).getRadio());
            }else if (actual instanceof Cuadrado) {
                area += ((Cuadrado) actual).getLado()*((Cuadrado) actual).getLado();
            }else if (actual instanceof FiguraCompuesta) {
                area += actual.calcularArea();
            }
        }
        return area;
    }
    
    public String salida (){
        String s = "";
        for (int i = 0; i < figuras.size(); i++) {
            s += figuras.get(i).toString()+"\n";
        }
        return s;
    }
    
    @Override
    public String toString() {
        return "FiguraCompuesta:\n" + "->" + salida();
    }
    
    
}
