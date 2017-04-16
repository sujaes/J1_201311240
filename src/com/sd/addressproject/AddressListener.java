package com.sd.addressproject;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
public class AddressListener implements ActionListener{

 public void actionPerformed(ActionEvent e) {
  Updater nameSaver = new SaveInfo();
  Updater phoneSaver = new DeleteInfo();
  PhoneAddress myphone = new PhoneAddress(nameSaver);
  PhoneAddress myphone1 = new PhoneAddress(phoneSaver);
  
  JButton jbbSave=(JButton)e.getSource();
  JButton jbnDelete=(JButton)e.getSource();
  JButton jbnClear=(JButton)e.getSource();
  JButton jbnExit=(JButton)e.getSource();
  String cmd=e.getActionCommand();
  if (cmd.equals("Save")) {
   myphone.upd();
   jbbSave.setText("¿˙¿Âµ ");
   clear();
  } else if (cmd.equals("Delete")) {
   myphone1.upd();
   jbnDelete.setText("ªË¡¶µ ");
   clear();
  }
   else if (cmd.equals("Clear")) {
   clear();
  } else if (cmd.equals("Exit")) {
   System.exit(0);
  }
 }
 //Perform a Case-Insensitive Search to find the Person
 public void clear() {
 }
}
