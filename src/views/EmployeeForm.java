package views;

import controller.EmployeeController;
import javax.swing.JOptionPane;
import model.Employee;
import util.ComponentUtil;

/**
 *
 * @author Cogent
 */
public class EmployeeForm extends javax.swing.JFrame {
    private Employee employee = new Employee();
    /**
     * Creates new form EmployeeForm
     */
    public EmployeeForm() {
        initComponents();
    }
    
    public EmployeeForm(int id) {
        initComponents();
        employee = EmployeeController.getById(id);
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertMsg = new javax.swing.JDialog();
        titlePane = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        meneBar = new javax.swing.JToolBar();
        menuPane = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        employeeListBtn = new javax.swing.JButton();
        formPane = new javax.swing.JPanel();
        nameInputPane = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        designationInputPane = new javax.swing.JPanel();
        designationLbl = new javax.swing.JLabel();
        designationTxt = new javax.swing.JTextField();
        deptPane = new javax.swing.JPanel();
        deptLbl = new javax.swing.JLabel();
        deptTxt = new javax.swing.JTextField();
        salaryPane = new javax.swing.JPanel();
        salaryLbl = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        formBtnPane = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();

        javax.swing.GroupLayout alertMsgLayout = new javax.swing.GroupLayout(alertMsg.getContentPane());
        alertMsg.getContentPane().setLayout(alertMsgLayout);
        alertMsgLayout.setHorizontalGroup(
            alertMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        alertMsgLayout.setVerticalGroup(
            alertMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLbl.setText("Employee Form");

        javax.swing.GroupLayout titlePaneLayout = new javax.swing.GroupLayout(titlePane);
        titlePane.setLayout(titlePaneLayout);
        titlePaneLayout.setHorizontalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePaneLayout.setVerticalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        meneBar.setRollover(true);

        homeBtn.setText("Home");
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        employeeListBtn.setText("View List");
        employeeListBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        employeeListBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        employeeListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPaneLayout = new javax.swing.GroupLayout(menuPane);
        menuPane.setLayout(menuPaneLayout);
        menuPaneLayout.setHorizontalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeListBtn)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        menuPaneLayout.setVerticalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeListBtn)
                    .addComponent(homeBtn))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        meneBar.add(menuPane);

        nameLbl.setText("Name : ");

        nameTxt.setToolTipText("Name of the employee");

        javax.swing.GroupLayout nameInputPaneLayout = new javax.swing.GroupLayout(nameInputPane);
        nameInputPane.setLayout(nameInputPaneLayout);
        nameInputPaneLayout.setHorizontalGroup(
            nameInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameInputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        nameInputPaneLayout.setVerticalGroup(
            nameInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameInputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nameInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        designationLbl.setText("Designation : ");

        designationTxt.setToolTipText("Name of the employee");

        javax.swing.GroupLayout designationInputPaneLayout = new javax.swing.GroupLayout(designationInputPane);
        designationInputPane.setLayout(designationInputPaneLayout);
        designationInputPaneLayout.setHorizontalGroup(
            designationInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designationInputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(designationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(designationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        designationInputPaneLayout.setVerticalGroup(
            designationInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designationInputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(designationInputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(designationLbl)
                    .addComponent(designationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deptLbl.setText("Department :");

        deptTxt.setToolTipText("Name of the employee");

        javax.swing.GroupLayout deptPaneLayout = new javax.swing.GroupLayout(deptPane);
        deptPane.setLayout(deptPaneLayout);
        deptPaneLayout.setHorizontalGroup(
            deptPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deptPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deptLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        deptPaneLayout.setVerticalGroup(
            deptPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deptPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deptPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptLbl)
                    .addComponent(deptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salaryLbl.setText("Salary");

        salaryTxt.setToolTipText("Name of the employee");

        javax.swing.GroupLayout salaryPaneLayout = new javax.swing.GroupLayout(salaryPane);
        salaryPane.setLayout(salaryPaneLayout);
        salaryPaneLayout.setHorizontalGroup(
            salaryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salaryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        salaryPaneLayout.setVerticalGroup(
            salaryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salaryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLbl)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formBtnPaneLayout = new javax.swing.GroupLayout(formBtnPane);
        formBtnPane.setLayout(formBtnPaneLayout);
        formBtnPaneLayout.setHorizontalGroup(
            formBtnPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBtnPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formBtnPaneLayout.setVerticalGroup(
            formBtnPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBtnPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formPaneLayout = new javax.swing.GroupLayout(formPane);
        formPane.setLayout(formPaneLayout);
        formPaneLayout.setHorizontalGroup(
            formPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameInputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(designationInputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salaryPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formBtnPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        formPaneLayout.setVerticalGroup(
            formPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameInputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(designationInputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deptPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formBtnPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meneBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meneBar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeListBtnActionPerformed
        ComponentUtil.swapComponents(this, new EmployeeList());
    }//GEN-LAST:event_employeeListBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        ComponentUtil.swapComponents(this, new Homepage());
    }//GEN-LAST:event_homeBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        employee.setName(nameTxt.getText());
        employee.setDesignation(designationTxt.getText());
        employee.setDepeartment(deptTxt.getText());
        try {
            String salaryStr = salaryTxt.getText();
            double salary = Double.parseDouble(salaryStr);
            employee.setSalary(salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = EmployeeController.saveData(employee);
        JOptionPane.showMessageDialog(this, result);
        resetForm();
    }//GEN-LAST:event_submitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog alertMsg;
    private javax.swing.JLabel deptLbl;
    private javax.swing.JPanel deptPane;
    private javax.swing.JTextField deptTxt;
    private javax.swing.JPanel designationInputPane;
    private javax.swing.JLabel designationLbl;
    private javax.swing.JTextField designationTxt;
    private javax.swing.JButton employeeListBtn;
    private javax.swing.JPanel formBtnPane;
    private javax.swing.JPanel formPane;
    private javax.swing.JButton homeBtn;
    private javax.swing.JToolBar meneBar;
    private javax.swing.JPanel menuPane;
    private javax.swing.JPanel nameInputPane;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JPanel salaryPane;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        nameTxt.setText(employee.getName());
        designationTxt.setText(employee.getDesignation());
        deptTxt.setText(employee.getDepeartment());
        salaryTxt.setText("" + employee.getSalary());
    }

    private void resetForm() {
        employee = new Employee();
        populateFields();
    }
}