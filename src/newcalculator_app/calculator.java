/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcalculator_app;

import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author baoma
 */
public class calculator extends javax.swing.JFrame {

    Double number1, number2, number;
    int operation;
    boolean isOverwrite = false;
    double num = 0.0, ans;
    String calculation = "";
    String labelDefault = "";
    double tempResult = 0.0;
    double firstNumber = 0;
    double secondNumber = 0;

    ArrayList<String> arraylist = new ArrayList<String>();

    /**
     * Creates new form calculator
     */
    private void clearFields() {
        if (isOverwrite == true) {
            jLabel1.setText("");
            jTextField1.setText("");
            isOverwrite = false;
        }

    }

    private void clearlabel() {
        System.out.println("isOverwrite " + isOverwrite);
        if (isOverwrite == true) {
            jLabel1.setText("");
            jTextField1.setText("");
            isOverwrite = false;
        }

    }

    DecimalFormat format = new DecimalFormat("0.###");

    public calculator() {
        initComponents();
        jRadioButton1.setEnabled(false); //ON button disable
    }

    public void arithmetic_operation() {  // equal function
        double hat = 0;
        double result = 0;

        if (isOverwrite == true) {
            System.out.println("Dung chuong trinh: ");
            jLabel1.setText("");
            jTextField1.setText("");
            return;
        }

        if (calculation.equals("^")) {
            try {
                hat = Double.parseDouble(jTextField1.getText());

            } catch (Exception e) {
                jLabel1.setText("");
                jTextField1.setText("Not Valid");
                return;
            }

            result = pow(firstNumber, hat);
            jLabel1.setText("");
            jTextField1.setText("" + result);

            isOverwrite = true;
            calculation = "";
            arraylist.removeAll(arraylist);

            System.out.println("arraylist la: " + arraylist);

            return;
        }

        // mod function 
        if (calculation.equals("mod")) {
            try {
                secondNumber = Double.parseDouble(jTextField1.getText());

            } catch (Exception e) {
                jLabel1.setText("");
                jTextField1.setText("Not Valid");
                return;
            }

            result = (firstNumber % secondNumber);
            jLabel1.setText("");
            jTextField1.setText("" + result);

            isOverwrite = true;
            calculation = "";
            arraylist.removeAll(arraylist);

            System.out.println("arraylist la: " + arraylist);

            return;
        }

        System.out.println("arraylist la: " + arraylist.toString());
        String operation = arraylist.toString().replace(",", "");
        operation = operation.replace("[", "");
        operation = operation.replace("]", "");
        operation = operation.replace(" ", "");

        System.out.println("opr la:" + operation);

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String str = jLabel1.getText();

        try {

            System.out.println("Ket qua la: " + engine.eval(str));

            jTextField1.setText("" + engine.eval(str));
            jLabel1.setText("");
            arraylist.removeAll(arraylist);
            isOverwrite = true;
            return;
        } catch (Exception e) {
            jLabel1.setText("");
            jTextField1.setText("Not Valid");

            isOverwrite = true;
            return;
        }

//        switch (calculation) {
//
//            case 5:
//                System.out.println("num" + num);
//                System.out.println("num" + Double.parseDouble(jTextField1.getText()));
//                ans = pow(num, Double.parseDouble(jTextField1.getText()));
//                jTextField1.setText(Double.toString(ans));
//                jLabel1.setText("");
//                isOverwrite = true;
//                break;
//
//            case 6:
//                int input;
//                long fact = 1;
//
//                if (jTextField1.getText().length() == 0) {
//                    System.out.println("hi");
//                    return;
//                }
//
//                try {
//                    input = Integer.parseInt(jTextField1.getText());
//                    System.out.println("success: " + input);
//                } catch (NumberFormatException ex) {
//                    System.out.println("Given String is not parsable to int");
//                    jTextField1.setText("");
//                    return;
//                }
//
//                if (input < 0) {
//                    System.out.println("khong hop le");
//                    jTextField1.setText("");
//                    return;
//                }
//
//                for (int i = 1; i <= input; i++) {
//                    fact = fact * i;
//                    System.out.println("fact = " + fact + " i bang " + i);
//                }
//
//                System.out.println(fact);
//                jTextField1.setText("" + fact);
//                jLabel1.setText("");
//                isOverwrite = true;
//                calculation = 0;
//                break;
//
//            default:
//                System.out.println("cai j cung dc");
//                jLabel1.setText("");
//                isOverwrite = true;
//                num = 0.0;
//                break;
//
//        }
    }

