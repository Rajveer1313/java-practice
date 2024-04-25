import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class hotelmana extends JFrame
{
    hotelmana()
    {
        setSize(1000,750);
        setLocation(250,30);
        setLayout(null);
     

        //image add
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg")) ;
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1000,750);       
         add(image);  

       //add text
        JLabel text =new JLabel("Hotel Management System");
        text.setBounds(160,30, 1000,80);
        text.setFont(new Font("serif",Font.PLAIN,60));
        text.setForeground(Color .BLACK);
        image.add(text);

        //button 
        JButton next=new JButton("next");
       next.setBounds(450, 500, 90 , 50);
          next.setForeground(Color .black);
          next.setFont(new Font ("serif",Font.PLAIN,25));
        image.add(next);
        
        

        setVisible(true);


    }
    






    public static void main (String []arg )throws Exception
    {
        new hotelmana();

    }

    
}