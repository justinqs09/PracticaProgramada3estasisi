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
public class Cobros {
public String Nombre;
public String Precio;
public String NumeroPersonal;

    
public  void AgregarCobro() {  
 Nombre = JOptionPane.showInputDialog("Ingrese el nombre del Nombre: ");
 Precio = JOptionPane.showInputDialog("Ingrese Precio: ");
NumeroPersonal = JOptionPane.showInputDialog("Ingrese el Numero Personal: ");

    }

public void MostarCobro() {  
 JOptionPane.showMessageDialog(null,"El Nombre es: "+Nombre);
 JOptionPane.showMessageDialog(null,"El Precio Total es: "+Precio);
 JOptionPane.showMessageDialog(null,"El Numero de la persona  es: "+NumeroPersonal);

    }

public static void CobroNuevo() {  
 

    }

public static void FacturaTotal() {  
 

    }       
}