    @Override
    public void enable() {
        jTextField1.setEditable(true);

        jRadioButton1.setEnabled(false); // ON button disable
        jRadioButton2.setEnabled(true); // OFF button enable

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        jButton37.setEnabled(true);
        jButton38.setEnabled(true);
        jButton39.setEnabled(true);

    }

    @Override
    public void disable() {
        jTextField1.setEnabled(false);

        jRadioButton1.setEnabled(true); // ON button enable
        jRadioButton2.setEnabled(false); // OFF button disable

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton25.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton29.setEnabled(false);
        jButton30.setEnabled(false);
        jButton31.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton34.setEnabled(false);
        jButton35.setEnabled(false);
        jButton36.setEnabled(false);
        jButton37.setEnabled(false);
        jButton38.setEnabled(false);
        jButton39.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("mod");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Sin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Tan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Cos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Cot");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("??");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("x??");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("%");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("x!");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("|x|");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("e");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("x??");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton13.setText("???");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("sqrt");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("AC");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("e??");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("x??");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setText("cbrt");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setText("x?????");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setText("??");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton21.setText("ln");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setText("7");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setText("9");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("8");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("??");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton26.setText("Log");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("4");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setText("6");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setText("5");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("-");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton31.setText("Ans");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton32.setText("1");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton33.setText("3");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton34.setText("2");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton35.setText("+");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton36.setText("??");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton37.setText("0");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton38.setText("=");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton39.setText(".");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

//        num = Double.parseDouble(jTextField1.getText());
//        jTextField1.setText("");
        jLabel1.setText(jLabel1.getText() + "/100");
        arraylist.add("/100");

        System.out.println("arraylist la: " + arraylist);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "1");
        arraylist.add("1");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "1");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "2");
        arraylist.add("2");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "2");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "3");
        arraylist.add("3");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "3");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "4");
        arraylist.add("4");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "4");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        clearlabel();

        arraylist.add("5");
        System.out.println("ArrayList la: " + arraylist);

        jLabel1.setText(jLabel1.getText() + "5");
        jTextField1.setText(jTextField1.getText() + "5");

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "6");
        arraylist.add("6");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "6");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "7");
        arraylist.add("7");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "7");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "8");
        arraylist.add("8");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "8");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "9");
        arraylist.add("9");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "9");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        if (jLabel1.getText().length() <= 0) {
            jTextField1.setText("Not Valid");
            return;
        }

        String lastCharacter = jLabel1.getText().substring(jLabel1.getText().length() - 1);
        System.out.println("lastCharacter la: " + lastCharacter);

        if (lastCharacter.equals("+") || lastCharacter.equals("-") || lastCharacter.equals("*") || lastCharacter.equals("/")) {
            jTextField1.setText(jTextField1.getText() + "0.");
            jLabel1.setText(jLabel1.getText() + "0.");
            arraylist.add("0.");
        } else if (lastCharacter.equals("")) {
            jTextField1.setText("Not Valid");
            return;
        } else {
            jLabel1.setText(jLabel1.getText() + ".");
            jTextField1.setText(jTextField1.getText() + ".");
            arraylist.add(".");
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
//      jTextField1.setText(jTextField1.getText() + "+");

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }
//        num = Double.parseDouble(jTextField1.getText());

        jLabel1.setText(jLabel1.getText() + "+");
        arraylist.add("+");

        System.out.println("arraylist la: " + arraylist);
        try {
            tempResult = (double) tempResult + (double) Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            return;
        }

        jTextField1.setText("");

    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
