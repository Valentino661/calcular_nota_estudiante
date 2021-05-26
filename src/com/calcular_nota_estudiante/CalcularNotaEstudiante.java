/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcular_nota_estudiante;  // www.calcularnotaestuadiante.com
import com.calcular_nota_estudiante.controlador.ControladorEstudiante;
import com.calcular_nota_estudiante.modelo.Asignatura;
import com.calcular_nota_estudiante.modelo.EstudianteQuinto;
import com.calcular_nota_estudiante.modelo.EstudianteSexto;



/**
 *
 * @author juanv
 */
public class CalcularNotaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorEstudiante control = new ControladorEstudiante();

  
        control.anadirEstudiantes(new EstudianteQuinto("Valentin Garcia",1234,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.2, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 4.1, 3.5)));
        
        control.anadirEstudiantes(new EstudianteQuinto("Carlos Ruiz",4321,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(3.5, 4.2, 4.1, 3.5)), 
                new Asignatura("Fisica",false,control.notas(3.5, 2.1, 3.2, 2.6)), 
                new Asignatura("Matematica",false,control.notas(3.5, 2.2, 4.1, 3.6)));
        
        control.anadirEstudiantes(new EstudianteQuinto("Jose Hector",5237,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.2, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 4.1, 3.5)));
        
        control.anadirEstudiantes(new EstudianteQuinto("Camila Aristizabal ",8234,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.2, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 4.1, 3.5)));
        
        control.anadirEstudiantes(new EstudianteQuinto("Manuela Flores",9261,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.2, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 4.1, 3.5)));
        
//-------------------------------------------------------------------------------------------------------
        
        control.anadirEstudiantes(new EstudianteSexto("isabella Rendon",6174,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.2, 4.1)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.1, 3.5)));
        
        control.anadirEstudiantes(new EstudianteSexto("mariana Toro",7244,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4.2, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 3.5)));
        
        control.anadirEstudiantes(new EstudianteSexto("Lucas Alberto",6993,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",true,control.notas(4, 4.1, 4.2)),
                new Asignatura("Fisica",true,control.notas(3.5, 4.1, 3.3)), 
                new Asignatura("Matematica",true,control.notas(3.5, 4.2, 4.1)));
        
        control.anadirEstudiantes(new EstudianteSexto("Luis Alberto",6789,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",false,control.notas(3.5, 4.2, 3.1)), 
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1)), 
                new Asignatura("Matematica",true,control.notas(1.5, 4.2, 1.1)));
        
        control.anadirEstudiantes(new EstudianteSexto("Salome loaiza",3456,"Ingenieria de Sistemas"), 
                new Asignatura("Programacion",false,control.notas(1.5, 2.3, 4.2)), 
                new Asignatura("Fisica",true,control.notas(3.5, 4.2, 4.1)), 
                new Asignatura("Matematica",true,control.notas(1.5, 4.2, 1.1)));
        
        control.promedio();
        control.imprimirResultado();

    }

    
    
    
    
    
    
    
    
    
// Ejemplo: 
//
//Grado      codigo        Nombre                Materia                Notas              decimas       Definitiva. 
//  5º        1234       Valentín García       Programación      4.3   3.3   2.4  4.0         NO            3.5        Aprobada 
//  5º        4321       Carlos Loaiza         Programación      3.3   3.1   3.4  4.3         Si            3.6        Aprobada 
//  6º        2345       Laura García          Física            4.3   3.3   4.3              Si            3.9        Aprobada 
//  6º        5432       Sofia López           Matemáticas       3.3   3.4   1.7              NO            2.8        Reprobado 

    
}
