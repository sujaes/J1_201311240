package com.sd.addressproject;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
public class AddressListener implements ActionListener{

 public void actionPerformed(ActionEvent e) {
  Updater nameSaver = new SaveInfo();
  Updater phoneSaver = new DeleteInfo();
  Updater clearSaver = new ClearInfo();
  PhoneAddress myphone = new PhoneAddress(nameSaver);
  PhoneAddress myphone1 = new PhoneAddress(phoneSaver);
  PhoneAddress myphone2 = new PhoneAddress(clearSaver);
  
  JButton jbbSave=(JButton)e.getSource();
  JButton jbnDelete=(JButton)e.getSource();
  JButton jbnClear=(JButton)e.getSource();
  JButton jbnExit=(JButton)e.getSource();
  String cmd=e.getActionCommand();
  if (cmd.equals("Save")) {
   myphone.upd(); //command
   myphone2.upd();
  } else if (cmd.equals("Delete")) {
   myphone1.upd();
   myphone2.upd();
  }
   else if (cmd.equals("Clear")) {
   myphone2.upd();

  } else if (cmd.equals("Exit")) {
   System.exit(0);
  }
 }
}
