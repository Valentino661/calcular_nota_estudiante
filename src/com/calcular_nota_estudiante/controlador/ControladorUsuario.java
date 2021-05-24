/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcular_nota_estudiante.controlador;

import com.calcular_nota_estudiante.execepciones.UsuarioExcepcion;
import com.calcular_nota_estudiante.modelo.Rol;
import com.calcular_nota_estudiante.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juanv
 */
public class ControladorUsuario {
    private Rol[] roles;
    private List<Usuario> usuarios;
    
    public ControladorUsuario()
    {
       inicializarColecciones();
    }
    private void inicializarColecciones()
    {
        roles = new Rol[2];
        roles[0]= new Rol((byte)1, "Administrador");
        roles[1]= new Rol((byte)2, "Consulta");
        
        usuarios = new ArrayList<>();//Polimorfismo
        // Donde yo cargaria los usuarios de una base de datos
        // Un archivo de excel, un archivo plano o un SGBD
        // Mysql, Postgres, oracle, SqlServer, Mariadb, MOngo, Dynamo
        
        usuarios.add(new Usuario("valentin@umanizales.edu.co", "1234567",roles[0],
            "Juan Valentín García"));
        usuarios.add(new Usuario("juan@umanizales.edu.co", "7654321",roles[1],
            "Juan fernando"));
    }
    
//    public boolean verificarUsuario(String correo, String contrasenia)
//    {
//        for(Usuario usu: usuarios)
//        {
//            if(usu.getCorreo().equals(correo) &&
//                    usu.getContrasenia().equals(contrasenia))
//            {
//                return true;
//            }
//        }
//        return false;
//    }
    
    public Usuario verificarUsuario(String correo, String contrasenia)
            throws UsuarioExcepcion
    {
        if(correo == null || correo.equals("") || contrasenia == null
                || contrasenia.equals("")){
         
            throw new UsuarioExcepcion("Debe diligenciar todos los datos");
        }
        if(!validarCorreo(correo)){
        
            throw new UsuarioExcepcion("En el campo usuario debe ingresar un " +
                    "correo valido");
        }
        if(contrasenia.length()<6){
        
            throw new UsuarioExcepcion("La contraseña debe tener al menos"
                    + " 6 caracteres.");
        }
        for(Usuario usu: usuarios){
        
            if(usu.getCorreo().equals(correo) && 
                    usu.getContrasenia().equals(contrasenia)){
            
                return usu;
            }
        }
        // significa que el usuario o la contraseña son erradas
        throw new UsuarioExcepcion("Los datos ingresados son errados");
    }
    

    
    
    
//    private void cargarDatosUsuarios() {
//        File archivo;
//        FileReader fr = null;
//        BufferedReader br;
//
//        try {
//            archivo = new File("C:\\Users\\Usuario\\Documents\\usuarios.txt");
//            fr = new FileReader(archivo);
//            br = new BufferedReader(fr);
//
//            String linea;
//            String[] datos;
//            while ((linea = br.readLine()) != null) {
//                datos = linea.split(":");
//                if (validarCorreo(datos[0]) && datos.length==3) {
//                    if (datos[2].equals("1")) {
//                        usuarios.add(new Usuario(datos[0], datos[1], roles[0]));
//                    } else if (datos[2].equals("2")) {
//                        usuarios.add(new Usuario(datos[0], datos[1], roles[1]));
//                    }
//                }
//            }
////            System.out.println("Tamaño: "+usuarios.size());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (null != fr) {
//                    fr.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//    }

    private boolean validarCorreo(String email) {
        boolean espacios = true;

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(email);

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ') {
                espacios = false;
                break;
            }
        }

        return matcher.find() && espacios;
    }
}
