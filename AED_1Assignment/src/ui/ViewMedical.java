/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.MedicalRecord;

/**
 *
 * @author kshit
 */
public class ViewMedical extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedical
     */
     MedicalRecord medrec;
    public ViewMedical( MedicalRecord medrec) {
        initComponents();
        this.medrec = medrec;
        displayMedRecord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitle = new javax.swing.JLabel();
        lMedRecordNo = new javax.swing.JLabel();
        lUniPatientCode = new javax.swing.JLabel();
        lHealthPlanNo = new javax.swing.JLabel();
        lIllness1 = new javax.swing.JLabel();
        lIllness2 = new javax.swing.JLabel();
        tMedRecordNo = new javax.swing.JTextField();
        tUniPatientCode = new javax.swing.JTextField();
        tHealthPlanNo = new javax.swing.JTextField();
        tIllness1 = new javax.swing.JTextField();
        tIllness2 = new javax.swing.JTextField();

        lTitle.setText("View Medical Records");

        lMedRecordNo.setText("Medical Record No:");

        lUniPatientCode.setText("Unique Patient Code:");

        lHealthPlanNo.setText("Health Plan Beneficiary No:");

        lIllness1.setText("Illness1:");

        lIllness2.setText("Illness2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lUniPatientCode)
                            .addComponent(lMedRecordNo)
                            .addComponent(lHealthPlanNo)
                            .addComponent(lIllness2)
                            .addComponent(lIllness1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tMedRecordNo, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(tUniPatientCode)
                            .addComponent(tHealthPlanNo)
                            .addComponent(tIllness1)
                            .addComponent(tIllness2))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMedRecordNo)
                    .addComponent(tMedRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUniPatientCode)
                    .addComponent(tUniPatientCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHealthPlanNo)
                    .addComponent(tHealthPlanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIllness1)
                    .addComponent(tIllness1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIllness2)
                    .addComponent(tIllness2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lHealthPlanNo;
    private javax.swing.JLabel lIllness1;
    private javax.swing.JLabel lIllness2;
    private javax.swing.JLabel lMedRecordNo;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lUniPatientCode;
    private javax.swing.JTextField tHealthPlanNo;
    private javax.swing.JTextField tIllness1;
    private javax.swing.JTextField tIllness2;
    private javax.swing.JTextField tMedRecordNo;
    private javax.swing.JTextField tUniPatientCode;
    // End of variables declaration//GEN-END:variables

    private void displayMedRecord() {
        
        tHealthPlanNo.setText(medrec.getHealthPlanBenNo());
        tIllness1.setText(medrec.getIllness1());
        tIllness2.setText(medrec.getIllness2());
        tMedRecordNo.setText(medrec.getMedRecordNo());
        tUniPatientCode.setText(medrec.getUniquePatientCode());
        
    
    }
}
