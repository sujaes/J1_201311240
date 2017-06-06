package com.sd.addressproject;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddressMain{
 JFrame appFrame;
 JLabel jlbName, jlbPhone;
 static JTextField jtfName;
 static JTextField jtfPhone;
 JButton jbbSave, jbnDelete, jbnClear, jbnExit;
 String name;
 int phone;
 Container cPane;
 public static void main(String args[]) {
  new AddressMain();
 }
 public AddressMain() {
  createGUI();
 }
 public void createGUI(){
     appFrame = new JFrame("Address");
     cPane = appFrame.getContentPane();
     cPane.setLayout(new GridBagLayout());
     arrangeComponents();
     appFrame.setSize(240,300);
     appFrame.setResizable(false);
     appFrame.setVisible(true);
    } 
 public void arrangeComponents() {
  jlbName = new JLabel("Name");
  jlbPhone = new JLabel("Phone");
  jtfName = new JTextField(20);
  jtfPhone = new JTextField(20);
  jbbSave = new JButton("Save");
  jbnDelete = new JButton("Delete");
  jbnClear = new JButton("Clear");
  jbnExit = new JButton("Exit");
  /*add all initialized components to the container*/
  GridBagConstraints grid01 = new GridBagConstraints();
  grid01.gridx = 0;
  grid01.gridy = 0;
  grid01.insets = new Insets(5, 5, 5, 5);
  cPane.add(jlbName, grid01);
  GridBagConstraints grid02 = new GridBagConstraints();
  grid02.gridx = 1;
  grid02.insets = new Insets(5, 5, 5, 5);
  grid02.gridy = 0;
  grid02.gridwidth = 2;
  grid02.fill = GridBagConstraints.BOTH;
  cPane.add(jtfName, grid02);
  GridBagConstraints grid05 = new GridBagConstraints();
  grid05.gridx = 0;
  grid05.insets = new Insets(5, 5, 5, 5);
  grid05.gridy = 2;
  cPane.add(jlbPhone, grid05);
  GridBagConstraints grid06 = new GridBagConstraints();
  grid06.gridx = 1;
  grid06.gridy = 2;
  grid06.insets = new Insets(5, 5, 5, 5);
  grid06.gridwidth = 2;
  grid06.fill = GridBagConstraints.BOTH;
  cPane.add(jtfPhone, grid06);  
  GridBagConstraints grid09 = new GridBagConstraints();
  grid09.gridx = 0;
  grid09.gridy = 4;
  grid09.insets = new Insets(5, 5, 5, 5);
  cPane.add(jbbSave, grid09);
  GridBagConstraints grid10 = new GridBagConstraints();
  grid10.gridx = 1;
  grid10.gridy = 4;
  grid10.insets = new Insets(5, 5, 5, 5);
  cPane.add(jbnDelete, grid10);
  GridBagConstraints grid11 = new GridBagConstraints();
  grid11.gridx = 2;
  grid11.insets = new Insets(5, 5, 5, 5);
  grid11.gridy = 4;
  cPane.add(jbnClear, grid11);
  GridBagConstraints grid12 = new GridBagConstraints();
  grid12.gridx = 1;
  grid12.gridy = 5;
  grid12.insets = new Insets(5, 5, 5, 5);
  cPane.add(jbnExit, grid12);
  jbbSave.addActionListener(new AddressListener());
  jbnDelete.addActionListener(new AddressListener());
  jbnClear.addActionListener(new AddressListener());
  jbnExit.addActionListener(new AddressListener());
 }
}