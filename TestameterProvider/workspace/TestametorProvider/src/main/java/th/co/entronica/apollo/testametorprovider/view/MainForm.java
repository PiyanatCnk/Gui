/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.entronica.apollo.testametorprovider.view;

import th.co.entronica.apollo.testametorprovider.controller.MainController;
import th.co.entronica.apollo.testametorprovider.controller.ManageScriptController;
import th.co.entronica.apollo.testametorprovider.controller.MasterController;
import th.co.entronica.apollo.testametorprovider.view.content.ExecuteScriptPanel;
import th.co.entronica.apollo.testametorprovider.view.content.ManageScriptPanel;

/**
 *
 * @author Pop
 */
public class MainForm extends javax.swing.JFrame {

    private MainController mainController;
    private ManageScriptController manageController;
    private ManageScriptPanel manageScriptPanel;
    private ExecuteScriptPanel executeScriptPanel;

    public MainForm(MainController mainController) {
        initComponents();
        this.setSize(550, 550);
        this.mainController = mainController;
        thirdPN.setVisible(false);
        secondPN.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaNewProjcet = new javax.swing.JDialog();
        diaTextPath = new javax.swing.JTextField();
        diaTextNameProject = new javax.swing.JTextField();
        diaBtnOk = new javax.swing.JButton();
        diaBtnCancel = new javax.swing.JButton();
        diaBtnBrowse = new javax.swing.JButton();
        diaLablePath = new javax.swing.JLabel();
        diaLableNamePro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        projectLB = new javax.swing.JLabel();
        projectNameLB = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnNewProject = new javax.swing.JButton();
        btnOpenProject = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnManageScript = new javax.swing.JButton();
        btnExecuteScript = new javax.swing.JButton();
        secondPN = new javax.swing.JPanel();
        thirdPN = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        diaNewProjcet.setTitle("New Project");

        diaBtnOk.setText("OK");
        diaBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBtnOkActionPerformed(evt);
            }
        });

        diaBtnCancel.setText("Cancel");
        diaBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBtnCancelActionPerformed(evt);
            }
        });

        diaBtnBrowse.setText("Browse");
        diaBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBtnBrowseActionPerformed(evt);
            }
        });

        diaLablePath.setText("Path");

        diaLableNamePro.setText("Name Project");

        javax.swing.GroupLayout diaNewProjcetLayout = new javax.swing.GroupLayout(diaNewProjcet.getContentPane());
        diaNewProjcet.getContentPane().setLayout(diaNewProjcetLayout);
        diaNewProjcetLayout.setHorizontalGroup(
            diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaNewProjcetLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diaLablePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diaLableNamePro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaTextNameProject)
                    .addComponent(diaTextPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaBtnBrowse)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaNewProjcetLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(diaBtnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diaBtnCancel)
                .addGap(119, 119, 119))
        );
        diaNewProjcetLayout.setVerticalGroup(
            diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaNewProjcetLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaTextPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaBtnBrowse)
                    .addComponent(diaLablePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaTextNameProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaLableNamePro))
                .addGap(26, 26, 26)
                .addGroup(diaNewProjcetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaBtnOk)
                    .addComponent(diaBtnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        projectLB.setText("Project : ");
        jToolBar1.add(projectLB);

        projectNameLB.setText("                                     ");
        jToolBar1.add(projectNameLB);
        jToolBar1.add(jSeparator2);

        btnNewProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject.png"))); // NOI18N
        btnNewProject.setFocusable(false);
        btnNewProject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewProject.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProjectActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewProject);

        btnOpenProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open-project.png"))); // NOI18N
        btnOpenProject.setFocusable(false);
        btnOpenProject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenProject.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenProjectActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpenProject);
        jToolBar1.add(jSeparator3);

        btnManageScript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage-script.png"))); // NOI18N
        btnManageScript.setFocusable(false);
        btnManageScript.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManageScript.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManageScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageScriptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnManageScript);

        btnExecuteScript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/execute-script.png"))); // NOI18N
        btnExecuteScript.setFocusable(false);
        btnExecuteScript.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExecuteScript.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExecuteScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteScriptActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExecuteScript);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 655, 25));

        javax.swing.GroupLayout secondPNLayout = new javax.swing.GroupLayout(secondPN);
        secondPN.setLayout(secondPNLayout);
        secondPNLayout.setHorizontalGroup(
            secondPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        secondPNLayout.setVerticalGroup(
            secondPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jPanel1.add(secondPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, -1));

        javax.swing.GroupLayout thirdPNLayout = new javax.swing.GroupLayout(thirdPN);
        thirdPN.setLayout(thirdPNLayout);
        thirdPNLayout.setHorizontalGroup(
            thirdPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        thirdPNLayout.setVerticalGroup(
            thirdPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jPanel1.add(thirdPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, -1));

        jMenu1.setText("File");

        jMenuItem1.setText("New Project");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open Project");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Manage Script");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Execute Script");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btnNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProjectActionPerformed
        newProject();

    }//GEN-LAST:event_btnNewProjectActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        newProject();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnManageScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageScriptActionPerformed
        if(mainController.getProjectName() != null && !(mainController.getProjectName().equals(""))){
            thirdPN.setVisible(false);
            secondPN.setVisible(true);
            showManageSciptPanael();
        }
        


    }//GEN-LAST:event_btnManageScriptActionPerformed

    private void btnExecuteScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteScriptActionPerformed
        thirdPN.setVisible(true);
        secondPN.setVisible(false);
