package com.iespablopicasso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.FileNotFoundException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LanzadorMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Variable para tener un controlador en el Main*/
		Controlador miControlador;
		/**Ventana principal*/
		JFrame fMain = new JFrame("Sporty World Java Swing"); 
		/**Fondo en el que vamos a pintar todas las cosas del Main*/
		JPanel fondo = new JPanel();
		
		fondo.setLayout(new BorderLayout());
		//fondo.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
		//fondo.setLayout(new FlowLayout(FlowLayout.TRAILING,60,60));
		/**Panel donde vamos a meter cosas*/
		JPanel JPanelV = new JPanel();
		JPanelV.setBackground(Color.black);
		JPanelV.setLayout(new FlowLayout(FlowLayout.CENTER,8,8));
		/**Panel donde vamos a meter el comboBox*/
		JPanel JPCombo = new JPanel();
		/**Panel donde vamos a meter cosas*/
		JPanel JPtxRosa = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
		
		//Panel para los TextFields y los JLabel
		/**Panel donde vamos a meter cosas*/
		JPanel TextBoxsPanel1 = new JPanel();
		/**Panel donde vamos a meter cosas*/
		JPanel TextBoxsPanel2 = new JPanel();
		/**Panel donde vamos a meter cosas*/
		JPanel TextBoxsPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		/**Panel donde vamos a meter contrase�a*/
		JPanel JPUsuarioContra = new JPanel(new FlowLayout(FlowLayout.CENTER));
		/**Panel donde vamos a meter cosas*/
		JPanel JPArriba = new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
		///**Panel donde vamos a meter resultado*/
		JPanel ResultsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
		
		
		
		
		fMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		fMain.setSize(400, 300); 
		
		
		//Añadimos los componentes
		JLabel laMinutos = new JLabel("Minutos");       
        JTextField tfMinutos = new JTextField(5); // acepta hasta 5 caracteres 
        JLabel laKgs = new JLabel("Kilogramos");       
        JTextField tfKgs= new JTextField(3); // acepta hasta 5 caracteres 
        JComboBox cbEjercicios = new JComboBox();
        JLabel laKCal = new JLabel("KCal:"); 
        JLabel laKCalResult = new JLabel(""); 
        JButton buCalcular = new JButton("Calcular");  
        JLabel Usuario = new JLabel("Usuario:");
        JTextField tfUsuario = new JTextField(10);
        JLabel Password = new JLabel("Password:");
        JTextField tfPassword = new JTextField(10);
        miControlador = new Controlador(tfMinutos,tfKgs,cbEjercicios,laKCalResult);
        buCalcular.addActionListener(miControlador);
        
        try {
			miControlador.iniciaDatos();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
   
        
        //Aquí añadimos al panel de TextFields y Jpanels sus componentes
        TextBoxsPanel1.setBackground(Color.CYAN);
        TextBoxsPanel2.setBackground(Color.YELLOW);
        TextBoxsPanel1.add(laMinutos);  
        TextBoxsPanel1.add(tfMinutos); 
        TextBoxsPanel2.add(laKgs); 
        TextBoxsPanel2.add(tfKgs);
        TextBoxsPanel3.add(TextBoxsPanel1);
        TextBoxsPanel3.add(TextBoxsPanel2);
        TextBoxsPanel3.setBackground(Color.gray);
		JPtxRosa.setBackground(Color.magenta);
        JPtxRosa.add(TextBoxsPanel3);
        
        
        
        JPCombo.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JPCombo.add(cbEjercicios);
        JPCombo.setBackground(Color.orange);
       
        
        //Aquí un ejemplo de añadir componentes al BorderLayout
        ResultsPanel.setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
        ResultsPanel.add(laKCal); 
        ResultsPanel.add(laKCalResult);
        ResultsPanel.add(buCalcular);
        ResultsPanel.setBackground(Color.green);
        
        JPArriba.setBackground(Color.blue);
        JPArriba.add(JPtxRosa);
        JPArriba.add(JPCombo);
        JPArriba.add(ResultsPanel);
        
        JPUsuarioContra.setBackground(Color.red);
        JPUsuarioContra.add(Usuario);
        JPUsuarioContra.add(tfUsuario);
        JPUsuarioContra.add(Password);
        JPUsuarioContra.add(tfPassword);
        
        
        //fondo.add(cbEjercicios); //Va directo al Fondo. Es un componente que no tiene panel intermedio
        fondo.add(BorderLayout.NORTH,JPArriba);
        fondo.add(BorderLayout.CENTER,JPanelV);
        fondo.add(BorderLayout.SOUTH,JPUsuarioContra);
        
        fMain.add(fondo);
        
        
        fMain.pack();
         
        
        fMain.setVisible(true); 

	}

}