//        jTextField1.setText(jTextField1.getText() + "-");

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        System.out.println("num " + num);
        jLabel1.setText(jLabel1.getText() + "-");
        arraylist.add("-");
        System.out.println("arraylist la: " + arraylist);

        jTextField1.setText("");

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
//        jTextField1.setText(jTextField1.getText() + "*");

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        System.out.println("num " + num);
        jLabel1.setText(jLabel1.getText() + "*");
        arraylist.add("*");
        System.out.println("arraylist la: " + arraylist);

        jTextField1.setText("");

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
//        jTextField1.setText(jTextField1.getText() + "/");

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        num = Double.parseDouble(jTextField1.getText());

        jTextField1.setText("");
        jLabel1.setText(jLabel1.getText() + "/");
        arraylist.add("/");

        System.out.println("arraylist la: " + arraylist);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        jLabel1.setText("");
        jTextField1.setText("");
        num = 0.0;

        arraylist.removeAll(arraylist);
        System.out.println("arraylist " + arraylist);
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        disable(); // call disable method
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable(); // call enable method
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;

        int lengthLabel = jLabel1.getText().length();
        int numberLabel = jLabel1.getText().length() - 1;

        System.out.println(jTextField1.getText());
        System.out.println("number la: " + number);
        System.out.println("Length la: " + lengthLabel);

        if (lengthLabel <= 0) {
            System.out.println("Dung chuong trinh ");
            return;
        }

        if (length > 0) {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            String store = back.toString();
            jTextField1.setText(store);
        }

        StringBuilder backLabel = new StringBuilder(jLabel1.getText());
        backLabel.deleteCharAt(numberLabel);
        String storeLabel = backLabel.toString();

        jLabel1.setText(storeLabel);

        int lastPosition = arraylist.size() - 1;
        arraylist.remove(lastPosition);

        System.out.println("arraylist la: " + arraylist);

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        clearlabel();

        jLabel1.setText(jLabel1.getText() + "0");
        arraylist.add("0");
        System.out.println("ArrayList la: " + arraylist);
        jTextField1.setText(jTextField1.getText() + "0");

        System.out.println("num va getText lan luot la: " + num + " " + jTextField1.getText());
        num = num + Double.parseDouble(jTextField1.getText());
        System.out.println("num " + num);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed

        if (jLabel1.getText().isEmpty()) {
            jLabel1.setText(jLabel1.getText() + jTextField1.getText() + "=");
        }
        arithmetic_operation();

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (jTextField1.getText().length() == 0) {
            return;
        }
        try {
            double value = Double.parseDouble(jTextField1.getText());
            value = -value;
            jTextField1.setText("" + value);
            jLabel1.setText("" + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        double number = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        number = Math.pow(number, 2);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        number = Math.pow(number, 3);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number == 0) {
            jLabel1.setText("");
            jTextField1.setText("Not valid");
            return;
        }

        number = Math.pow(number, -1);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            firstNumber = Double.parseDouble(jTextField1.getText());

        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        try {
            jLabel1.setText(jLabel1.getText() + "^");
        } catch (Exception e) {
            jLabel1.setText("");
            jTextField1.setText("Not valid");
            return;
        }

        jTextField1.setText("");

        calculation = "^";

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int input;
        long fact = 1;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        if (jTextField1.getText().length() == 0) {
            System.out.println("hi");
            return;
        }

        try {
            input = Integer.parseInt(jTextField1.getText());
            System.out.println("success: " + input);
        } catch (NumberFormatException ex) {
            System.out.println("Given String is not parsable to int");
            jTextField1.setText("");
            return;
        }

        if (input < 0) {
            System.out.println("khong hop le");
            jTextField1.setText("");
            return;
        }

        for (int i = 1; i <= input; i++) {
            fact = fact * i;
            System.out.println("fact = " + fact + " i bang " + i);
        }

        System.out.println(fact);
        jTextField1.setText("" + fact);
        jLabel1.setText("" + fact);
        isOverwrite = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number < 0) {
            jLabel1.setText("");
            jTextField1.setText("Not valid");
            return;
        }

        number = Math.pow(number, Math.pow(2, -1));

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        number = Math.pow(number, Math.pow(3, -1));

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % Math.PI == 0) {
            number = Math.sin(number);
        } else {
            number = Math.sin(Math.toRadians(number));
        }

        number = Math.round(number);
        System.out.println("number la:  " + number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);
        arraylist.removeAll(arraylist);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % Math.PI == 0) {
            number = Math.cos(number);
        } else {
            number = Math.cos(Math.toRadians(number));
        }

        number = Math.round(number);
        System.out.println("number la:  " + number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);
        arraylist.removeAll(arraylist);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        System.out.println("Number la: " + number);

        if (number == 90 || number == -90) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % 360 == 90 && number > 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % -360 == -90 && number < 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        // PI 
        if (number == (Math.PI / 2) || number == -(Math.PI / 2)) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % (2 * Math.PI) == (Math.PI / 2) && number > 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % -(2 * Math.PI) == -(Math.PI / 2) && number < 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        try {

            if (number % Math.PI == 0) {
                number = Math.tan(number);
            } else {
                number = Math.tan(Math.toRadians(number));
            }

            number = Double.parseDouble("" + number);
            System.out.println("number 1469 la: " + number);
            number = Math.round(number);

        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double number = 0;
        double sin = 1;
        double cos = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        System.out.println("Number la: " + number);

        if (number == 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        if (number % 180 == 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        try {
            System.out.println("number la: " + number);
            cos = Math.cos(Math.toRadians(number));
            cos = Math.round(cos);
            sin = Math.sin(Math.toRadians(number));
            sin = Math.round(sin);
            System.out.println("sin la: " + sin);
            System.out.println("cos la: " + cos);
            number = cos / sin;
//            number = Math.round(number);      

        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        double number = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        number = Math.abs(number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        double number = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            jLabel1.setText("Not valid");
            arraylist.removeAll(arraylist);
            isOverwrite = true;
            return;
        }
        System.out.println("number la: " + number);

        if (number <= 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            jLabel1.setText("Not valid");
            arraylist.removeAll(arraylist);
            isOverwrite = true;
            return;
        }
        number = Math.log10(number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        double number = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            jLabel1.setText("Not valid");
            arraylist.removeAll(arraylist);
            isOverwrite = true;
            return;
        }
        System.out.println("number la: " + number);

        if (number <= 0) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            jLabel1.setText("Not valid");
            arraylist.removeAll(arraylist);
            isOverwrite = true;
            return;
        }
        number = Math.log(number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int lengthLabel = jLabel1.getText().length();

        clearlabel();

        if (lengthLabel > 0) {
            int lastPosition = arraylist.size() - 1;
            String lastCharacter = arraylist.get(lastPosition);
            System.out.println("test la: " + lastCharacter);

            if (lastCharacter.equals("+") || lastCharacter.equals("-") || lastCharacter.equals("*") || lastCharacter.equals("/")) {
                arraylist.add("" + Math.E);
                System.out.println("ArrayList la: " + arraylist);

                jLabel1.setText(jLabel1.getText() + Math.E);
                jTextField1.setText(jTextField1.getText() + Math.E);
                return;
            }

            arraylist.add("*" + Math.E);
            System.out.println("ArrayList la: " + arraylist);

            jLabel1.setText(jLabel1.getText() + "*" + Math.E);
            jTextField1.setText("" + Math.E);
        } else {
            arraylist.add("" + Math.E);
            System.out.println("ArrayList la: " + arraylist);

            jLabel1.setText(jLabel1.getText() + Math.E);
            jTextField1.setText(jTextField1.getText() + Math.E);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        double number = 0;

        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        clearlabel();

        try {
            number = Double.parseDouble(jTextField1.getText());
        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        number = Math.pow(Math.E, number);

        jLabel1.setText("" + number);
        jTextField1.setText("" + number);

        isOverwrite = true;

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int lengthLabel = jLabel1.getText().length();

        clearlabel();

        if (lengthLabel > 0) {
            int lastPosition = arraylist.size() - 1;
            String lastCharacter = arraylist.get(lastPosition);
            System.out.println("test la: " + lastCharacter);

            if (lastCharacter.equals("+") || lastCharacter.equals("-") || lastCharacter.equals("*") || lastCharacter.equals("/")) {
                arraylist.add("" + Math.PI);
                System.out.println("ArrayList la: " + arraylist);

                jLabel1.setText(jLabel1.getText() + Math.PI);
                jTextField1.setText(jTextField1.getText() + Math.PI);
                return;
            }

            arraylist.add("*" + Math.PI);
            System.out.println("ArrayList la: " + arraylist);

            jLabel1.setText(jLabel1.getText() + "*" + Math.PI);
            jTextField1.setText("" + Math.PI);
        } else {
            arraylist.add("" + Math.PI);
            System.out.println("ArrayList la: " + arraylist);

            jLabel1.setText(jLabel1.getText() + Math.PI);
            jTextField1.setText(jTextField1.getText() + Math.PI);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double number = 0;
        if (isOverwrite == true) {
            System.out.println("ban chua nhap so thu nhat");
            jTextField1.setText("");
            jLabel1.setText("please enter the number");
            return;
        }

        try {
            firstNumber = Double.parseDouble(jTextField1.getText());

        } catch (Exception e) {
            System.out.println("Not valid: ");
            jTextField1.setText("Not valid");
            isOverwrite = true;
            return;
        }

        try {
            jLabel1.setText(jLabel1.getText() + " mod ");
        } catch (Exception e) {
            jLabel1.setText("");
            jTextField1.setText("Not valid");
            return;
        }

        jTextField1.setText("");

        calculation = "mod";

        System.out.println("label la: " + jLabel1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
//        clearlabel();
        arraylist.removeAll(arraylist);
        arraylist.add(jTextField1.getText());
        
        jLabel1.setText(jTextField1.getText());
        jTextField1.setText(jTextField1.getText());
        
        isOverwrite = false;
        
        System.out.println("ArrayList la: " + arraylist);     
    }//GEN-LAST:event_jButton31ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private String[] append(String[] array, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
