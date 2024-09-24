package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    String username;
     JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails, checkPackage,bookPackage;
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);//JLabel can't be used directly with Image i2 or i1
        image.setBounds(5,0,70,70);
        p1.add(image);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);
        
        checkPackage=new JButton("Check Package");
        checkPackage.setBackground(new Color(0,0,102));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackage.setBounds(0,200,300,50);
        checkPackage.setMargin(new Insets(0,0,0,110));
        checkPackage.addActionListener(this);
        p2.add(checkPackage);
        
        bookPackage=new JButton("Book Package");
        bookPackage.setBackground(new Color(0,0,102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackage.setBounds(0,250,300,50);
        bookPackage.setMargin(new Insets(0,0,0,120));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);
        
        JButton viewPackage=new JButton("ViewPackage");
        viewPackage.setBackground(new Color(0,0,102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackage.setBounds(0,300,300,50);
        viewPackage.setMargin(new Insets(0,0,0,120));
        p2.add(viewPackage);
        
        JButton viewHotels=new JButton("View Hotels");
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewHotels);
        
        JButton bookHotel=new JButton("Book Hotel");
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookHotel.setBounds(0,400,300,50);
        bookHotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookHotel);
        
        JButton viewBookedHotel=new JButton("View Booked Hotel");
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewBookedHotel);
        
        JButton Destinations=new JButton("Destinations");
        Destinations.setBackground(new Color(0,0,102));
        Destinations.setForeground(Color.WHITE);
        Destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        Destinations.setBounds(0,500,300,50);
        Destinations.setMargin(new Insets(0,0,0,125));
        p2.add(Destinations);
        
        JButton Payments=new JButton("Payments");
        Payments.setBackground(new Color(0,0,102));
        Payments.setForeground(Color.WHITE);
        Payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        Payments.setBounds(0,550,300,50);
        Payments.setMargin(new Insets(0,0,0,155));
        p2.add(Payments);
        
        JButton Calculator=new JButton("Calculator");
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        Calculator.setBounds(0,600,300,50);
        Calculator.setMargin(new Insets(0,0,0,145));
        p2.add(Calculator);
        
        JButton Notepad=new JButton("Notepad");
        Notepad.setBackground(new Color(0,0,102));
        Notepad.setForeground(Color.WHITE);
        Notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        Notepad.setBounds(0,650,300,50);
        Notepad.setMargin(new Insets(0,0,0,155));
        p2.add(Notepad);
        
        JButton About=new JButton("About");
        About.setBackground(new Color(0,0,102));
        About.setForeground(Color.WHITE);
        About.setFont(new Font("Tahoma",Font.PLAIN,20));
        About.setBounds(0,700,300,50);
        About.setMargin(new Insets(0,0,0,175));
        p2.add(About);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel icon= new JLabel(i6);
        icon.setBounds(0,0,1650,1000);    
        add(icon);
        
        JLabel text=new JLabel("DestiNex: Tourism Automation");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        icon.add(text);
        
        setVisible(true);
   
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkPackage){
            new CheckPackage(username);
        }else if(ae.getSource()==bookPackage){
            new BookPackage(username);
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
   
} 