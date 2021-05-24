/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcular_nota_estudiante.controlador;

import com.calcular_nota_estudiante.modelo.Asignatura;
import com.calcular_nota_estudiante.modelo.Estudiante;
import com.calcular_nota_estudiante.modelo.EstudianteQuinto;
/**
 *
 * @author juanv
 */
public class ControladorEstudiante{

    //Atributos
    private int NUMERO_ESTUDIANTES=4;
    private double DECIMAS_EXTRA = 0.5;
    private Estudiante[] estudiantes;
    private int contador = 0;

    //Constructor
    public ControladorEstudiante() {
        estudiantes = new Estudiante[NUMERO_ESTUDIANTES];
        
        inicializarEstudiante();
    }
    
    private void  inicializarEstudiante()
    {
        estudiantes[0]= new EstudianteQuinto ("Pepe",1234,"Ingenieria de Sistemas");
    }

    //Metodos
    public void añadirEstudiantes(Estudiante est, Asignatura prog, Asignatura fis, Asignatura mat) {

        Asignatura asignaturas[] = {prog, fis, mat};//Arreglo de materias pasadas por parametro
        if (contador < NUMERO_ESTUDIANTES) {
            
            if(est.getSemestre()==5 || est.getSemestre()==6){
                if(prog.getNotas().length==est.getNumeroNotas()){
                    estudiantes[contador] = est;//instancia cada estudiante
                    estudiantes[contador].setAsignaturas(asignaturas);//le asigna las materias
                    contador++;
                    System.out.println("Estudiante "+est.getNombre()+" añadido");
                }else{
                    System.out.println("El numero de notas del estudiante "+est.getNombre()+" super el maximo de notas");
                    System.exit(0);
                }
            }
            else{
                System.out.println("El estudiante "+est.getNombre()+" no es de 5to ni de 6to semestre");
                System.exit(0);
            }
            
        } else {
            System.out.println("El estudiante no se pudo añadir");
            System.exit(0);
        }

    }

    public void promedio() {

        Asignatura[] materia;//arreglo de materias
        for (Estudiante std : estudiantes) {
            materia = std.getAsignaturas();//se instancia con las materias de cada estudiante
            
            rango(materia, std);
            //condicional para programacion
            if (materia[0].isAsistencia()) {//si asistió a todas las clases ejecuta este metodo
                materia[0].promediar(std.getNumeroNotas(), DECIMAS_EXTRA);//solicita las notas y las decimas para promediar
                
            } else {
                materia[0].promediar(std.getNumeroNotas());//si no asistio a todas las clases solo promedia

            }
            //condicional para fisica
            if (materia[1].isAsistencia()) {
                materia[1].promediar(std.getNumeroNotas(), DECIMAS_EXTRA);
                
            } else {
                materia[1].promediar(std.getNumeroNotas());

            }
            //condicional para matematica
            if (materia[2].isAsistencia()) {
                materia[2].promediar(std.getNumeroNotas(), DECIMAS_EXTRA);
                
            } else {
                materia[2].promediar(std.getNumeroNotas());

            }
            
            
        }

    }
    
    public void rango( Asignatura[] asignaturas, Estudiante est){
        
        for(Asignatura m : asignaturas){
            if(!(m.verificarRango())){
                System.out.println("El estudiante "+est.getNombre()+" ingresó una nota fuera del rango");
                System.exit(0);
            }
        }
    }
    
    public void imprimirResultado() {
        
        String fmt = "%-8s %-20s %-20s %-25s %-15s %-20s %-8s %-14s %-12s %n";//formato para el printf
        System.out.printf(fmt,"Semestre","Nombre","Codigo","Carrera","Asignatura","Notas","Decimas","Definitiva","Aprobacion");//forma de imprimir
        System.out.println("");
        
        Asignatura[] asignatura;
        
        for(Estudiante std : estudiantes){//cada estudiante muestra sus notas
            asignatura = std.getAsignaturas();

            System.out.printf(fmt,std.getSemestre(),std.getNombre(),std.getCodigo(),std.getCarrera(),
                    asignatura[0].getNombreAsignatura(),notas(asignatura[0].getNotas()),decimas(asignatura[0].isAsistencia()),asignatura[0].getPromedio(),aprobar(asignatura[0].aprobar()));

            System.out.printf(fmt,"","","","",asignatura[1].getNombreAsignatura(),
                    notas(asignatura[1].getNotas()),decimas(asignatura[1].isAsistencia()),asignatura[1].getPromedio(),aprobar(asignatura[1].aprobar()));

            System.out.printf(fmt,"","","","",asignatura[2].getNombreAsignatura(),
                    notas(asignatura[2].getNotas()),decimas(asignatura[2].isAsistencia()),asignatura[2].getPromedio(),aprobar(asignatura[2].aprobar()));
            
            System.out.println("");
        }
    }

    
    String notas(double[] notas){//agrega las notas a un string
        String arreglo = "";
        for(double nota: notas){
            arreglo+=nota+" ";
        }
        return arreglo;
    }
    
    String decimas(boolean condicion){//retorna un si o un no
        if(condicion){
            return "Si";
        }else{
            return "No";
        }
    }
    
    String aprobar(boolean condicion){//retorna un aprobado o reprobado
        if(condicion){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }

    public double[] notas(double n1, double n2, double n3, double n4) {
        double notas[]={n1,n2,n3,n4};
        return notas; 
    }
    
    public double[] notas(double n1, double n2, double n3) {
        double notas[]={n1,n2,n3};
        return notas; 
    }
    
    public Estudiante[] getEstudiante() {
        return estudiantes;
    }

}
    

