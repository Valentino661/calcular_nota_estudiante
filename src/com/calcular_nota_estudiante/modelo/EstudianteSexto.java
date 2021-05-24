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
public class EstudianteSexto extends Estudiante implements Serializable{// Clase hija
    
    private int NUMERO_NOTAS = 3; // Numero de notas

    public EstudianteSexto(String nombre, int codigo, String carrera) {
        super(nombre, codigo, carrera);
        super.setSemestre(6);
        super.setNumeroNotas(NUMERO_NOTAS);
    }
    
    public int getNUMERO_NOTAS(){
        return NUMERO_NOTAS;
    }
    
}
