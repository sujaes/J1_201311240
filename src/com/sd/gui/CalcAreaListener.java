package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

// CalcListener can not access to JTextFields
public class CalcAreaListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        String cmd=e.getActionCommand();
        if (cmd.equals("���")) {
            System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
        } else if (cmd.equals("���")) {
            System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
        } else {
            System.out.println("��ư�� '..�߽��ϴ�'�� �����ϸ� cmd�� ����ȴ�.");
        }
    }
}