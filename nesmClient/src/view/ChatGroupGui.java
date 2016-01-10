/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClientController;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import model.User;

/**
 *
 * @author Eman
 */
public class ChatGroupGui extends javax.swing.JFrame {

    //declartion 
    Vector<User> participants;
    String name;
    ClientController clientController;
     DefaultListModel participantsModel=new DefaultListModel();  
    /**
     * Creates new form chatGroupJFrame
     */
    public ChatGroupGui(String name,Vector<User> participants,ClientController c) {
        clientController=c;
        initComponents();
        this.name=name;
        //change the name of window
        this.setTitle(name);
        chatNameLabel.setText(name);
        
        this.participants=participants;
         for(int i=0;i<participants.size();i++){
       
           System.out.println("ana gwa el chat group aho w ana esmy "+participants.get(i).getUsername());
       }
        paintList();
       ImageIcon logo=new ImageIcon(getClass().getResource("/view/logo.png"));
        this.setIconImage(logo.getImage());
        this.setVisible(true);
    }
    
    /**
     * receive a message and display it.
     * @param user
     * @param msg 
     */
    public void receiverMessage(User user,String msg){
    
         if(msg.equals("<nudge>")){
        
                
                       
                         
                   new PlayaudioFile(getClass().getResource("/sounds/nudge.wav"));
                            
                                
                            
                
          
            }
 
        else{
        String txt=user.getUsername()+" : "+msg+"\n";
        outputjTextArea.append(txt);
       new PlayaudioFile(getClass().getResource("/sounds/new_message.wav"));
   
         }   
      }
    
    public void sendMessage(String message){
    
        clientController.sendGroupMessage(message, name, participants);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputjTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputjTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        participantsJlist = new javax.swing.JList<>();
        sendButton = new javax.swing.JButton();
        chatNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nudge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        outputjTextArea.setColumns(20);
        outputjTextArea.setRows(5);
        jScrollPane1.setViewportView(outputjTextArea);

        inputjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjTextFieldActionPerformed(evt);
            }
        });
        inputjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputjTextFieldKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(inputjTextField);

        jScrollPane3.setViewportView(participantsJlist);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        sendButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/send .png"))); // NOI18N
        sendButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        chatNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chatNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        chatNameLabel.setText("NESM CAHT");

        nudge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/nudge.png"))); // NOI18N
        nudge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nudgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nudge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sendButton)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chatNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chatNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nudge, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputjTextFieldActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        String msg =inputjTextField.getText();
        inputjTextField.setText("");
        sendMessage(msg);
        
    }//GEN-LAST:event_sendButtonActionPerformed

    private void inputjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputjTextFieldKeyPressed
        
       if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_ACCEPT){
            sendButton.doClick();
        }
    }//GEN-LAST:event_inputjTextFieldKeyPressed

    private void nudgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nudgeActionPerformed
        
        sendMessage("<nudge>");
    }//GEN-LAST:event_nudgeActionPerformed

    private void paintList(){
    
        participantsModel.clear();
        for(int i=0;i<participants.size();i++){
            
            participantsModel.addElement(participants.get(i));
            
        }
       participantsJlist.setCellRenderer(new ChatGroupListRender());
     
        participantsJlist.setModel(participantsModel);
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chatNameLabel;
    private javax.swing.JTextField inputjTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nudge;
    private javax.swing.JTextArea outputjTextArea;
    private javax.swing.JList<User> participantsJlist;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
