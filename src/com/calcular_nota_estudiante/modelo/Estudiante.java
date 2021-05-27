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
public class Estudiante implements Serializable{// Clase padre
    
    //Atributos
    private String nombre;
    private int codigo;
    private String carrera;
    private int semestre, numeroNotas;
    private Asignatura asignaturas[]= new Asignatura[3]; // arreglo para las 3 materias

    public Estudiante(String nombre, int codigo, String carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int codigo, String carrera, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Estudiante(String nombre, int codigo, int semestre, int numeroNotas, Asignatura asignaturas[]) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.numeroNotas = numeroNotas;
        this.asignaturas = asignaturas;      
    }
     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumeroNotas() {
        return numeroNotas;
    }

    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
    
    
    
    

    
}
