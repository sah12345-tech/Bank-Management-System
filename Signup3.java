package asimulatorsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JRadioButton r1,r2,r3,r4;
JTextField t1;
JButton b1,b2;
JCheckBox c1,c2,c3,c4,c5,c6,c7;
String formno;
Signup3(String formno){
this.formno = formno;
setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
// ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Ankiee TheHancy\\Desktop\\logo.jpg"));
///Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//ImageIcon i3 = new ImageIcon(i2);
//JLabel l14 = new JLabel(i3);
//l14.setBounds(150, 0, 100, 100);
//add(l14);
l1 = new JLabel("Page 3: Account Details");
l1.setFont(new Font("Raleway", Font.BOLD, 22));
l2 = new JLabel("Account Type:");
l2.setFont(new Font("Raleway", Font.BOLD, 15));
l3 = new JLabel("Card Number:");
l3.setFont(new Font("Raleway", Font.BOLD, 15));
l4 = new JLabel("XXXX-XXXX-XXXX-4184");
l4.setFont(new Font("Raleway", Font.BOLD, 15));
l5 = new JLabel("(Your 16-digit Card number)");
l5.setFont(new Font("Raleway", Font.BOLD, 10));
l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
l6.setFont(new Font("Raleway", Font.BOLD, 10));
l7 = new JLabel("PIN:");
l7.setFont(new Font("Raleway", Font.BOLD, 15));
l8 = new JLabel("XXXX");
l8.setFont(new Font("Raleway", Font.BOLD, 15));
l9 = new JLabel("(4-digit password)");
l9.setFont(new Font("Raleway", Font.BOLD, 10));
l10 = new JLabel("Services Required:");
l10.setFont(new Font("Raleway", Font.BOLD, 15));
l11 = new JLabel("Form No:");
l11.setFont(new Font("Raleway", Font.BOLD, 11));
l12 = new JLabel(formno);
l12.setFont(new Font("Raleway", Font.BOLD, 11));
b1 = new JButton("Submit");
b1.setFont(new Font("Raleway", Font.BOLD, 10));
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b2 = new JButton("Cancel");
b2.setFont(new Font("Raleway", Font.BOLD, 10));
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);
c1 = new JCheckBox("ATM CARD");
c1.setBackground(Color.WHITE);
c1.setFont(new Font("Raleway", Font.BOLD, 12));
c2 = new JCheckBox("Internet Banking");
c2.setBackground(Color.WHITE);
c2.setFont(new Font("Raleway", Font.BOLD, 12));
c3 = new JCheckBox("Mobile Banking");
c3.setBackground(Color.WHITE);
c3.setFont(new Font("Raleway", Font.BOLD, 12));
c4 = new JCheckBox("EMAIL Alerts");
c4.setBackground(Color.WHITE);
c4.setFont(new Font("Raleway", Font.BOLD, 12));
c5 = new JCheckBox("Cheque Book");
c5.setBackground(Color.WHITE);
c5.setFont(new Font("Raleway", Font.BOLD, 12));
c6 = new JCheckBox("E-Statement");
c6.setBackground(Color.WHITE);
c6.setFont(new Font("Raleway", Font.BOLD, 12));
c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
c7.setBackground(Color.WHITE);
c7.setFont(new Font("Raleway", Font.BOLD, 10));
r1 = new JRadioButton("Saving Account");
r1.setFont(new Font("Raleway", Font.BOLD, 15));
r1.setBackground(Color.WHITE);
r2 = new JRadioButton("Fixed Deposit Account");
r2.setFont(new Font("Raleway", Font.BOLD, 15));
r2.setBackground(Color.WHITE);
r3 = new JRadioButton("Current Account");
r3.setFont(new Font("Raleway", Font.BOLD, 15));
r3.setBackground(Color.WHITE);
r4 = new JRadioButton("Recurring Deposit Account");
r4.setFont(new Font("Raleway", Font.BOLD, 15));
r4.setBackground(Color.WHITE);
t1 = new JTextField();
t1.setFont(new Font("Raleway", Font.BOLD, 10));
setLayout(null);
l11.setBounds(700,10,70,30);
add(l11);
t1.setBounds(770,10,40,30);
add(t1);
l1.setBounds(280,50,400,40);
add(l1);
l2.setBounds(100,140,200,30);
add(l2);
r1.setBounds(100,180,150,30);
add(r1);
r2.setBounds(350,180,300,30);
add(r2);
r3.setBounds(100,220,250,30);
add(r3);
r4.setBounds(350,220,250,30);
add(r4);
l3.setBounds(100,300,200,30);
add(l3);
l4.setBounds(330,300,250,30);
add(l4);
l5.setBounds(100,330,200,20);
add(l5);
l6.setBounds(330,330,500,20);
add(l6);
l7.setBounds(100,370,200,30);
add(l7);
l8.setBounds(330,370,200,30);
add(l8);
l9.setBounds(100,400,200,20);
add(l9);
l10.setBounds(100,450,200,30);
add(l10);
c1.setBounds(100,500,200,30);
add(c1);
c2.setBounds(350,500,200,30);
add(c2);
c3.setBounds(100,550,200,30);
add(c3);
c4.setBounds(350,550,200,30);
add(c4);
c5.setBounds(100,600,200,30);
add(c5);
c6.setBounds(350,600,200,30);
add(c6);
c7.setBounds(100,635,600,20);
add(c7);
b1.setBounds(100,675,100,30);
add(b1);
b2.setBounds(350,675,100,30);
add(b2);
getContentPane().setBackground(Color.WHITE);
setSize(850,850);
setLocation(500,120);
setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
String a = null;
if(r1.isSelected()){
a = "Saving Account";
}
else if(r2.isSelected()){
a = "Fixed Deposit Account";
}
else if(r3.isSelected()){
a = "Current Account";
}else if(r4.isSelected()){
a = "Recurring Deposit Account";
}
Random ran = new Random();
long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
long first8 = Math.abs(first7);
long first3 = (ran.nextLong() % 9000L) + 1000L;
long first4 = Math.abs(first3);
String b = "";
if(c1.isSelected()){
b = b + " ATM Card";
}
if(c2.isSelected()){
b = b + " Internet Banking";
}
if(c3.isSelected()){
b = b + " Mobile Banking";
}
if(c4.isSelected()){
b = b + " EMAIL Alerts";
}
if(c5.isSelected()){
b = b + " Cheque Book";
}
if(c6.isSelected()){
b = b + " E-Statement";
}
String c = t1.getText();
try{
if(ae.getSource()==b1){
if(b.equals("")){
JOptionPane.showMessageDialog(null, "Fill all the required fields");
}else{
conn c1 = new conn();
String q1 = "insert into signup3 values('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";
String q2 = "insert into login values('"+first8+"','"+first4+"')";
c1.s.executeUpdate(q1);
c1.s.executeUpdate(q2);
JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);
new Deposit().setVisible(true);
setVisible(false);
}
}else if(ae.getSource()==b2){
System.exit(0);
}
}catch(Exception ex){
ex.printStackTrace();
}
}
public static void main(String[] args){
new Signup3("").setVisible(true);
}
}