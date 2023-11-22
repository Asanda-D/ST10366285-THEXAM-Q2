
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */

interface IEstateAgent {
    double CalculateCommission(String propertyPrice, String agentCommission);

    boolean ValidateData(Data dataToValidate);
}//end of IEstateAgent interface

class Data 
{
    String agentLocation;
    String agentName;
    String propertyPrice;
    String commissionPercentage;

    Data(String agentLocation, String agentName, String propertyPrice, String commissionPercentage) 
    {
        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.commissionPercentage = commissionPercentage;
    }//end of Data constructor
    
}//end of Data class

class EstateAgent1 implements IEstateAgent {
    
    //Method to calculate commision percentage using propertyPrice
    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) 
    {
        double price = Double.parseDouble(propertyPrice);
        double commissionPercentage = Double.parseDouble(agentCommission) / 100;
        return price * commissionPercentage;
    }//end of CalculateCommission()
    
    
    @Override
    public boolean ValidateData(Data dataToValidate) 
    {
        return !dataToValidate.agentLocation.isEmpty() &&
                !dataToValidate.agentName.isEmpty() &&
                Double.parseDouble(dataToValidate.propertyPrice) > 0 &&
                Integer.parseInt(dataToValidate.commissionPercentage) > 0;
    }//end of ValidateData()
}

//ST10366285 PROG6112THExam QUESTION 2
public class EstateAgent extends javax.swing.JFrame {

    /**
     * Creates new form EstateAgent
     */
    private EstateAgent1 estateAgent1;
     
