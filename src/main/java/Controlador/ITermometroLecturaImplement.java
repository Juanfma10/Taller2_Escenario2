/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.termometroModelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFlores
 */
public class ITermometroLecturaImplement implements ITermometroLectura{
    
    
     private List<termometroModelo> temperaturaIngresos = new ArrayList<termometroModelo>();    

    @Override
    public double lecturaTransformar(double grados, String medida,String ed) {
        
        double conversion=grados;
       if(medida=="f"){
          conversion=(Math.round((grados-32)/1.8f));
       }
       
      termometroModelo info=new termometroModelo(medida,conversion,ed);
      this.temperaturaIngresos.add(info);
       return conversion;
}

    @Override
    public List<termometroModelo> listadosTemperaturas() {
        return temperaturaIngresos;
                }
    
     public void add(termometroModelo termometroInfo){
        this.temperaturaIngresos.add(termometroInfo);
    }
}
