/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcular_nota_estudiante.modelo;

import java.io.Serializable;

/**
 *
 * @author juanv
 */
public class Asignatura implements Serializable{
    
    // Atributos
    private String nombreAsignatura;
    private boolean asistencia;
    private double notas[];
    private double promedio;

    public Asignatura(String nombreAsignatura, boolean asistencia, double[] notas) {
        this.nombreAsignatura = nombreAsignatura;
        this.asistencia = asistencia;
        this.notas = notas;
    }
    
    //Getters y Setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //Metodos
    //promediar sin las decimas extra
    public double promediar(int numNotas){
        for(double nota : notas){
            promedio += nota;//suma todas las notas
        }
        promedio= promedio/numNotas;//las divide por el numero de notas
        
        return promedio;
    }
    
    public double promediar(int numNotas, double decimas){
        for(double nota : notas){
            promedio += nota;//suma todas las notas
        }
        promedio= (promedio/numNotas)+decimas;//las divide por el numero de notas y suma las decimas
        
        promedio = Math.round(promedio*100.0)/100.0;//aproxima a dos decimales
        
        if(promedio>5.0){//si con las decimas supera el 5, entonces que retorne el 5
            promedio = 5.0;
            return promedio;
        }else{
            return promedio;
        }
    }
    
    public boolean verificarRango(){
        
        boolean cumple = true;
        for(double nota : notas){
            if(nota<0 || nota>5){
                cumple = false;
                break;
            }
        }
        
        return cumple;
    }
    
    public boolean aprobar(){//si el promedio es mayor o igual a 3.3 aprueba
        if(promedio>=3.3){
            return true;
        }else{
            return false;
        }
    }
}   
