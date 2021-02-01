/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarsRoverMain;
import com.irs.jam.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rossw
 */
public class Rover extends javax.swing.JFrame {

    /**
     * Creates new form Rover
     */
    JAM jamAgent;
    Interpreter interpreter;
    String JamCode;
    PrintStream printstream;
    
    
    public Rover() {
        initComponents();
        jamAgent = new JAM();
        interpreter = jamAgent.getInterpreter();
        // Boiler plate
        JamCode ="";
        printstream = createprintstream();
        try {
            addboilerplate();
        } catch (IOException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    // what the fuck is happening 
    
    public PrintStream createprintstream(){
       // ConsoleOutputStream outputstream = new ConsoleOutputStream(jTextArea1);
        PrintStream printStream = new PrintStream(new ConsoleOutputStream(jTextArea1));
        System.setOut(printStream);
        System.setErr(printStream);
        return printStream;
      //   PrintStream printstream =  new PrintStream(outputstream);
        
    }
    
    public void addboilerplate() throws IOException{
        FileReader fr = null;
        File myFile = new File("C:\\Users\\rossw\\OneDrive\\Desktop\\Computing year 3\\AI SHIT\\MarsRover\\src\\MarsRoverMain\\start.txt");
        try {
            fr = new FileReader(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
        int i = 0; 
      //  bufferedReader.;
        while ((str = bufferedReader.readLine()) != null) {
            JamCode = JamCode + "\n" + str;
        }
//        System.out.println("jam code is " + JamCode);
        
      //  interpreter.parseString(interpreter, JamCode); 
    }
    
    public void addplans() throws IOException {
         FileReader fr = null;
        File myFile = new File("C:\\Users\\rossw\\OneDrive\\Desktop\\Computing year 3\\AI SHIT\\MarsRover\\src\\MarsRoverMain\\plans.txt");
        try {
            fr = new FileReader(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        String str;
        int i = 0; 
      //  bufferedReader.;
        while ((str = br.readLine()) != null) {
            JamCode = JamCode + "\n" + str;
        }
//        System.out.println("jam code is " + JamCode);
        
        // interpreter.parseString(interpreter, JamCode);
    }
    
    public void runJam() throws IOException {
        FileReader fr = null;
        // add the plans to the file.
        File myFile = new File("C:\\Users\\rossw\\OneDrive\\Desktop\\Computing year 3\\AI SHIT\\MarsRover\\src\\MarsRoverMain\\plans.txt");
        try {
            fr = new FileReader(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
        int i = 0; 
        while ((str = bufferedReader.readLine()) != null) {
            JamCode = JamCode + "\n" + str;
        }
        
    //   System.out.println("JAM CODE IS \n" + JamCode);
        interpreter.parseString(interpreter, JamCode);
        try {
              jamAgent.think(interpreter);
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
  
    
    public void jamagent() throws IOException {
        FileReader fr = null;
        File myFile = new File("C:\\Users\\rossw\\OneDrive\\Desktop\\Computing year 3\\AI SHIT\\MarsRover\\src\\MarsRoverMain\\file.txt");
        // C:\Users\rossw\OneDrive\Desktop\Computing year 3\AI SHIT\MarsRover
        try {
            fr = new FileReader(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
        int i = 0; 
      //  bufferedReader.;
        while ((str = bufferedReader.readLine()) != null) {
            JamCode = JamCode + str;
        }
//        System.out.println("jam code is " + JamCode);
        
        Interpreter intre = jamAgent.getInterpreter();
        intre.parseString(intre,JamCode);
        try {
              jamAgent.think(intre);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
        // add facts
        // EXECUTE setShowGoalList "";
        // iterate through map 
       // interpreter.setWorldModel(FACT );
        // check for rocks
        
        //check for water 
        
        // go home 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rocks_added = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "false", "true" }));

        jLabel1.setText("X :");

        jLabel2.setText("Y:");

        jLabel3.setText("Water?");

        jButton3.setText("GO!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(rocks_added);

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // String JamCode = "";
        int x = jComboBox4.getSelectedIndex();
        int y = jComboBox5.getSelectedIndex();
        int is_there_water = jComboBox3.getSelectedIndex();
        String water;
        if(is_there_water == 1){
            water = "true";
        } else {
            water = "false";
        }
        String newFact = "\nFACT rock \"" + water  + "\" " + x + " " + y + ";";
        JamCode = JamCode +  newFact;
       // System.out.println("new Fact : " + JamCode);
        rocks_added.setText(rocks_added.getText() + "\nX:" +x+ " Y: " +y+ " water = " + water );
       //  interpreter intre = jamAgent.getInterpreter();
       // interpreter.parseString(interpreter ,JamCode);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
//            jamagent();
            runJam();
        } catch (IOException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jamAgent = new JAM();
        interpreter = jamAgent.getInterpreter();
        JamCode ="";
        jTextArea1.setText("");
        rocks_added.setText("");
        PrintStream createprintstream = createprintstream();
        
     //   printstream = createprintstream();
        try {
            addboilerplate();
        } catch (IOException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Rover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rover().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane rocks_added;
    // End of variables declaration//GEN-END:variables
}
