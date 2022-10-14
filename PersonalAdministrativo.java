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
public class PersonalAdministrativo {
    
public String Nombre;
public String AreaDeTrabajo;
public String NumeroPersonal;

    
public  void AgregarPersonal() {  
 Nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo empleado: ");
 AreaDeTrabajo = JOptionPane.showInputDialog("Ingrese el Area de Trabajo: ");
NumeroPersonal = JOptionPane.showInputDialog("Ingrese el Numero Personal: ");

    }

public  void MostarPersonal() {  
 JOptionPane.showMessageDialog(null,"El Nombre es: "+Nombre);
 JOptionPane.showMessageDialog(null,"El Area de Trabajo es: "+AreaDeTrabajo);
 JOptionPane.showMessageDialog(null,"El Numero de la persona  es: "+NumeroPersonal);

    }

public static void AgregarPlanillaCompleta() {  
 

    }

public static void OrdenarSegunProf() {  
 

    }     
    
}
