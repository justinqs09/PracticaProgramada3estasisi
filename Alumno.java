/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaprogramada3;

import javax.swing.JOptionPane;
/**
 *
 * @author Justin´s PC
 */
public class Alumno {

 public String Nombre;
 public String Grado;
 public String PersEncargada;
    
public  void AgregarAlumno() {  
  Nombre = JOptionPane.showInputDialog("Ingrese el nombre del Alumno: ");
  Grado = JOptionPane.showInputDialog("Ingrese el grado del grado: ");
 PersEncargada = JOptionPane.showInputDialog("Ingrese el grado del grado: ");

    }

public static void ModificarAlumno() {  
 

    }
public void MostrarAlumno() {  
 JOptionPane.showMessageDialog(null,"El Nombre del estudiante es: "+Nombre);
 JOptionPane.showMessageDialog(null,"El Grado del estudiante es: "+Nombre);
 JOptionPane.showMessageDialog(null,"El Grado del estudiante es: "+PersEncargada);
    } 
}
