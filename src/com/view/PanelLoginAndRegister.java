/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.view;

import com.personalizeMethods.Button;
import com.personalizeMethods.MyTextField;
import com.personalizeMethods.MyPasswordField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author roc
 */
public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    /**
     * Creates new form PanelCover
     */
    
    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
        
    }
    private void initLogin(){
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label=new JLabel("Sign In");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(7, 18, 225));
        login.add(label);
                
        MyTextField txtEmail=new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/emailUser.png")));
        txtEmail.setHint("Email or UserName");
        login.add(txtEmail,"w 60%");
        
         MyPasswordField txtPass=new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/Lockicon.png")));
        txtPass.setHint("Password");
        login.add(txtPass,"w 60%");
       
        
        
        JButton cmdForgot=new JButton("Forgot Your Password? ");
        cmdForgot.setForeground(new Color(100,100,100));
        cmdForgot.setFont(new Font("sansserif",1,12));
        cmdForgot.setContentAreaFilled(false);
        cmdForgot.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        login.add(cmdForgot);
        
         Button cmd=new Button();
        cmd.setBackground(new Color(7, 18, 225));
        cmd.setForeground(new Color(250,250,250));
        cmd.setLabel("Sign In");
        login.add(cmd,"w 40%, h 40");
    }
    private void initRegister(){
        register.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]10[]10[]10[]25[]push"));
        JLabel label=new JLabel("Create Account");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(7, 18, 225));
        register.add(label);
        MyTextField txtFirstName=new MyTextField();
        txtFirstName.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/Usericon.png")));
        txtFirstName.setHint("FirstName");
        register.add(txtFirstName,"w 60%");
        
        MyTextField txtLastName=new MyTextField();
        txtLastName.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/Usericon.png")));
        txtLastName.setHint("LastName");
        register.add(txtLastName,"w 60%");
        
        MyTextField txtEmail=new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/emailUser.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail,"w 60%");
        
        MyPasswordField txtPass=new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/Lockicon.png")));
        txtPass.setHint("Password");
        register.add(txtPass,"w 60%");
        
        MyPasswordField txtPass1=new MyPasswordField();
        txtPass1.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/Lockicon2.png")));
        txtPass1.setHint("Confirmed Password");
        register.add(txtPass1,"w 60%");
        
        MyTextField txtDate=new MyTextField();
        DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");
        JFormattedTextField today = new JFormattedTextField(dateFormat);
        today.setName("Today");
      today.setColumns(10);
      today.setEditable(true);
      JLabel todayLabel = new JLabel("Date:");
      todayLabel.setLabelFor(today);
      today.setValue(new Date());
      register.add(today);
       /* txtDate.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/emailUser.png")));
        txtDate.setHint("Email");
        txtDate.
        register.add(txtDate,"w 60%");*/
        
        
        
        Button cmd=new Button();
        cmd.setBackground(new Color(7, 18, 225));
        cmd.setForeground(new Color(250,250,250));
        cmd.setLabel("Sign Up");
        register.add(cmd,"w 40%, h 40");
        
    }
    public void showRegister(boolean show){
        if (show) {
            login.setVisible(false);
            register.setVisible(true);
            
        } else {
            login.setVisible(true);
            register.setVisible(false);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
