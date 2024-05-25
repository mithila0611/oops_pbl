package studentevaluationsystem;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class StudentsGrades extends javax.swing.JFrame {

    /**
     * Creates new form StudentsGrades
     */

     
    public StudentsGrades() {
        initComponents();
    }

    
    private static final String username = "root";
    private static final String password = "Aishwarya@456";
    private static final String database = "jdbc:mysql://localhost:3306/studentevaluationsystem";
    
    Connection con = null;
    PreparedStatement p =null;
    ResultSet r =null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    int opim,pyim,cnim,coaim,opem,pyem,cnem,coaem;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlOopIm = new javax.swing.JLabel();
        jlPyIm = new javax.swing.JLabel();
        jlCnIm = new javax.swing.JLabel();
        jlCoaIm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IMooptxt = new javax.swing.JTextField();
        IMpytxt = new javax.swing.JTextField();
        IMcntxt = new javax.swing.JTextField();
        IMcoatxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        EMooptxt = new javax.swing.JTextField();
        jlPyEm = new javax.swing.JLabel();
        EMpytxt = new javax.swing.JTextField();
        jlCnEm = new javax.swing.JLabel();
        EMcntxt = new javax.swing.JTextField();
        jlCoaEm = new javax.swing.JLabel();
        EMcoatxt = new javax.swing.JTextField();
        jlOppEm = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UpdateStudentGrades");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setText("Student Evaluation System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlOopIm.setText("Marks in OOP:");
        jPanel2.add(jlOopIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        jlPyIm.setText("Marks in Python:");
        jPanel2.add(jlPyIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        jlCnIm.setText("Marks in Computer Networks:");
        jPanel2.add(jlCnIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, -1, -1));

        jlCoaIm.setText("Marks in Computer organization and architecture:");
        jPanel2.add(jlCoaIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Internal Examination Marks(out of 30)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, -1));

        IMooptxt.setColumns(20);
        IMooptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMooptxtActionPerformed(evt);
            }
        });
        jPanel2.add(IMooptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 42, 85, -1));

        IMpytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMpytxtActionPerformed(evt);
            }
        });
        jPanel2.add(IMpytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 82, 85, -1));
        jPanel2.add(IMcntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 122, 85, -1));

        IMcoatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(IMcoatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 162, 85, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 370, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,80));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel26.setText("External Examination Marks(out of 70)");

        EMooptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMooptxtActionPerformed(evt);
            }
        });

        jlPyEm.setText("Marks in Python:");

        jlCnEm.setText("Marks in Computer Networks:");

        EMcntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMcntxtActionPerformed(evt);
            }
        });

        jlCoaEm.setText("Marks in Computer organization and architecture:");

        EMcoatxt.setColumns(10);
        EMcoatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMcoatxtActionPerformed(evt);
            }
        });

        jlOppEm.setText("Marks in OOP:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlOppEm)
                .addGap(194, 194, 194)
                .addComponent(EMooptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlPyEm)
                .addGap(181, 181, 181)
                .addComponent(EMpytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlCnEm)
                .addGap(112, 112, 112)
                .addComponent(EMcntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlCoaEm)
                .addGap(8, 8, 8)
                .addComponent(EMcoatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel26)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EMooptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOppEm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EMpytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPyEm))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlCnEm))
                    .addComponent(EMcntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlCoaEm))
                    .addComponent(EMcoatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 420, 190));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Evaluate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 88, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 86, -1));

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, 86, -1));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 53, -1, -1));

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 18, -1, -1));

        jButton6.setText("Print data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 135, 176, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 200, -1));

        jLabel2.setText("Overall Grade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 338, -1, -1));

        jLabel3.setText("Sgpa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 366, -1, -1));

        jLabel5.setText("Pass/Fail:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 338, 50, -1));

        jLabel6.setText("Subjects failed in:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 366, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 335, 100, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 363, 100, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 335, 90, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 363, 190, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student ID", "OOP Internal marks", "Python Internal marks", "CN Internal marks", "COA Internal marks", "OOP External marks", "Python External marks", "CN Externa marks", "COA External marks", "Overall grade", "SGPA", "Pass/Fail", "Subjects Failed"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1020, 300));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pexels-cottonbro-5124882.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IMooptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMooptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMooptxtActionPerformed

    private void IMpytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMpytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMpytxtActionPerformed

    private void EMooptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMooptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMooptxtActionPerformed

    private void EMcntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMcntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMcntxtActionPerformed

    private void EMcoatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMcoatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMcoatxtActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedrows = jTable1.getSelectedRow();
        try
        {
            String name = model.getValueAt(selectedrows, 1).toString();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(database,username,password);
            p = con.prepareStatement("update studentgrades set IMoop = ?,IMpy = ?,IMcn = ?,IMcoa = ?,EMoop = ?,EMpy = ?,EMcn = ?,EMcoa=?,OverallGrade =?,Sgpa = ?,PassOrFail =?,FailedSubjects = ? Where StudentName = ?");
            opim = Integer.parseInt(IMooptxt.getText());
            pyim = Integer.parseInt(IMpytxt.getText());
            cnim = Integer.parseInt(IMcntxt.getText());
            coaim = Integer.parseInt(IMcoatxt.getText());
            opem = Integer.parseInt(EMooptxt.getText());
            pyem = Integer.parseInt(EMpytxt.getText());
            cnem = Integer.parseInt(EMcntxt.getText());
            coaem = Integer.parseInt(EMcoatxt.getText());
            
            p.setInt(1, opim);
            p.setInt(2,pyim);
            p.setInt(3,cnim);
            p.setInt(4,coaim);
            p.setInt(5,opem);
            p.setInt(6,pyem);
            p.setInt(7,cnem);
            p.setInt(8,coaem);
            p.setString(9,jTextField3.getText());
            p.setString(10,jTextField8.getText());
            p.setString(11,jTextField11.getText());
            p.setString(12,jTextField12.getText());
            p.setString(13,name);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            jButton6.doClick();
            jButton3.doClick();
        }
        catch(ClassNotFoundException e)
        {
            java.util.logging.Logger.getLogger(StudentsInformation.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        catch(SQLException e)
        {
            java.util.logging.Logger.getLogger(StudentsInformation.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
       
        int Internal_Marks_sum,External_Marks_sum,Total_sum;
        if(IMooptxt.getText().isEmpty() ||IMpytxt.getText().isEmpty()||IMcntxt.getText().isEmpty()||IMcoatxt.getText().isEmpty() ||EMooptxt.getText().isEmpty()||EMcntxt.getText().isEmpty()||EMcoatxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(StudentsGrades.this, "Enter All Fields");
        }
        else
        {
            try {
            opim = Integer.parseInt(IMooptxt.getText());
            pyim = Integer.parseInt(IMpytxt.getText());
            cnim = Integer.parseInt(IMcntxt.getText());
            coaim = Integer.parseInt(IMcoatxt.getText());
            opem = Integer.parseInt(EMooptxt.getText());
            pyem = Integer.parseInt(EMpytxt.getText());
            cnem = Integer.parseInt(EMcntxt.getText());
            coaem = Integer.parseInt(EMcoatxt.getText());
            if((opim >30 || pyim >30 || cnim >30 || coaim >30) || (opim < 0 || pyim < 0 || cnim < 0 || coaim  < 0) || (opem >70 || pyem >70 || cnem >70 || coaem >70) || (opem < 0 || pyem < 0 || cnem < 0 || coaem  < 0))
            {
                JOptionPane.showMessageDialog(StudentsGrades.this, "Enter Valid marks");
            }
            else if(opem < 35 || opem < 35 || cnem < 35 || coaem  < 35)
            {
                String text="";
                jTextField3.setText("--nograde--");
                jTextField8.setText("--nosgpa--");
                jTextField11.setText("Fail");
                if(opem < 35)
                {
                    text+="Oop ";
                }
                else if(pyem < 35)
                {
                    text+="Python ";
                }
                if(cnem < 35)
                {
                    text+="Cn ";
                }
                if(coaem < 35)
                {
                    text+="Coa ";
                }
                jTextField12.setText(text);
            }
            else
            {
                String grade = null;
                Internal_Marks_sum = opim+pyim+cnim+coaim;
                External_Marks_sum = opem+pyem+cnem+coaem;
                Total_sum=Internal_Marks_sum+External_Marks_sum;
                double per = ((Total_sum)*100)/400;
		if (per >= 90){
			grade = "A";
		}
		else if(per >= 80 && per <90){
			grade = "B";
		}
		else if(per >= 70 && per <80){
			grade = "C";
		}
		else if(per >= 60 && per <70){
			grade = "D";
		}
		else if(per >= 50 && per <60){
			grade = "E";
		}
		else if(per < 50){
			grade = "F";
		}
                String str = Double.toString(per);
                jTextField3.setText(grade);
                jTextField8.setText(str);
                jTextField11.setText("Pass");
                jTextField12.setText("--None--");
            }
            jButton2.setEnabled(true);
            
            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormat Exception: invalid input string");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField8.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        IMooptxt.setText("");
        IMpytxt.setText("");
        IMcntxt.setText("");
        IMcoatxt.setText("");
        EMooptxt.setText("");
        EMpytxt.setText("");
        EMcntxt.setText("");
        EMcoatxt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

private JFrame frame;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Conform if you want to exit","MySQL Connecter",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0); 
        try {
            // TODO add your handling code here:
            con = DriverManager.getConnection(database,username,password);
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTGRADES");
                while(rs.next())
                {
                    int id = rs.getInt("ID");
                    String name = rs.getString("StudentName");
                    int imoop = rs.getInt("IMoop");
                    int impy = rs.getInt("IMpy");
                    int imcn = rs.getInt("IMcn");
                    int imcoa = rs.getInt("IMcoa");
                    int emoop = rs.getInt("EMoop");
                    int empy = rs.getInt("EMpy");
                    int emcn = rs.getInt("EMcn");
                    int emcoa = rs.getInt("EMcoa");
                    String og = rs.getString("OverallGrade");
                    String sgpa = rs.getString("Sgpa");
                    String pf = rs.getString("PassOrFail");
                    String fs = rs.getString("FailedSubjects");
                    model.addRow(new Object[]{id,name,imoop,impy,imcn,imcoa,emoop,empy,emcn,emcoa,og,sgpa,pf,fs});
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentsInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedrows = jTable1.getSelectedRow();
        IMooptxt.setText(model.getValueAt(selectedrows, 2).toString());
        IMpytxt.setText(model.getValueAt(selectedrows, 3).toString());
        IMcntxt.setText(model.getValueAt(selectedrows, 4).toString());
        IMcoatxt.setText(model.getValueAt(selectedrows, 5).toString());
        EMooptxt.setText(model.getValueAt(selectedrows, 6).toString());
        EMpytxt.setText(model.getValueAt(selectedrows, 7).toString());
        EMcntxt.setText(model.getValueAt(selectedrows, 8).toString());
        EMcoatxt.setText(model.getValueAt(selectedrows, 9).toString());
        jTextField3.setText(model.getValueAt(selectedrows, 10).toString());
        jTextField8.setText(model.getValueAt(selectedrows, 11).toString());
        jTextField11.setText(model.getValueAt(selectedrows, 12).toString());
        jTextField12.setText(model.getValueAt(selectedrows, 13).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String name = jTable1.getValueAt(row,1).toString();
        
        String stmt = "delete from studentinfo where StudentName = ?";
        try {
            PreparedStatement s = con.prepareStatement(stmt);
            s.setString(1, name);
            s.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Deleted");
            s.close();
            
            String stmt1 = "delete from studentgrades where StudentName = ?";
            PreparedStatement s1 = con.prepareStatement(stmt1);
            s1.setString(1, name);
            s1.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Deleted");
            s.close();
            
            jButton3.doClick();
            jButton6.doClick();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButton6.doClick();
    }//GEN-LAST:event_formWindowOpened

    public JButton getButton()
    {
        return jButton2;
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
            java.util.logging.Logger.getLogger(StudentsGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMcntxt;
    private javax.swing.JTextField EMcoatxt;
    private javax.swing.JTextField EMooptxt;
    private javax.swing.JTextField EMpytxt;
    private javax.swing.JTextField IMcntxt;
    private javax.swing.JTextField IMcoatxt;
    private javax.swing.JTextField IMooptxt;
    private javax.swing.JTextField IMpytxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jlCnEm;
    private javax.swing.JLabel jlCnIm;
    private javax.swing.JLabel jlCoaEm;
    private javax.swing.JLabel jlCoaIm;
    private javax.swing.JLabel jlOopIm;
    private javax.swing.JLabel jlOppEm;
    private javax.swing.JLabel jlPyEm;
    private javax.swing.JLabel jlPyIm;
    // End of variables declaration//GEN-END:variables
}
