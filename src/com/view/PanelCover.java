/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.view;

import com.personalizeMethods.ButtonOutLine;
import com.personalizeMethods.MyJlabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author roc
 */
public class PanelCover extends javax.swing.JPanel {

    /**
     * Creates new form PanelCover
     */
    private final DecimalFormat df=new DecimalFormat("##0.###",DecimalFormatSymbols.getInstance(Locale.US));
    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel logo;
    private JLabel description;
    private JLabel description1;
    private ButtonOutLine button;
    private boolean isLogin;
    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout=new MigLayout("wrap,fill","[center]","push[]15[]10[]15[]push");
        setLayout(layout);
        init();
    }
    public void init(){
        title=new JLabel("WELCOME TO UK");
        title.setFont(new Font("sansserif",1,30));
        title.setForeground(new Color(255, 255, 0));
        add(title);
        
        /*
        MyTextField logoUniv=new MyTextField();
        logoUniv.setForeground(new Color(255, 255, 255));
        logoUniv.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/test1.jpg")));
        
        
        //txtFirstName.setHint("FirstName");
        add(logoUniv,"w 20%, h 250");*/
        
        MyJlabel logo1=new MyJlabel();
        logo1.setFont(new Font("sansserif",1,30));
        //logo1.setBackground(new Color(96, 157, 243));
        logo1.setPrefixIcon(new ImageIcon(getClass().getResource("/com/icon/test3.jpg")));
        //add(logo1,"w 10%, h 20");
   
        
        description=new JLabel("Stay Connected With The University Platform");
        description.setFont(new Font("sansserif",1,12));
        description.setForeground(new Color(255, 255, 0));
        add(description);
        
        description1=new JLabel("Login With Your Personnal Info");
        description1.setFont(new Font("sansserif",1,12));
        description1.setForeground(new Color(255, 255, 255));
        add(description1);
        button=new ButtonOutLine();
        button.setBackground(new Color(16777215));
        button.setForeground(new Color(16777215));
        button.setFont(new Font("sansserif",1,12));
        button.setText("SIGN IN");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.actionPerformed(e);
            }
        });
        add(button,"w 60%, h 40");
    }
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        GradientPaint gra=new GradientPaint(0, 0,new Color(96, 157, 243),0, getHeight(),new Color(44, 44, 208));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    
      public void AddEvent(ActionListener event){
        this.event=event;
    }
      public void RegisterLeft(double v){
        v=Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0");
      }
      
       public void RegisterRight(double v){
        v=Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0"); 
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0"); 
        layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0"); 
      }
      
       
       public void LoginLeft(double v){
        v=Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 "+ v+ "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 "+ v+ "%");
        layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 "+ v+ "%");
          

       }
       
         public void LoginRight(double v){
            v=Double.valueOf(df.format(v));
            login(true);
            layout.setComponentConstraints(title, "pad 0 " + v + "% 0 "+ v+ "%");          
            layout.setComponentConstraints(description, "pad 0 " + v + "% 0 "+ v+ "%");
            layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 "+ v+ "%");
       }
      private void login(boolean login){
          if (this.isLogin!=login) {
              if (login) {
                  title.setText("Hello, Here!");
                  description.setText("Enter Your Personnal Details");
                  description1.setText("To Join Our Management Platform");
              }
              else{
                  title.setText("WELCOME TO UK!");
                  description.setText("SCIENCE - EXCELLENCE - CONSCIOUSNESS");
                  description1.setText("Stay Connected With The University Platform");
              }
              this.isLogin=login;
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

        jLabel2 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/test3x.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel2)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
