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
public class Profesor {
 public String Nombre;
 public String Materia;
 public String NumeroPersonal;
    
public  void AgregarProfesor() {  
 Nombre = JOptionPane.showInputDialog("Ingrese el nombre del Profesor: ");
 Materia = JOptionPane.showInputDialog("Ingrese  la materia: ");
 NumeroPersonal = JOptionPane.showInputDialog("Ingrese el Numero Personal: ");

    }

public  void MostarProfesor() {  
 

    }

public  void AsignacionGrupos() {  
 

    }

public  void AgregarProfesion() {  
 

    }  
public  void MostrarProfesor() {  
 JOptionPane.showMessageDialog(null,"El Nombre del Profesor es: "+Nombre);
 JOptionPane.showMessageDialog(null,"La materia del profesor: "+Materia);
 JOptionPane.showMessageDialog(null,"El Grado del estudiante es: "+NumeroPersonal);

    }  
}
