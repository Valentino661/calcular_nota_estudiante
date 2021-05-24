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
public class EstudianteQuinto extends Estudiante implements Serializable{ // Clase hija.
    
    private final int NUMERO_NOTAS = 4; // Numero de notas   

    public EstudianteQuinto(String nombre, int codigo, String carrera) {
        super(nombre, codigo, carrera);
        super.setSemestre(5);
        super.setNumeroNotas(NUMERO_NOTAS);
    }
    
    public int getNUMERO_NOTAS(){
        return NUMERO_NOTAS;
    }
    
    
}
