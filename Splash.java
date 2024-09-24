package travel.management.system;

import javax.swing.*;  //contains JFrame class
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    //here Runnable is an interface containing run() as an abstract method
    Thread thread;
    
    Splash(){
        //setSize(1200,600);
        //setLocation(200,100);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);//JLabel can't be used directly with Image i2 or i1
        add(image);
        
         setVisible(true);  //by default image is not visible therefor by giving true frame can be seen by user
         thread=new Thread(this);
         thread.start();
    }
    
    public void run(){
        try{
            Thread.sleep(7000);//for closing the frame after 7secs
            setVisible(false);
        }catch(Exception e){}
        
    }
    public static void main(String args[]) {
       Splash frame=new Splash();
       int x=1;
       //for providing moving location to the from
       for(int i=0;i<=500;x+=7, i+=6)
       {
           frame.setLocation(750-(x+i)/2, 400-(i/2));
           frame.setSize(x+i,i);
           try{
               Thread.sleep(10);//giving pause of 10msecs in opening th frame
           }catch(Exception e){}
       }
    }
}