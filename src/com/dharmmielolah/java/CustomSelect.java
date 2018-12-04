package com.dharmmielolah.java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 * @author damilolaaigoro
 */

public class CustomSelect extends javax.swing.JFrame {
    
    private int product_type_array_index = 0;
    private String [] product_type_sample = {"Books","Laptops","Clothes","Shoes","Food"};
    List<String> product_type_search_history = new ArrayList<>(); 
    
    public CustomSelect() {
        initComponents();
    }
    
    private void setTypeDbValue(JTextField textfield,String [] db,int index) {
        if (index < db.length && index >= 0) { textfield.setText(db[index]); }
    }
    
    private void setTypeDbValue(JTextField textfield,List db,int index) {
        if (index < db.size() && index >= 0) { textfield.setText(db.get(index).toString()); }
    }
    
    private void searchThrough(String value, String [] db, List history) {
        history.clear();
        for (String s: db) {
            if (s.contains(value)) { history.add(s); }
        }
    }
    
    private void fieldVal(JTextField field,List search_db,String [] db) {
        System.out.println(search_db.size());
        if (field.getText().isEmpty()) {
            search_db.clear();
        }else {
            searchThrough(field.getText(), db, search_db);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Form_Body = new javax.swing.JPanel();
        Product_Type_Field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        product_type_right_arrow = new javax.swing.JLabel();
        product_type_left_arrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(204, 204, 204));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Form_Body.setBackground(new java.awt.Color(255, 255, 255));
        Form_Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Product_Type_Field.setBorder(null);
        Product_Type_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Product_Type_FieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Product_Type_FieldKeyReleased(evt);
            }
        });
        Form_Body.add(Product_Type_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jLabel2.setFont(new java.awt.Font("Metropolis", 0, 13)); // NOI18N
        jLabel2.setText("Product Type");
        Form_Body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, 20));

        product_type_right_arrow.setFont(new java.awt.Font("Metropolis", 0, 24)); // NOI18N
        product_type_right_arrow.setText(">");
        product_type_right_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_type_right_arrowMouseClicked(evt);
            }
        });
        Form_Body.add(product_type_right_arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 45, 20, 20));

        product_type_left_arrow.setFont(new java.awt.Font("Metropolis", 0, 24)); // NOI18N
        product_type_left_arrow.setText("<");
        product_type_left_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_type_left_arrowMouseClicked(evt);
            }
        });
        Form_Body.add(product_type_left_arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 20, -1));

        Container.add(Form_Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_type_right_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_type_right_arrowMouseClicked
        if (product_type_search_history.isEmpty()) {
            setTypeDbValue(Product_Type_Field, product_type_sample, product_type_array_index);
            product_type_array_index++;
        }else {
            setTypeDbValue(Product_Type_Field, product_type_search_history, product_type_array_index);
            product_type_array_index++;
        }
    }//GEN-LAST:event_product_type_right_arrowMouseClicked

    private void product_type_left_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_type_left_arrowMouseClicked
        if (product_type_search_history.isEmpty()) {
            product_type_array_index--;
            setTypeDbValue(Product_Type_Field, product_type_sample, product_type_array_index);
        }else {
            product_type_array_index--;
            setTypeDbValue(Product_Type_Field, product_type_search_history, product_type_array_index);
        }
    }//GEN-LAST:event_product_type_left_arrowMouseClicked

    private void Product_Type_FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Product_Type_FieldKeyPressed
        product_type_array_index = 0;
        fieldVal(Product_Type_Field, product_type_search_history, product_type_sample);
    }//GEN-LAST:event_Product_Type_FieldKeyPressed

    private void Product_Type_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Product_Type_FieldKeyReleased
        product_type_array_index = 0;
        fieldVal(Product_Type_Field, product_type_search_history, product_type_sample);
    }//GEN-LAST:event_Product_Type_FieldKeyReleased
    
    
    
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
            java.util.logging.Logger.getLogger(CustomSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CustomSelect().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Form_Body;
    private javax.swing.JTextField Product_Type_Field;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel product_type_left_arrow;
    private javax.swing.JLabel product_type_right_arrow;
    // End of variables declaration//GEN-END:variables
}
