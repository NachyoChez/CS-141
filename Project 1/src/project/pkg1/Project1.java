package Project1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin
 */
public class Project1 extends javax.swing.JFrame
{

    /**
     * Creates new form GUIJFrame
     */
    public Project1()
    {
        initComponents();
        callDefaults();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        inputJPanel = new javax.swing.JPanel();
        paymentJLabel = new javax.swing.JLabel();
        paymentJTextField = new javax.swing.JTextField();
        rateJLabel = new javax.swing.JLabel();
        rateJSpinner = new javax.swing.JSpinner();
        nJLabel = new javax.swing.JLabel();
        nJTextField = new javax.swing.JTextField();
        yearsJLabel = new javax.swing.JLabel();
        yearsJTextField = new javax.swing.JTextField();
        imageJLabel = new javax.swing.JLabel();
        balanceJLabel = new javax.swing.JLabel();
        balanceJTextField = new javax.swing.JTextField();
        totalJLabel = new javax.swing.JLabel();
        totalJTextField = new javax.swing.JTextField();
        interestJLabel = new javax.swing.JLabel();
        interestJTextField = new javax.swing.JTextField();
        errorJLabel = new javax.swing.JLabel();
        calcJButton = new javax.swing.JButton();
        clrJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        mainJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        helpJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        inputJPanel.setBackground(new java.awt.Color(102, 204, 255));

        paymentJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paymentJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        paymentJLabel.setText("Periodic Payment:");

        rateJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rateJLabel.setText("Interest (as a %):");

        nJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nJLabel.setText("Compounds per year:");

        yearsJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yearsJLabel.setText("Years:");

        yearsJTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yearsJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputJPanelLayout = new javax.swing.GroupLayout(inputJPanel);
        inputJPanel.setLayout(inputJPanelLayout);
        inputJPanelLayout.setHorizontalGroup(
            inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(paymentJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rateJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearsJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inputJPanelLayout.setVerticalGroup(
            inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputJPanelLayout.createSequentialGroup()
                        .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentJLabel)
                            .addComponent(paymentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rateJLabel)
                            .addComponent(rateJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearsJLabel)
                            .addComponent(yearsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        balanceJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balanceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        balanceJLabel.setText("Future Annuity Balance:");

        balanceJTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                balanceJTextFieldActionPerformed(evt);
            }
        });

        totalJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalJLabel.setText("Total of Payments:");

        interestJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        interestJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        interestJLabel.setText("Total of Interest Earned:");

        errorJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorJLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorJLabel.setText(" ");

        calcJButton.setBackground(new java.awt.Color(102, 204, 255));
        calcJButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        calcJButton.setMnemonic('C');
        calcJButton.setText("Calculate");
        calcJButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calcJButtonActionPerformed(evt);
            }
        });

        clrJButton.setBackground(new java.awt.Color(102, 204, 255));
        clrJButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clrJButton.setMnemonic('r');
        clrJButton.setText("Clear");
        clrJButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clrJButtonActionPerformed(evt);
            }
        });

        printJButton.setBackground(new java.awt.Color(102, 204, 255));
        printJButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        printJButton.setMnemonic('Q');
        printJButton.setText("Quit");
        printJButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                printJButtonActionPerformed(evt);
            }
        });

        quitJButton.setBackground(new java.awt.Color(102, 204, 255));
        quitJButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        quitJButton.setMnemonic('P');
        quitJButton.setText("Print");

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        mainJMenuBar.add(fileJMenu);

        helpJMenu.setText("Help");
        mainJMenuBar.add(helpJMenu);

        setJMenuBar(mainJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clrJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(printJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(balanceJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(interestJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalJTextField)
                                    .addComponent(interestJTextField)
                                    .addComponent(balanceJTextField))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceJLabel)
                    .addComponent(balanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalJLabel)
                    .addComponent(totalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestJLabel)
                    .addComponent(interestJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrJButton)
                    .addComponent(quitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearsJTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yearsJTextFieldActionPerformed
    {//GEN-HEADEREND:event_yearsJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsJTextFieldActionPerformed

    private void balanceJTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_balanceJTextFieldActionPerformed
    {//GEN-HEADEREND:event_balanceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceJTextFieldActionPerformed

    private void calcJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calcJButtonActionPerformed
    {//GEN-HEADEREND:event_calcJButtonActionPerformed
        try
        { /*
            // Calculate the Loan Payment
            //Declare variables & assign
            final int months = 12, percentConverter = 100;

            DecimalFormat twoDecimal = new DecimalFormat("$#,##0.00");

            double loanAmount = Double.parseDouble(amountJTextField.getText());
            double rate = Double.parseDouble(rateJTextField.getText()) / percentConverter;
            double years = Double.parseDouble(yearsJTextField.getText());

            double payment = 0f;
            double interest = 0f;
            boolean invalidInputs = (loanAmount <= 0 || loanAmount > 1000000000 || rate < 0 || rate > 100 || years < 0 || years > 100);

            if (invalidInputs)
            {
                throw new NumberFormatException();
            }

            //Input
            //Processing
            double top = 0.0, bottom = 0.0, monthlyInterestRate = rate / months;
            top = loanAmount * monthlyInterestRate;
            bottom = 1 - Math.pow((1 + monthlyInterestRate), (years * -months));

            payment = top / bottom;
            interest = payment * months * years - loanAmount;
            counter++;

            //Output
            counterJTextField.setText(String.valueOf(counter));
            paymentJTextField.setText(twoDecimal.format(payment));
            interestJTextField.setText(twoDecimal.format(interest));
            */
        } catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(null, "Please enter a positive number for all required fields", "Input Error", JOptionPane.ERROR_MESSAGE);

            //amountJTextField.requestFocus();
            //amountJTextField.selectAll();
        }
    }//GEN-LAST:event_calcJButtonActionPerformed

    private void clrJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clrJButtonActionPerformed
    {//GEN-HEADEREND:event_clrJButtonActionPerformed
        // Clear All Fields and Resets Form
        callDefaults();

    }//GEN-LAST:event_clrJButtonActionPerformed

    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_printJButtonActionPerformed
    {//GEN-HEADEREND:event_printJButtonActionPerformed
        // End applicaiton
        System.exit(0);
    }//GEN-LAST:event_printJButtonActionPerformed

    private void callDefaults()
    {
        paymentJTextField.setText("");
        rateJSpinner.setValue(0);
        nJTextField.setText("");
        yearsJTextField.setText("2");
        balanceJTextField.setText("$0.00");
        totalJTextField.setText("$0.00");
        interestJTextField.setText("$0.00");
        paymentJTextField.requestFocus();
        paymentJTextField.setText("");
        rateJSpinner.setValue(0);
        nJTextField.setText("");
        yearsJTextField.setText("2");
        balanceJTextField.setText("$0.00");
        totalJTextField.setText("$0.00");
        interestJTextField.setText("$0.00");
        paymentJTextField.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Project1().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceJLabel;
    private javax.swing.JTextField balanceJTextField;
    private javax.swing.JButton calcJButton;
    private javax.swing.JButton clrJButton;
    private javax.swing.JLabel errorJLabel;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JPanel inputJPanel;
    private javax.swing.JLabel interestJLabel;
    private javax.swing.JTextField interestJTextField;
    private javax.swing.JMenuBar mainJMenuBar;
    private javax.swing.JLabel nJLabel;
    private javax.swing.JTextField nJTextField;
    private javax.swing.JLabel paymentJLabel;
    private javax.swing.JTextField paymentJTextField;
    private javax.swing.JButton printJButton;
    private javax.swing.JButton quitJButton;
    private javax.swing.JLabel rateJLabel;
    private javax.swing.JSpinner rateJSpinner;
    private javax.swing.JLabel totalJLabel;
    private javax.swing.JTextField totalJTextField;
    private javax.swing.JLabel yearsJLabel;
    private javax.swing.JTextField yearsJTextField;
    // End of variables declaration//GEN-END:variables
}
