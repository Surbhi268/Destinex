package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{

    JButton login,signup,password;
    JTextField tfusername,tfpassword;
    
    Login(){
         setSize(850,380);
         setLocation(350,200);
        setLayout(null);//for customizing your own Layout firstly you need to null your existing layout
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();//used for creating panel on frame
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);//JLabel can't be used directly with Image i2 or i1
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        //JLabel is mainly used for writing text above any panel or frame
        JLabel lbusername=new JLabel("Username");
        lbusername.setBounds(60,20,100,25);
        lbusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lbusername);
        
        //JTextField is used here for creating small boxes
        tfusername=new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lbpassword=new JLabel("Password");
        lbpassword.setBounds(60,110,100,25);
        lbpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lbpassword);
        
        tfpassword=new JTextField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        //JButton is used for creating buttons
        login=new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        p2.add(login);
        
        signup=new JButton("Signup");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        p2.add(signup);
        
        password =new JButton("Password");
        password.setBounds(130,250,130,30);
        password.setBackground(new Color(133,193,233));
        login.setBorder(new LineBorder(new Color(133,193,233)));
        password.setForeground(Color.WHITE);
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text=new JLabel("Trouble in login....");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.RED);
        p2.add(text);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
           
            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();
                
                String query="select * from account where username='"+username+"' AND password= '"+pass+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    public static void main(String args[]) {
          new Login();
    }
}