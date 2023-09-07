
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;

public class MainJFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
    public MyHashTable theHT;
    
    
    // CONSTRUCTORS
  
    public MainJFrame() {
        initComponents();
        
        
        theHT = new MyHashTable(10);
        theHT.addFromFile();
        jPanel1.setVisible(false);
        jTableEmpNum.setVisible(false);
        
    }
    
        
    // METHODS   
    
    public MyHashTable getTheHT() {
        return theHT;
    }   

    private DefaultTableModel model;
    
   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpNum = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDefaultEmp = new javax.swing.JButton();
        jDisplayList = new javax.swing.JButton();
        jEmpInfo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRemoveAnEmp = new javax.swing.JButton();
        JAddNewEmp = new javax.swing.JButton();
        jEditAnEmp = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelEmpNum = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldEmpNum = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        JButtonAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonRemove = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jLabelUserMsg = new javax.swing.JLabel();
        jButtonUpdateEmp = new javax.swing.JButton();
        jComboBoxSelectEmployeeType = new javax.swing.JComboBox<>();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldGender = new javax.swing.JTextField();
        jLabelWorkLoc = new javax.swing.JLabel();
        jTextFieldWorkLoc = new javax.swing.JTextField();
        jLabelDeductRate = new javax.swing.JLabel();
        jTextFieldDeductRate = new javax.swing.JTextField();
        jLabelYearlySalary = new javax.swing.JLabel();
        jTextFieldYearlySalary = new javax.swing.JTextField();
        jLabelHourlyWage = new javax.swing.JLabel();
        jTextFieldHourlyWage = new javax.swing.JTextField();
        jLabelHoursPerWeek = new javax.swing.JLabel();
        jTextFieldHoursPerWeek = new javax.swing.JTextField();
        jLabelWeeksPerYear = new javax.swing.JLabel();
        jTextFieldWeeksPerYear = new javax.swing.JTextField();
        jButtonSearch1 = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jTableEmpNum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpNum);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Libian SC", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Management System");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jDefaultEmp.setText("Create Three RANDOM Employees");
        jDefaultEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultEmpActionPerformed(evt);
            }
        });

        jDisplayList.setText("Display The Current List Of Employees");
        jDisplayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayListActionPerformed(evt);
            }
        });

        jEmpInfo.setText("Employee Info");
        jEmpInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmpInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDisplayList, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jDefaultEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDefaultEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDisplayList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmpInfo)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jRemoveAnEmp.setText("Remove An Employee");
        jRemoveAnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicked_jRemoveAnEmp(evt);
            }
        });

        JAddNewEmp.setText("Add New Employee");
        JAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressed_JAddNewEmp(evt);
            }
        });

        jEditAnEmp.setText("Edit An Employee");
        jEditAnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditAnEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEditAnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JAddNewEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRemoveAnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRemoveAnEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JAddNewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditAnEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelEmpNum.setText("Employee Number");

        jLabelFirstName.setText("First Name");

        jLabelLastName.setText("Last Name");

        jTextFieldEmpNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpNumActionPerformed(evt);
            }
        });

        JButtonAdd.setText("Add");
        JButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelUserMsg.setText("jLabel5");

        jButtonUpdateEmp.setText("Update");
        jButtonUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateEmpActionPerformed(evt);
            }
        });

        jComboBoxSelectEmployeeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee Type", "Part Time", "Full Time" }));
        jComboBoxSelectEmployeeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectEmployeeTypeActionPerformed(evt);
            }
        });

        jLabelGender.setText("Gender");

        jLabelWorkLoc.setText("Work Location");

        jLabelDeductRate.setText("Deduct Rate");

        jTextFieldDeductRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDeductRateActionPerformed(evt);
            }
        });

        jLabelYearlySalary.setText("Yearly Salary");

        jLabelHourlyWage.setText("Hourly Wage");

        jLabelHoursPerWeek.setText("Hours Per Week");

        jLabelWeeksPerYear.setText("Weeks Per Year");

        jButtonSearch1.setText("Search");
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemove)
                            .addComponent(JButtonAdd)
                            .addComponent(jButtonSearch)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonUpdateEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSearch1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLastName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldLastName)
                                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEmpNum)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelWorkLoc)
                                    .addComponent(jLabelDeductRate)
                                    .addComponent(jLabelYearlySalary)
                                    .addComponent(jLabelHourlyWage)
                                    .addComponent(jLabelHoursPerWeek)
                                    .addComponent(jLabelWeeksPerYear))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldDeductRate)
                                        .addComponent(jTextFieldYearlySalary)
                                        .addComponent(jTextFieldHourlyWage)
                                        .addComponent(jTextFieldHoursPerWeek)
                                        .addComponent(jTextFieldWorkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSelectEmployeeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelUserMsg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxSelectEmployeeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemove)
                    .addComponent(jLabelEmpNum)
                    .addComponent(jTextFieldEmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAdd)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWorkLoc)
                    .addComponent(jTextFieldWorkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdateEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonClose))
                    .addComponent(jLabelDeductRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelYearlySalary)
                    .addComponent(jTextFieldYearlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHourlyWage)
                    .addComponent(jTextFieldHourlyWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoursPerWeek)
                    .addComponent(jTextFieldHoursPerWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWeeksPerYear)
                    .addComponent(jTextFieldWeeksPerYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDefaultEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultEmpActionPerformed
        // Adding random employees
        
        
        jTableEmpNum.setVisible(false);
        jLabelGender.setVisible(false);
        jTextFieldGender.setVisible(false);
        jLabelWorkLoc.setVisible(false);
        jTextFieldWorkLoc.setVisible(false);
        jLabelDeductRate.setVisible(false);
        jTextFieldDeductRate.setVisible(false);
        jComboBoxSelectEmployeeType.setVisible(false);
        jLabelYearlySalary.setVisible(false);
        jTextFieldYearlySalary.setVisible(false);
        jLabelHourlyWage.setVisible(false);
        jTextFieldHourlyWage.setVisible(false);
        jLabelHoursPerWeek.setVisible(false);
        jTextFieldHoursPerWeek.setVisible(false);
        jLabelWeeksPerYear.setVisible(false);
        jTextFieldWeeksPerYear.setVisible(false);
       
        FTE theFTE;
        PTE thePTE;
        
        thePTE = new PTE(111111, "Elmer", "Fudd", "Male", "Poland", 0.20, 15.0, 20.0, 40.0);
        theHT.addEmployee(thePTE);
        System.out.println("Added the FTE to the hash table!");
                
        thePTE = new PTE(222222, "Daffy", "Duck", "Male", "Cape Town", 0.20, 15.0, 20.0, 40.0);
        theHT.addEmployee(thePTE);
        System.out.println("Added the PTE to the hash table!");
                
        theFTE = new FTE(333333, "Lola", "Bunny", "Female", "New York", 0.20, 90000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");
        
        jLabelUserMsg.setText("Added 3 Employees to the Hash Table");
        jLabelUserMsg.setVisible(true);
        
        jTableEmpNum.setVisible(false);
        jPanel1.setVisible(true);
        JButtonAdd.setVisible(false);
        jLabelFirstName.setVisible(false);
        jLabelLastName.setVisible(false);
        jTextFieldFirstName.setVisible(false);
        jTextFieldLastName.setVisible(false);
        jButtonRemove.setVisible(false);
        jButtonSearch.setVisible(false);
        jButtonClose.setVisible(false);
        jLabelEmpNum.setVisible(false);
        jTextFieldEmpNum.setVisible(false);
        jButtonUpdateEmp.setVisible(false);

    }//GEN-LAST:event_jDefaultEmpActionPerformed

    private void jDisplayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayListActionPerformed
        // Display Employees:
        
        jLabelUserMsg.setVisible(false);
        jPanel1.setVisible(false);
        jTableEmpNum.setVisible(true);
        int numInHT = theHT.getNumInHashTable();
        
        model = new DefaultTableModel(new Object[] {"Work Status",
                                                    "Employee Number",
                                                    "First Name",
                                                    "Last Name",
                                                    "Gender",
                                                    "Work Location"},
                                                    numInHT);
        jTableEmpNum.setModel(model);
        jTableEmpNum.setAutoCreateColumnsFromModel(true);
            
        int empCounter = -1;
        
        System.out.println("");
        System.out.println("Number of employees in the HT is " + numInHT);
        
        if (numInHT > 0) {
            System.out.println("Here are the employees:");
            for (int i = 0; i < theHT.buckets.length; i++) {
                for (int j = 0; j < theHT.buckets[i].size(); j++) {
                    
                    EmployeeInfo theEmp = theHT.buckets[i].get(j);
                    
                    empCounter++;
                    
           
                    System.out.println("  Employee number " + Integer.toString(theEmp.getEmpNum()));
                    System.out.println("  First name, last name : " + theEmp.getFirstName() + " " + theEmp.getLastName());

          
                                    
                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        
                        
                        model.setValueAt("Full Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);
                        model.setValueAt(theEmp.getGender(), empCounter, 4);
                        model.setValueAt(theEmp.getWorkLoc(), empCounter, 5);
                    }
                    
                    if (theEmp instanceof PTE) {
                        PTE thePTE = (PTE) theEmp;
                       
                        
                        model.setValueAt("Part Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);
                        model.setValueAt(theEmp.getGender(), empCounter, 4);
                        model.setValueAt(theEmp.getWorkLoc(), empCounter, 5);

                   }
                }
            
            }           
        }
        

        else {
            System.out.println("Nothing in the Hash Table.");
        }
        
              
        
    }

    private void pressed_JAddNewEmp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressed_JAddNewEmp
        // Add Employee Panel:
        jTableEmpNum.setVisible(true);
        jPanel1.setVisible(true);
        JButtonAdd.setVisible(true);
        jLabelFirstName.setVisible(true);
        jLabelLastName.setVisible(true);
        jTextFieldFirstName.setVisible(true);
        jTextFieldLastName.setVisible(true);
        jButtonRemove.setVisible(false);
        jButtonSearch.setVisible(false);
        jLabelUserMsg.setVisible(false);
        jLabelEmpNum.setVisible(true);
        jTextFieldEmpNum.setVisible(true);
        jButtonClose.setVisible(true);
        jButtonUpdateEmp.setVisible(false);
        jComboBoxSelectEmployeeType.setVisible(true);
        jTableEmpNum.setVisible(true);
        jLabelGender.setVisible(true);
        jTextFieldGender.setVisible(true);
        jLabelWorkLoc.setVisible(true);
        jTextFieldWorkLoc.setVisible(true);
        jLabelDeductRate.setVisible(true);
        jTextFieldDeductRate.setVisible(true);
        jLabelYearlySalary.setVisible(false);
        jTextFieldYearlySalary.setVisible(false);
        jLabelHourlyWage.setVisible(false);
        jTextFieldHourlyWage.setVisible(false);
        jLabelHoursPerWeek.setVisible(false);
        jTextFieldHoursPerWeek.setVisible(false);
        jLabelWeeksPerYear.setVisible(false);
        jTextFieldWeeksPerYear.setVisible(false);
    }//GEN-LAST:event_pressed_JAddNewEmp

    private void clicked_jRemoveAnEmp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicked_jRemoveAnEmp
        // Remove Employee Panel:
        
     
        jPanel1.setVisible(true);
        jTableEmpNum.setVisible(true);
        JButtonAdd.setVisible(false);
        jLabelFirstName.setVisible(false);
        jLabelLastName.setVisible(false);
        jTextFieldFirstName.setVisible(false);
        jTextFieldLastName.setVisible(false);
        jTextFieldEmpNum.setVisible(true);
        jButtonRemove.setVisible(true);
        jButtonSearch.setVisible(false);
        jLabelUserMsg.setVisible(false);
        jLabelEmpNum.setVisible(true);
        jButtonClose.setVisible(true);
        jButtonUpdateEmp.setVisible(false);
        
        
        jLabelYearlySalary.setVisible(false);
        jTextFieldYearlySalary.setVisible(false);
        jLabelHourlyWage.setVisible(false);
        jTextFieldHourlyWage.setVisible(false);
        jLabelHoursPerWeek.setVisible(false);
        jTextFieldHoursPerWeek.setVisible(false);
        jLabelWeeksPerYear.setVisible(false);
        jTextFieldWeeksPerYear.setVisible(false);
        jComboBoxSelectEmployeeType.setVisible(false);
        jButtonSearch1.setVisible(false);
        jLabelGender.setVisible(false);
        jTextFieldGender.setVisible(false);
        jLabelWorkLoc.setVisible(false);
        jTextFieldWorkLoc.setVisible(false);
        jLabelDeductRate.setVisible(false);
        jTextFieldDeductRate.setVisible(false);
        
        
        
    }//GEN-LAST:event_clicked_jRemoveAnEmp

    private void jEditAnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditAnEmpActionPerformed
        // Edit Employee:
        
        
        jLabelGender.setVisible(false);
        jTextFieldGender.setVisible(false);
        jLabelWorkLoc.setVisible(false);
        jTextFieldWorkLoc.setVisible(false);
        jLabelDeductRate.setVisible(false);
        jTextFieldDeductRate.setVisible(false);
        jComboBoxSelectEmployeeType.setVisible(false);
        jPanel1.setVisible(true);
        jTableEmpNum.setVisible(true);
        JButtonAdd.setVisible(false);
        jLabelFirstName.setVisible(false);
        jLabelLastName.setVisible(false);
        jTextFieldFirstName.setVisible(false);
        jTextFieldLastName.setVisible(false);
        jTextFieldEmpNum.setVisible(true);
        jButtonRemove.setVisible(false);
        jButtonSearch1.setVisible(true);
        jLabelEmpNum.setVisible(true);
        jButtonClose.setVisible(true);
        jButtonUpdateEmp.setVisible(false);
        jButtonSearch.setVisible(false);
        
        
        jLabelYearlySalary.setVisible(false);
        jTextFieldYearlySalary.setVisible(false);
        jLabelHourlyWage.setVisible(false);
        jTextFieldHourlyWage.setVisible(false);
        jLabelHoursPerWeek.setVisible(false);
        jTextFieldHoursPerWeek.setVisible(false);
        jLabelWeeksPerYear.setVisible(false);
        jTextFieldWeeksPerYear.setVisible(false);
        jButtonSearch.setVisible(false);
       
        
        
        jLabelUserMsg.setText("Please input the employee's number that you wish to change: ");
        jLabelUserMsg.setVisible(true);
        
        
       
        

        
        
    
        
    }//GEN-LAST:event_jEditAnEmpActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        try{
            FileWriter inputFile = new FileWriter("EMS1.txt", false);
            inputFile.write("");
            inputFile.flush();
            inputFile.close();
            FileWriter datatoadd = new FileWriter("EMS1.txt", true);
            for (int i = 0; i < theHT.buckets.length; i++) {
                for (int j = 0; j < theHT.buckets[i].size(); j++) {
                    EmployeeInfo theEmp = theHT.buckets[i].get(j);
                    datatoadd.write(Integer.toString(theEmp.getEmpNum())+",");
                    datatoadd.write(theEmp.getFirstName()+",");
                    datatoadd.write(theEmp.getLastName()+",");
                    datatoadd.write(theEmp.getGender()+",");
                    datatoadd.write(theEmp.getWorkLoc()+",");
                    datatoadd.write(theEmp.getDeductRate()+",");
                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        datatoadd.write(Double.toString(theFTE.getYearlySalary())+",");
                        datatoadd.write(Double.toString(theFTE.calcAnnualNetIncome())+"\n");
                        
                    }
                    
                    if (theEmp instanceof PTE) {
                    PTE thePTE = (PTE) theEmp;
                    datatoadd.write(Double.toString(thePTE.hourlyWage)+",");
                    datatoadd.write(Double.toString(thePTE.hoursPerWeek)+",");
                    datatoadd.write(Double.toString(thePTE.weeksPerYear)+"\n");
                    
                    
                    }
                    System.out.println("Successfully added");
                    
                
                }
                
            }
            datatoadd.flush();
            datatoadd.close();
            
        }catch(Exception E){
            E.printStackTrace();
        }
        
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jEmpInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpInfoActionPerformed


        
        jTableEmpNum.setVisible(true);
        jPanel1.setVisible(true);
        JButtonAdd.setVisible(false);
        jButtonRemove.setVisible(false);
        jButtonSearch.setVisible(true);
        jLabelFirstName.setVisible(false);
        jLabelLastName.setVisible(false);
        jLabelEmpNum.setVisible(true);
        jTextFieldFirstName.setVisible(false);
        jTextFieldEmpNum.setVisible(true);
        jTextFieldLastName.setVisible(false);
        jButtonUpdateEmp.setVisible(false);
        jLabelUserMsg.setVisible(false);
        jComboBoxSelectEmployeeType.setVisible(false);
        jLabelGender.setVisible(false);
        jTextFieldGender.setVisible(false);
        jLabelWorkLoc.setVisible(false);
        jTextFieldWorkLoc.setVisible(false);
        jLabelDeductRate.setVisible(false);
        jTextFieldDeductRate.setVisible(false);
        jLabelYearlySalary.setVisible(false);
        jTextFieldYearlySalary.setVisible(false);
        jLabelHourlyWage.setVisible(false);
        jTextFieldHourlyWage.setVisible(false);
        jLabelHoursPerWeek.setVisible(false);
        jTextFieldHoursPerWeek.setVisible(false);
        jLabelWeeksPerYear.setVisible(false);
        jTextFieldWeeksPerYear.setVisible(false);
        jButtonSearch1.setVisible(false);
     
        
        
    
        
    }//GEN-LAST:event_jEmpInfoActionPerformed

    private void jButtonUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateEmpActionPerformed
        // TODO add your handling code here:
        
        jTableEmpNum.setVisible(true);
        

        try {
            if (jTextFieldEmpNum.getText().isEmpty()){
                jLabelUserMsg.setText("No such employee exists, please check your number.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                theHT.removeEmployee(theEmpNum);
                jLabelUserMsg.setText("Succesfully removed employee number " + jTextFieldEmpNum.getText() + ".");
                jLabelUserMsg.setVisible(true);
            }
        }
        catch(Exception e){
            jLabelUserMsg.setText("No such employee exists, please check your number.");
            jLabelUserMsg.setVisible(true);
            return;
        }
        
        try {
            if (jTextFieldEmpNum.getText().isEmpty()){
                jLabelUserMsg.setText("Cannot add an employee with number ." + jTextFieldEmpNum.getText() + ". Please try again.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                String theFirstName = jTextFieldFirstName.getText();
                String theLastName = jTextFieldLastName.getText();
                String theGender = jTextFieldGender.getText();
                String theWorkLoc = jTextFieldWorkLoc.getText();
               
                double theDeductRate = Double.parseDouble(jTextFieldDeductRate.getText());
                
                if (jComboBoxSelectEmployeeType.getSelectedItem()=="Full Time"){
                    double theYearlySalary = Double.parseDouble(jTextFieldYearlySalary.getText());
                    FTE theFTE = new FTE(theEmpNum, theFirstName, theLastName, theGender, theWorkLoc, theDeductRate, theYearlySalary);
                    theHT.addEmployee(theFTE);
                }
                if (jComboBoxSelectEmployeeType.getSelectedItem()=="Part Time"){
                    double theHourlyWage = Double.parseDouble(jTextFieldHourlyWage.getText());
                    double theHoursPerWeek = Double.parseDouble(jTextFieldHoursPerWeek.getText());
                    double theWeeksPerYear = Double.parseDouble(jTextFieldWeeksPerYear.getText());
                    PTE thePTE = new PTE(theEmpNum, theFirstName, theLastName, theGender, theWorkLoc, theDeductRate, theHourlyWage, theHoursPerWeek, theWeeksPerYear);
                    theHT.addEmployee(thePTE);
                }


                jLabelUserMsg.setText("Added new employee:  " + jTextFieldEmpNum.getText() + ", "
                    + theFirstName + " " + theLastName + ".");
                jLabelUserMsg.setVisible(true);

                jTextFieldEmpNum.setText("");
                jTextFieldFirstName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldGender.setText("");
                jTextFieldWorkLoc.setText("");
                jTextFieldDeductRate.setText("");
                jTextFieldYearlySalary.setText("");
                jTextFieldHourlyWage.setText("");
                jTextFieldHoursPerWeek.setText("");
                jTextFieldWeeksPerYear.setText("");
            }
        }
        catch(Exception e){
            jLabelUserMsg.setText("Cannot add an employee with number ." + jTextFieldEmpNum.getText() + ". Please try again.");
            jLabelUserMsg.setVisible(true);
            return;
        }
        
        
    }//GEN-LAST:event_jButtonUpdateEmpActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        jTableEmpNum.setVisible(true);
        
 

        try {
            if (jTextFieldEmpNum.getText().equals("")){
                jLabelUserMsg.setText("This person does not exist. Please try again.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                int employeePosition = theHT.searchByEmployeeNumber(theEmpNum);
                int employeeBucket = theEmpNum % theHT.buckets.length;
                if (theHT.buckets[employeeBucket].get(employeePosition) instanceof FTE){
                    FTE emp = (FTE) theHT.buckets[employeeBucket].get(employeePosition);
                    jLabelUserMsg.setText("Employee number: |" + emp.getEmpNum() + "| Belongs to: |" + emp.getFirstName() + " " + emp.getLastName() + "| Gender: |" + emp.getGender() +"| Work Location: |" + emp.getWorkLoc() + "| Deduction Rate: |" +emp.getDeductRate() + "| Yearly Salary: |" +Double.toString(emp.getYearlySalary()) + "| ");
                    jLabelUserMsg.setVisible(true);
                }
                if (theHT.buckets[employeeBucket].get(employeePosition) instanceof PTE){
                    PTE emp = (PTE) theHT.buckets[employeeBucket].get(employeePosition);
                    jLabelUserMsg.setText("Employee number: |" + emp.getEmpNum() + "| Belongs to: |" + emp.getFirstName() + " " + emp.getLastName() + "| Gender: |" + emp.getGender() + "| Work Location: |" +emp.getWorkLoc() + "| Deduction Rate: |" +emp.getDeductRate() + "| Hourly Wage: |" +emp.getHourlyWage() + "| Hours/Week |" +emp.getHoursPerWeek() + "| Weeks/Year |" +emp.getWeeksPerYear() + "| ");
                    jLabelUserMsg.setVisible(true);
                }
            }
        }
        catch(Exception e){
            return;
        }
        
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // Remove Employee:

        jTableEmpNum.setVisible(true);
        

        try {
            if (jTextFieldEmpNum.getText().isEmpty()){
                jLabelUserMsg.setText("No such employee exists, please check your number.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                theHT.removeEmployee(theEmpNum);
                jLabelUserMsg.setText("Succesfully removed employee number " + jTextFieldEmpNum.getText() + ".");
                jLabelUserMsg.setVisible(true);
            }
        }
        catch(Exception e){
            jLabelUserMsg.setText("No such employee exists, please check your number.");
            jLabelUserMsg.setVisible(true);
            return;
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // Close Panel:
        jPanel1.setVisible(false);
        jTableEmpNum.setVisible(true);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void JButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddActionPerformed
        // TODO add your handling code here:
        
        
        
        
        try {
            if (jTextFieldEmpNum.getText().isEmpty()){
                jLabelUserMsg.setText("Cannot add an employee with number ." + jTextFieldEmpNum.getText() + ". Please try again.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                String theFirstName = jTextFieldFirstName.getText();
                String theLastName = jTextFieldLastName.getText();
                String theGender = jTextFieldGender.getText();
                String theWorkLoc = jTextFieldWorkLoc.getText();
               
                double theDeductRate = Double.parseDouble(jTextFieldDeductRate.getText());
                
                if (jComboBoxSelectEmployeeType.getSelectedItem()=="Full Time"){
                    double theYearlySalary = Double.parseDouble(jTextFieldYearlySalary.getText());
                    FTE theFTE = new FTE(theEmpNum, theFirstName, theLastName, theGender, theWorkLoc, theDeductRate, theYearlySalary);
                    theHT.addEmployee(theFTE);
                }
                if (jComboBoxSelectEmployeeType.getSelectedItem()=="Part Time"){
                    double theHourlyWage = Double.parseDouble(jTextFieldHourlyWage.getText());
                    double theHoursPerWeek = Double.parseDouble(jTextFieldHoursPerWeek.getText());
                    double theWeeksPerYear = Double.parseDouble(jTextFieldWeeksPerYear.getText());
                    PTE thePTE = new PTE(theEmpNum, theFirstName, theLastName, theGender, theWorkLoc, theDeductRate, theHourlyWage, theHoursPerWeek, theWeeksPerYear);
                    theHT.addEmployee(thePTE);
                }


                jLabelUserMsg.setText("Added new employee:  " + jTextFieldEmpNum.getText() + ", "
                    + theFirstName + " " + theLastName + ".");
                jLabelUserMsg.setVisible(true);

                jTextFieldEmpNum.setText("");
                jTextFieldFirstName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldGender.setText("");
                jTextFieldWorkLoc.setText("");
                jTextFieldDeductRate.setText("");
                jTextFieldYearlySalary.setText("");
                jTextFieldHourlyWage.setText("");
                jTextFieldHoursPerWeek.setText("");
                jTextFieldWeeksPerYear.setText("");
                
            }
        }
        catch(Exception e){
            jLabelUserMsg.setText("Cannot add an employee with number ." + jTextFieldEmpNum.getText() + ". Please try again.");
            jLabelUserMsg.setVisible(true);
            return;
        }
    }//GEN-LAST:event_JButtonAddActionPerformed

    private void jTextFieldEmpNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpNumActionPerformed
        // TODO add your handling code here:

        jTableEmpNum.setVisible(true);
        jPanel1.setVisible(true);
        JButtonAdd.setVisible(false);
        jButtonRemove.setVisible(false);
        jLabelFirstName.setVisible(false);
        jLabelLastName.setVisible(false);
        jLabelEmpNum.setVisible(true);
        jTextFieldFirstName.setVisible(false);
        jTextFieldEmpNum.setVisible(true);  
        jTextFieldLastName.setVisible(false);
        jLabelUserMsg.setVisible(false);
        jButtonUpdateEmp.setVisible(false);
    }//GEN-LAST:event_jTextFieldEmpNumActionPerformed

    private void jTextFieldDeductRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDeductRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDeductRateActionPerformed

    private void jComboBoxSelectEmployeeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectEmployeeTypeActionPerformed
        // TODO add your handling code here:
        
        
        if (jComboBoxSelectEmployeeType.getSelectedItem()=="Part Time"){
            jLabelYearlySalary.setVisible(false);
            jTextFieldYearlySalary.setVisible(false);
            jLabelHourlyWage.setVisible(true);
            jTextFieldHourlyWage.setVisible(true);
            jLabelHoursPerWeek.setVisible(true);
            jTextFieldHoursPerWeek.setVisible(true);
            jLabelWeeksPerYear.setVisible(true);
            jTextFieldWeeksPerYear.setVisible(true);
        }
        if (jComboBoxSelectEmployeeType.getSelectedItem()=="Full Time"){
            jLabelYearlySalary.setVisible(true);
            jTextFieldYearlySalary.setVisible(true);
            jLabelHourlyWage.setVisible(false);
            jTextFieldHourlyWage.setVisible(false);
            jLabelHoursPerWeek.setVisible(false);
            jTextFieldHoursPerWeek.setVisible(false);
            jLabelWeeksPerYear.setVisible(false);
            jTextFieldWeeksPerYear.setVisible(false);
        }
        if (jComboBoxSelectEmployeeType.getSelectedItem()=="Select Employee Type"){
            jLabelYearlySalary.setVisible(false);
            jTextFieldYearlySalary.setVisible(false);
            jLabelHourlyWage.setVisible(false);
            jTextFieldHourlyWage.setVisible(false);
            jLabelHoursPerWeek.setVisible(false);
            jTextFieldHoursPerWeek.setVisible(false);
            jLabelWeeksPerYear.setVisible(false);
            jTextFieldWeeksPerYear.setVisible(false);
        }
        
    }//GEN-LAST:event_jComboBoxSelectEmployeeTypeActionPerformed

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        // TODO add your handling code here:
        jTableEmpNum.setVisible(true);
        jButtonSearch1.setVisible(true);
        
 

        try {
            if (jTextFieldEmpNum.getText().equals("")){
                jLabelUserMsg.setText("This person does not exist. Please try again.");
                jLabelUserMsg.setVisible(true);
                return;
            }
            else {
                
                int theEmpNum = Integer.parseInt(jTextFieldEmpNum.getText());
                int employeePosition = theHT.searchByEmployeeNumber(theEmpNum);
                int employeeBucket = theEmpNum % theHT.buckets.length;
                if (theHT.buckets[employeeBucket].get(employeePosition) instanceof FTE){
                    FTE emp = (FTE) theHT.buckets[employeeBucket].get(employeePosition);
                    jTextFieldFirstName.setText(emp.getFirstName());
                    jTextFieldLastName.setText(emp.getLastName());
                    jTextFieldGender.setText(emp.getGender());
                    jTextFieldWorkLoc.setText(emp.getWorkLoc());
                    jTextFieldDeductRate.setText(Double.toString(emp.getDeductRate()));
                    jTextFieldYearlySalary.setText(Double.toString(emp.getYearlySalary()));
                    
                    jLabelGender.setVisible(true);
                    jTextFieldGender.setVisible(true);
                    jLabelWorkLoc.setVisible(true);
                    jTextFieldWorkLoc.setVisible(true);
                    jLabelDeductRate.setVisible(true);
                    jTextFieldDeductRate.setVisible(true);
                    jComboBoxSelectEmployeeType.setVisible(true);

          
          
                    jLabelFirstName.setVisible(true);
                    jLabelLastName.setVisible(true);
                    jTextFieldFirstName.setVisible(true);
                    jTextFieldLastName.setVisible(true);
                    jTextFieldEmpNum.setVisible(true);
                   

                    jLabelEmpNum.setVisible(true);
                    jButtonClose.setVisible(true);
                    jButtonUpdateEmp.setVisible(true);
                  


                    jLabelYearlySalary.setVisible(true);
                    jTextFieldYearlySalary.setVisible(true);
                    jComboBoxSelectEmployeeType.setSelectedItem("Full Time");
                    
  
                
                    
                    
                }
                if (theHT.buckets[employeeBucket].get(employeePosition) instanceof PTE){
                    PTE emp = (PTE) theHT.buckets[employeeBucket].get(employeePosition);
                    jTextFieldFirstName.setText(emp.getFirstName());
                    jTextFieldLastName.setText(emp.getLastName());
                    jTextFieldGender.setText(emp.getGender());
                    jTextFieldWorkLoc.setText(emp.getWorkLoc());
                    jTextFieldDeductRate.setText(Double.toString(emp.getDeductRate()));
                    jTextFieldHourlyWage.setText(Double.toString(emp.getHourlyWage()));
                    jTextFieldHoursPerWeek.setText(Double.toString(emp.getHoursPerWeek()));
                    jTextFieldWeeksPerYear.setText(Double.toString(emp.getWeeksPerYear()));
                    
                    jLabelGender.setVisible(true);
                    jTextFieldGender.setVisible(true);
                    jLabelWorkLoc.setVisible(true);
                    jTextFieldWorkLoc.setVisible(true);
                    jLabelDeductRate.setVisible(true);
                    jTextFieldDeductRate.setVisible(true);
                    jComboBoxSelectEmployeeType.setVisible(true);

          
          
                    jLabelFirstName.setVisible(true);
                    jLabelLastName.setVisible(true);
                    jTextFieldFirstName.setVisible(true);
                    jTextFieldLastName.setVisible(true);
                    jTextFieldEmpNum.setVisible(true);
                   

                    jLabelEmpNum.setVisible(true);
                    jButtonClose.setVisible(true);
                    jButtonUpdateEmp.setVisible(true);
                  


                    
                    jLabelHourlyWage.setVisible(true);
                    jTextFieldHourlyWage.setVisible(true);
                    jLabelHoursPerWeek.setVisible(true);
                    jTextFieldHoursPerWeek.setVisible(true);
                    jLabelWeeksPerYear.setVisible(true);
                    jTextFieldWeeksPerYear.setVisible(true);
                    
                    jComboBoxSelectEmployeeType.setSelectedItem("Part Time");
                    
                }
            }
        }
        catch(Exception e){
            return;
        }
        
        
        
    }//GEN-LAST:event_jButtonSearch1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JAddNewEmp;
    private javax.swing.JButton JButtonAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JButton jButtonUpdateEmp;
    private javax.swing.JComboBox<String> jComboBoxSelectEmployeeType;
    private javax.swing.JButton jDefaultEmp;
    private javax.swing.JButton jDisplayList;
    private javax.swing.JButton jEditAnEmp;
    private javax.swing.JButton jEmpInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDeductRate;
    private javax.swing.JLabel jLabelEmpNum;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHourlyWage;
    private javax.swing.JLabel jLabelHoursPerWeek;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelUserMsg;
    private javax.swing.JLabel jLabelWeeksPerYear;
    private javax.swing.JLabel jLabelWorkLoc;
    private javax.swing.JLabel jLabelYearlySalary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jRemoveAnEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpNum;
    private javax.swing.JTextField jTextFieldDeductRate;
    private javax.swing.JTextField jTextFieldEmpNum;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldHourlyWage;
    private javax.swing.JTextField jTextFieldHoursPerWeek;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldWeeksPerYear;
    private javax.swing.JTextField jTextFieldWorkLoc;
    private javax.swing.JTextField jTextFieldYearlySalary;
    // End of variables declaration//GEN-END:variables
}
