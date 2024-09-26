/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.termometroModelo;
import java.util.List;

/**
 *
 * @author JuanFlores
 */
public interface ITermometroLectura {
    
    public double lecturaTransformar(double grados,String medida,String edificio);
    public List<termometroModelo> listadosTemperaturas();
    
}
