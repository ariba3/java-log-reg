package p;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;
import javax.swing.*;

public class Reg {
    
    Reg(){
    
    
        JFrame Frame = new JFrame();
 
        JButton b1 = new JButton("Login");
        b1.setBounds(100,380,100,50);
        
        JButton b2 = new JButton("Register");
        b2.setBounds(250,380,100,50);
       
        JLabel l1,l2,l3,l4,l5,l6;
        JTextField ntxt, etxt,ptxt,ctxt,mtxt,atxt;
 
        l1 = new JLabel("Username:");
        l1.setBounds(85,47,150,30);
      
        l2 = new JLabel("Email:");
        l2.setBounds(85,97,150,30);
      
        l3 = new JLabel("Password:");
        l3.setBounds(85,147,150,30);
       
        l4 = new JLabel("Confirm Password:");
        l4.setBounds(85,197,155,30);
        
        l5 = new JLabel("Phone Number:");
        l5.setBounds(85,247,150,30);
        
        l6 = new JLabel("Address:");
        l6.setBounds(85,297,150,30);
        
 
        ntxt = new JTextField();
        ntxt.setBounds(255,45,150,30);
        etxt = new JTextField();
        etxt.setBounds(255,95,150,30);
        ptxt = new JTextField();
        ptxt.setBounds(255,145,150,30);
        ctxt = new JTextField();
        ctxt.setBounds(255,195,150,30);
        mtxt = new JTextField();
        mtxt.setBounds(255,245,150,30);
        atxt = new JTextField();
        atxt.setBounds(255,295,150,30);
 
        Frame.add(l1); Frame.add(l3); Frame.add(l4); Frame.add(l2); Frame.add(l5); Frame.add(l6);
        Frame.add(ntxt);  Frame.add(etxt);Frame.add(ptxt); Frame.add(ctxt); Frame.add(mtxt); Frame.add(atxt);
        Frame.add(b1); Frame.add(b2);
 
        Frame.setSize(500,500);
        Frame.setLayout(null);
        Frame.setTitle("Registration");
        Frame.setVisible(true);
        
        
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String username = ntxt.getText();
                String email = etxt.getText();
                String pass = ptxt.getText();
                String conpass = ctxt.getText();
                String mobile = mtxt.getText();
                String add = atxt.getText();
                
                String nregex = "^[a-zA-Z .]+$";
                String eregex = "^[a-z0-9]+@[a-z]+.[a-z]+$";
                String pregex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{6,20}";
                String mregex = "(\\+88)?-?01[3-9]\\d{8}";
                
                if(!Pattern.matches(nregex,username)){
                    JOptionPane.showMessageDialog(null, "Only Characters are allowed!");
                }
                else if(!Pattern.matches(eregex,email)){
                    JOptionPane.showMessageDialog(null, "Invalid Email!");
                }
                else if(!Pattern.matches(pregex,pass)){
                    JOptionPane.showMessageDialog(null, "Use atleast 1 Uppercase, Lowercase, Digit and Special Character");
                }
                else if(!conpass.equals(pass)){
                    
                    JOptionPane.showMessageDialog(null, "Password and Confirm Password don't match!");
                }
                else if(!Pattern.matches(mregex,mobile)){
                    
                    JOptionPane.showMessageDialog(null, "Invalid Phone Number!");
                }
               else if(add.equals("")){
                    JOptionPane.showMessageDialog(null, "Invalid Address!");
                }
                else{
                  String query = "INSERT INTO TableName (Name,Email,Password,PhoneNumber,Address)"
                  		+ " VALUES('"+username+"','"+email+"','"+pass+"','"+mobile+"','"+add+"')";
               DBCon DBCON = new DBCon();      
                DBCON.insert(query);
                }}   } );
  
        b1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
                Frame.dispose();
                new Log();
               
                }    
            }
        );
        
        }    
    
    
    
    }
    