//        showExecuteScriptPanel();
    }//GEN-LAST:event_btnExecuteScriptActionPerformed

    private void diaBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBtnOkActionPerformed
        createNewProject();
    }//GEN-LAST:event_diaBtnOkActionPerformed
    private void diaBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBtnBrowseActionPerformed
        showDialogChooser();
    }//GEN-LAST:event_diaBtnBrowseActionPerformed

    private void diaBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBtnCancelActionPerformed
        diaNewProjcet.dispose();
        diaTextNameProject.setText("");
        diaTextPath.setText("");
    }//GEN-LAST:event_diaBtnCancelActionPerformed

    private void btnOpenProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenProjectActionPerformed
        openProjcet();
    }//GEN-LAST:event_btnOpenProjectActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteScript;
    private javax.swing.JButton btnManageScript;
    private javax.swing.JButton btnNewProject;
    private javax.swing.JButton btnOpenProject;
    private javax.swing.JButton diaBtnBrowse;
    private javax.swing.JButton diaBtnCancel;
    private javax.swing.JButton diaBtnOk;
    private javax.swing.JLabel diaLableNamePro;
    private javax.swing.JLabel diaLablePath;
    private javax.swing.JDialog diaNewProjcet;
    private javax.swing.JTextField diaTextNameProject;
    private javax.swing.JTextField diaTextPath;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel projectLB;
    private javax.swing.JLabel projectNameLB;
    private javax.swing.JPanel secondPN;
    private javax.swing.JPanel thirdPN;
    // End of variables declaration//GEN-END:variables

    private void newProject() {
        mainController.newProject(this);
        diaNewProjcet.show();
        diaNewProjcet.setSize(400, 200);
        diaTextPath.setEnabled(false);
        if (mainController.getProjectName() != null) {
            mainController.setOpenProject(true);
            projectNameLB.setText(mainController.getProjectName());
        }
    }

    private void showManageSciptPanael() {
        manageScriptPanel = MasterController.getInstance().getManageScriptPanel();
        manageScriptPanel.initValue();
        javax.swing.GroupLayout secondPNLayout = new javax.swing.GroupLayout(secondPN);
        secondPN.setLayout(secondPNLayout);
        secondPNLayout.setHorizontalGroup(
                secondPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(manageScriptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        secondPNLayout.setVerticalGroup(
                secondPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(secondPNLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageScriptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }

    private void showExecuteScriptPanel() {
        executeScriptPanel = new ExecuteScriptPanel();
        javax.swing.GroupLayout thirdPNLayout = new javax.swing.GroupLayout(thirdPN);
        thirdPN.setLayout(thirdPNLayout);
        thirdPNLayout.setHorizontalGroup(
                thirdPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(executeScriptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        thirdPNLayout.setVerticalGroup(
                thirdPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(thirdPNLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(executeScriptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }

    private void showDialogChooser() {
        mainController.showDialogChooser(this);
        diaTextPath.setText(mainController.getProjectPath());
    }

    private void createNewProject() {
        mainController.createNewProject(diaTextNameProject.getText().toString());
        diaNewProjcet.dispose();
        diaTextNameProject.setText("");
        diaTextPath.setText("");
        projectNameLB.setText(mainController.getProjectName());
    }

    private void openProjcet() {
        mainController.showDialogOpenFile(this);
        projectNameLB.setText(mainController.getProjectName());
    }
}