    public EstateAgent() {
        initComponents();
        estateAgent1 = new EstateAgent1();
        
        //Adding action listeners for text fields
        agentName.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                agentNameActionPerformed(evt);
            }
        });

        propertyPrice.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                propertyPriceActionPerformed(evt);
            }
        });

        commissionPercentage.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                commissionPercentageActionPerformed(evt);
            }
        });

        // Add action listeners for menu items
        processReportButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                processReportButtonActionPerformed(evt);
            }
        });

        clearButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                clearButtonActionPerformed(evt);
            }
        });

        saveReportButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                saveReportButtonActionPerformed(evt);
            }
        });

        exitButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                exitButtonActionPerformed(evt);
            }
        });
    }//end of EstateAgent() constructor
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        agentLocationLabel = new javax.swing.JLabel();
        agentNameLabel = new javax.swing.JLabel();
        propPriceLabel = new javax.swing.JLabel();
        commPercentLabel = new javax.swing.JLabel();
        agentReportLabel = new javax.swing.JLabel();
        locationBox = new javax.swing.JComboBox<>();
        agentName = new javax.swing.JTextField();
        propertyPrice = new javax.swing.JTextField();
        commissionPercentage = new javax.swing.JTextField();
        estateAgentReport = new javax.swing.JScrollPane();
        reportText = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileButton = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenuItem();
        toolsButton = new javax.swing.JMenu();
        processReportButton = new javax.swing.JMenuItem();
        clearButton = new javax.swing.JMenuItem();
        saveReportButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        agentLocationLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agentLocationLabel.setText("AGENT LOCATION:");

        agentNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agentNameLabel.setText("ESTATE AGENT NAME:");

        propPriceLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propPriceLabel.setText("PROPERTY PRICE:");

        commPercentLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        commPercentLabel.setText("COMMISION PERCENTAGE:");

        agentReportLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agentReportLabel.setText("ESTATE AGENT REPORT:");

        locationBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAPE TOWN", "DURBAN", "PRETORIA", " " }));

        agentName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentNameActionPerformed(evt);
            }
        });

        propertyPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        propertyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyPriceActionPerformed(evt);
            }
        });

        commissionPercentage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        commissionPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionPercentageActionPerformed(evt);
            }
        });

        reportText.setColumns(20);
        reportText.setRows(5);
        estateAgentReport.setViewportView(reportText);

        fileButton.setText("File");

        exitButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        fileButton.add(exitButton);

        jMenuBar1.add(fileButton);

        toolsButton.setText("Tools");

        processReportButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        processReportButton.setText("Process Report");
        processReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReportButtonActionPerformed(evt);
            }
        });
        toolsButton.add(processReportButton);

        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        toolsButton.add(clearButton);

        saveReportButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        saveReportButton.setText("Save Report");
        saveReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReportButtonActionPerformed(evt);
            }
        });
        toolsButton.add(saveReportButton);

        jMenuBar1.add(toolsButton);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(agentLocationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(agentNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agentName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(propPriceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(propertyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(commPercentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(commissionPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(agentReportLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(estateAgentReport))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentLocationLabel)
                    .addComponent(locationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentNameLabel)
                    .addComponent(agentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propPriceLabel)
                    .addComponent(propertyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commPercentLabel)
                    .addComponent(commissionPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(agentReportLabel)
                .addGap(18, 18, 18)
                .addComponent(estateAgentReport, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentNameActionPerformed
        //Moves focus to the next field(propertyPrice)
        propertyPrice.requestFocus();
    }//GEN-LAST:event_agentNameActionPerformed

    private void propertyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyPriceActionPerformed
        //Moves focus to the next field(commissionPercentage)
        commissionPercentage.requestFocus();
    }//GEN-LAST:event_propertyPriceActionPerformed

    private void processReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReportButtonActionPerformed
        //This method is called when user clicks "Process Report" menu item
        //It gathers data from UI fields, performs any necessary calculations
        //and updates reportText area with generated report

        //Gathering data and updating reportText with a sample report
        Data data = new Data
        (
                locationBox.getSelectedItem().toString(),
                agentName.getText(),
                propertyPrice.getText(),
                commissionPercentage.getText()
        );

        if (estateAgent1.ValidateData(data)) 
        {
            double commission = estateAgent1.CalculateCommission(data.propertyPrice, data.commissionPercentage);
            String report = "AGENT LOCATION: " + data.agentLocation +
                            "\nAGENT NAME: " + data.agentName +
                            "\nPROPERTY PRICE: " + data.propertyPrice +
                            "\nCOMMISSION PERCENTAGE: " + data.commissionPercentage + "%" +
                            "\nCALCULATED COMMISSION: R " + String.format("%.2f", commission);

                reportText.setText(report);
            } else {
                reportText.setText("Invalid data. Please check the input values.");
        }//end of if statement
        
    }//GEN-LAST:event_processReportButtonActionPerformed

    private void saveReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReportButtonActionPerformed
        //This method is called when user clicks "Save Report" menu item
        //Saves reportText content to file "report.txt"

        //Save reportText content to file "report.txt"
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write(reportText.getText());
            JOptionPane.showMessageDialog(this, "Report saved to report.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving report to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }//End of try catch
    }//GEN-LAST:event_saveReportButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //This method is called when user clicks "Exit" menu item
        //Handles any cleanup or actions needed before closing the application
        //Prompts user to confirm exit

        //Showing confirmation dialog before exiting
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) 
        {
            System.exit(0);
        }//end of if statement
        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        //This method is called when user clicks "Clear" menu item
        //Clears the values in your UI fields and the reportText area

        //Clears UI fields and reportText
        agentName.setText("");
        propertyPrice.setText("");
        commissionPercentage.setText("");
        reportText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void commissionPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionPercentageActionPerformed
        //This method is called when user hits "Enter" or interacts with commissionPercentage field.
        
    }//GEN-LAST:event_commissionPercentageActionPerformed

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
            java.util.logging.Logger.getLogger(EstateAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstateAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstateAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstateAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new EstateAgent().setVisible(true);
            }
        });
        
    }//end of main()

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agentLocationLabel;
    private javax.swing.JTextField agentName;
    private javax.swing.JLabel agentNameLabel;
    private javax.swing.JLabel agentReportLabel;
    private javax.swing.JMenuItem clearButton;
    private javax.swing.JLabel commPercentLabel;
    private javax.swing.JTextField commissionPercentage;
    private javax.swing.JScrollPane estateAgentReport;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JMenu fileButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> locationBox;
    private javax.swing.JMenuItem processReportButton;
    private javax.swing.JLabel propPriceLabel;
    private javax.swing.JTextField propertyPrice;
    private javax.swing.JTextArea reportText;
    private javax.swing.JMenuItem saveReportButton;
    private javax.swing.JMenu toolsButton;
    // End of variables declaration//GEN-END:variables

}//end of EstateAgent class


/*
Bibliography
Farrel, J. (2016). JAVA PROGRAMMING. Boston: Cengage Learning.
Farrell, J. (2018). Programming Logic & Design, Comprehensive. Boston: Cengage Learning; 9th edition.
Hamilton, T. (2023, October 28). GURU99. Retrieved from www.guru99.com: https://www.guru99.com/junit-tutorial.html
Niraj_Pandey. (2023, June 4). GeeksForGeeks. Retrieved from www.geeksforgeeks.org: https://www.geeksforgeeks.org/java-string-format-method-with-examples/
realcode4you. (2021, June 20). RealCode4You. Retrieved from www.realcode4you.com: https://www.realcode4you.com/post/create-a-simple-java-gui-application-using-the-netbeans
*/