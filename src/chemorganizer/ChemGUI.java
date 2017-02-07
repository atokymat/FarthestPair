package chemorganizer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ChemGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChemGUI
     */
    
    //Stores the elements on screen
    ArrayList<Element> elements = new ArrayList();
    Element[] e = new Element[0];
    
    //String which displays hydrogens
    String hydrogenLetter = "H";
        
    public ChemGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drawInput = new javax.swing.JTextArea();
        drawButton = new javax.swing.JButton();
        presetBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        presetButton = new javax.swing.JButton();
        showH = new javax.swing.JCheckBox();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel.setPreferredSize(new java.awt.Dimension(650, 700));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        drawInput.setColumns(20);
        drawInput.setLineWrap(true);
        drawInput.setRows(5);
        jScrollPane2.setViewportView(drawInput);

        drawButton.setText("Draw");
        drawButton.setToolTipText("");
        drawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawButtonMousePressed(evt);
            }
        });

        presetBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vinegar / Acetic Acid", "Acetone (Nail Polish Remover)", "Acetylene", "Acrylic Acid", "Butyric Acid", "Chloroform", "Dextrose", "Ethylene glycol (antifreeze)", "Formaldehyde", "Glycerol", "Lactic Acid", "Natural Gas (main component)", "Drinking Alcohol", "Rubbing Alcohol" }));

        jLabel2.setText("Use Preset:");

        jLabel1.setText("Type an IUPAC name:");
        
        outputLabel.setText("Words");

        presetButton.setText("Draw Preset");
        presetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                presetButtonMousePressed(evt);
            }
        });

        showH.setSelected(true);
        showH.setText("Show Hydrogens");
        showH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHMouseClicked(evt);
            }
        });

        resetButton.setText("Reset Screen");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(presetBox, 0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presetButton)
                    .addComponent(showH)
                    .addComponent(resetButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());		
        getContentPane().setLayout(layout);		
        layout.setHorizontalGroup(		
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)		
            .addGroup(layout.createSequentialGroup()		
                .addComponent(drawingPanel, 618, 618, javax.swing.GroupLayout.PREFERRED_SIZE)		
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)		
                    .addGroup(layout.createSequentialGroup()		
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)		
                        .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)		
                        .addGap(194, 194, 194))		
                    .addGroup(layout.createSequentialGroup()		
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)		
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)		
                        .addContainerGap())))		
        );		
        layout.setVerticalGroup(		
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)		
            .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)		
            .addGroup(layout.createSequentialGroup()		
                .addContainerGap()		
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)		
                .addGap(18, 18, 18)		
                .addComponent(outputLabel)		
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))		
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMousePressed
        //Screen reset
        resetScreen();
    }//GEN-LAST:event_resetButtonMousePressed

    private void drawButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawButtonMousePressed
        //Screen reset, then processes the name in ElementName
        resetScreen();
        ChemicalName b = new ChemicalName(drawInput.getText(), hydrogenLetter);
        this.elements = b.elements;
        outputLabel.setText(b.output);
        //Sleep so that the text update does not overwrite the graphics update
        sleep(100);
        drawImage();
    }//GEN-LAST:event_drawButtonMousePressed

    private void presetButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presetButtonMousePressed
        //Converts the preset box items to their IUPAC name, then draws it
        resetScreen();
        String selected, name = "";
        selected = (String) presetBox.getSelectedItem();
        
        if (selected.contains("Vinegar")){
            name = "ethanoic acid";
        } else if (selected.contains("Acetone")){
            name = "2-propanone";
        } else if (selected.equals("Acetylene")){
            name = "ethyne";
        } else if (selected.equals("Acrylic Acid")){
            name = "prop-2-enoic acid";
        } else if (selected.equals("Butyric Acid")){
            name = "butanoic acid";
        } else if (selected.equals("Chloroform")){
            name = "1,1,1-trichloro methane";
        } else if (selected.equals("Dextrose")){
            name = "Dextrose";
        } else if (selected.contains("Ethylene glycol")){
            name = "eth-1,2-diol";
        } else if (selected.equals("Formaldehyde")){
            name = "methanal";
        } else if (selected.equals("Glycerol")){
            name = "prop-1,2,3-triol";
        } else if (selected.equals("Lactic Acid")){
            name = "2-hydroxy propanoic acid";
        } else if (selected.contains("Natural Gas")){
            name = "methane";
        } else if (selected.equals("Drinking Alcohol")){
            name = "ethanol";
        } else { //Rubbing alcohol
            name = "2-propanol";
        }
        ChemicalName b = new ChemicalName(name, hydrogenLetter);
        this.elements = b.elements;
        outputLabel.setText(b.output);
        //Sleep so that the text update does not overwrite the graphics update
        sleep(100);
        drawImage();
    }//GEN-LAST:event_presetButtonMousePressed

    private void showHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showHMouseClicked
        //Inverts the display of the hydrogen letters
        e = getElementArray();
        
        //Shows the letter H for hydrogens
        if (showH.isSelected()){
            hydrogenLetter = "H";
            for (int i=0; i<e.length; i++){
                if (e[i].letter.equals("")){
                    e[i].letter = "H";
                }
            }
        }
        //Hides the letter H for hydrogens
        else {
            hydrogenLetter = "";
            for (int i=0; i<e.length; i++){
                if (e[i].letter.equals("H")){
                    e[i].letter = "";
                }
            }
        }
        
        drawImage();
    }//GEN-LAST:event_showHMouseClicked
           
    public void resetScreen(){
        //Resets the elements arraylist, then drays the image
        elements = new ArrayList();
        drawImage();
    }
    
    private void drawImage(){
        //Draws the image containing all the elements and bonds onto the screen
        BufferedImage bi = new BufferedImage(650, 700, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 650, 700);
        g.setColor(Color.black);
        e = getElementArray();
        for (int i=0; i<e.length; i++){
            //Draw lines to represent bonds
            if (e[i].bonds[0] != null){
                if (e[i].bondTypes[0].equals("single")) {
                    g.drawLine(e[i].x+2, e[i].y-12, e[i].bonds[0].x+2, e[i].bonds[0].y+6);
                } else if (e[i].bondTypes[0].equals("double")) {
                    g.drawLine(e[i].x+4, e[i].y-12, e[i].bonds[0].x+4, e[i].bonds[0].y+6);
                    g.drawLine(e[i].x, e[i].y-12, e[i].bonds[0].x, e[i].bonds[0].y+6);
                } else {
                    g.drawLine(e[i].x+5, e[i].y-12, e[i].bonds[0].x+5, e[i].bonds[0].y+6);
                    g.drawLine(e[i].x+2, e[i].y-12, e[i].bonds[0].x+2, e[i].bonds[0].y+6);
                    g.drawLine(e[i].x-1, e[i].y-12, e[i].bonds[0].x-1, e[i].bonds[0].y+6);

                }                    
            }            
            if (e[i].bonds[3] != null){
                if (e[i].bondTypes[3].equals("single")) {
                    g.drawLine(e[i].x+10, e[i].y-2, e[i].bonds[3].x-8, e[i].bonds[3].y-2);
                } else if (e[i].bondTypes[3].equals("double")) {
                    g.drawLine(e[i].x+10, e[i].y, e[i].bonds[3].x-8, e[i].bonds[3].y);
                    g.drawLine(e[i].x+10, e[i].y-4, e[i].bonds[3].x-8, e[i].bonds[3].y-4);
                } else {
                    g.drawLine(e[i].x+10, e[i].y+1, e[i].bonds[3].x-8, e[i].bonds[3].y+1);
                    g.drawLine(e[i].x+10, e[i].y-2, e[i].bonds[3].x-8, e[i].bonds[3].y-2);
                    g.drawLine(e[i].x+10, e[i].y-5, e[i].bonds[3].x-8, e[i].bonds[3].y-5);

                }                    
            }

            if (e[i].letter.equals("C")){
                g.setFont(new Font("default", Font.BOLD, 20));
            } else {
                g.setFont(new Font("default", Font.PLAIN, 16));
            }
            if (e[i].letter.equals("HO") || e[i].letter.equals("H\u2082N")){
                g.drawString(e[i].letter, e[i].x-22, e[i].y+5);
            } else {
                g.drawString(e[i].letter, e[i].x-5, e[i].y+5);
            }

        }
        
        drawingPanel.getGraphics().drawImage(bi, 0, 0, rootPane);
    }
    
    public Element[] getElementArray(){
        //Converts each element in the arraylist to an element in a new array
        int l = elements.size();
        Object[] objects = elements.toArray();
        Element[] e0 = new Element[l];
        
        for (int i=0; i<l; i++){
            e0[i] = (Element) objects[i];
        }
        
        return e0;
    }
    
    public void sleep(int numMillis){
        try {
            Thread.sleep(numMillis);
        } catch (Exception e){
        }
    }
    
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
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChemGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drawButton;
    private javax.swing.JTextArea drawInput;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox presetBox;
    private javax.swing.JButton presetButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JCheckBox showH;
    // End of variables declaration//GEN-END:variables
}
