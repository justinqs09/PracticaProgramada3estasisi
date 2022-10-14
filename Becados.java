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
public class Becados {

public String Nombre;
public String Grado;
public String NumeroPersonaEncargada;
public String GradoBec;
    
public  void AgregarBeca() {  
 Nombre = JOptionPane.showInputDialog("Ingrese el nombre del Becado: ");
 Grado = JOptionPane.showInputDialog("Ingrese el grado : ");
NumeroPersonaEncargada = JOptionPane.showInputDialog("Ingrese el Numero de la Persona Encargada: ");
GradoBec = JOptionPane.showInputDialog("Ingrese el Grado De Beca: ");

    }

public  void MostarBeca() {  
 JOptionPane.showMessageDialog(null,"El Nombre del Becado es: "+Nombre);
 JOptionPane.showMessageDialog(null,"El Grado es: "+Grado);
 JOptionPane.showMessageDialog(null,"El Numero de la persona encargada es: "+NumeroPersonaEncargada);
 JOptionPane.showMessageDialog(null,"El Grado de Beca: "+GradoBec);
    }

public static void TipoDeBeca() {  
 

    }

public static void MostrarBecaActual() {  
 

    }      


    
}
