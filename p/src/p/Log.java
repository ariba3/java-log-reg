package p;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Log {
    
    Log(){
    
        JFrame f = new JFrame();
        
        JButton b1 = new JButton("Register");
        b1.setBounds(75,200,100,50);
        
        JButton b2 = new JButton("Login");
        b2.setBounds(200,200,100,50);
    
        
        JLabel l1,l2,l3,l4;
        JTextField t1,t2,t3,t4;
 
        l1 = new JLabel("Username:");
        l1.setBounds(70,52,100,15);
    
        l2 = new JLabel("Password:");
        l2.setBounds(70,123,100,15);
       
        t1 = new JTextField();
        t1.setBounds(180,46,150,30);
        t2 = new JTextField();
        t2.setBounds(180,116,150,30);
 
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
 
        f.setSize(400,350);
        f.setLayout(null);
        f.setTitle("Login");
        f.setVisible(true);
        
        
        b1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                
                f.dispose();
                new Reg();
               
                }    
            }
        );
        
        }    
    }
    

