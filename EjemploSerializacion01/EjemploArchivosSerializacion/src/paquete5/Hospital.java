/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    public Hospital(String n, int nc, double p){
        nombre = n;
        numeroCamas = nc;
        presupuesto = p;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    @Override
    public String toString(){
        String valor = String.format("%s-%d-%.2f\n", obtenerNombre(), 
                obtenerNumCamas(),
                obtenerPresupuesto());
        return valor;
    }
}