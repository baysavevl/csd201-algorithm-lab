/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdex11_vonkocksnowflakes;

import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Luu Thieu Gia
 */
public class VonKockSnowflakes extends javax.swing.JFrame {

    double oneDegree = Math.PI/180;
    
    double angle = 0;
    Point curP = new Point();
    Point p    = new Point();
    Graphics g = null;
    boolean startup = false;
    
    //pControl.setLayout(new FlowLayout(Layout.Right));
    
    public VonKockSnowflakes() {
        initComponents();
        this.setSize(700, 700);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        
        
        
    }

    private void startupGraphics()
    {
        curP.x = 200;
        curP.y = (this.getHeight() - this.pControl.getHeight());
        
        g = this.getGraphics();
        startup = true;
    }
    
    private void turnRight(double x)
    {
        angle += x;
    }
    
    private void turnLeft(double x)
    {
        angle -= x;
    }
    
    //draw from the initiate point to p, update the recent point
    private void drawTo( Point p, Graphics g)
    {
        g.drawLine(curP.x, curP.y, p.x, p.y);
        curP = p;
    }
    
    //draw a snowflake based on the level by drawing by size
    //
    //
    
    private void draw4Lines(double side, int level, Graphics g)
    {
        if (level == 0)
        {
            p.x = curP.x + ((int) (Math.cos(angle * oneDegree)* side));
            p.y = curP.y + ((int) (Math.sin(angle * oneDegree)* side));
            this.drawTo(p, g);
        }
        
        else
        {
            draw4Lines(side/3.0, level-1, g);
            turnLeft(60);
            
            draw4Lines(side/3.0, level-1, g);
            turnRight(120);
            
            draw4Lines(side/3.0, level-1, g);
            turnLeft(60);
            
            draw4Lines(side/3.0, level-1, g);
        }
    }
    
    private void drawFlake(double side, int level, Graphics g)
    {
        for (int i = 1; i<= 3; i++)
        {
            draw4Lines(side, level, g);
            turnRight(120);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pControl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        btnDraw = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Flake's length");

        jLabel2.setText("Level");

        btnDraw.setText("Draw");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pControlLayout = new javax.swing.GroupLayout(pControl);
        pControl.setLayout(pControlLayout);
        pControlLayout.setHorizontalGroup(
            pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLength, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(27, 27, 27))
        );
        pControlLayout.setVerticalGroup(
            pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pControlLayout.createSequentialGroup()
                .addGroup(pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pControlLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(pControlLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDraw)
                            .addComponent(btnClear)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        if (!startup) this.startupGraphics();
        //khoi dong do hoa
        
        double size = Double.parseDouble(this.txtLength.getText());
        int level = Integer.parseInt(this.txtLevel.getText());
        
        //paint
        this.drawFlake(size, level, g);
    }//GEN-LAST:event_btnDrawActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        this.repaint();
        curP.x = 200;
        curP.y = (this.getHeight() - this.pControl.getHeight());
        this.angle = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VonKockSnowflakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VonKockSnowflakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VonKockSnowflakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VonKockSnowflakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VonKockSnowflakes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pControl;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtLevel;
    // End of variables declaration//GEN-END:variables
}
