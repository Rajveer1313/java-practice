import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class driver extends JFrame
{
    driver()
    {
        //frame 
        setBounds(400, 100, 800, 500);
         setLayout(null);


        //text divernme
        JLabel name = new  JLabel("Driver Name ");
       name.setBounds(50, 10, 200, 200);
       name.setForeground(Color.BLACK);
       name.setFont(new Font("serif ",Font.BOLD,15));
       add(name);

       //namefeild
       JTextField dn = new JTextField();
       dn.setBounds(160, 100, 100, 30);
       add(dn);

       //pick to
        JLabel pick = new JLabel("pick to");
        pick.setBounds(300, 95, 100, 30);  
        pick.setFont(new Font("serif",Font.BOLD,20));
        pick.setForeground(Color.white);
        pick.setBackground(Color.black);
        add(pick) ;



        JLabel name2 = new  JLabel ("Customer Name ");
        name2.setBounds(400, 10, 200, 200);
        name2.setForeground(Color.BLACK);
        name2.setFont(new Font("serif ",Font.BOLD,15));
        add(name2);



        JTextField dn2 = new JTextField();
       dn2.setBounds(540, 100, 100, 30);
       add(dn2);
 


        setVisible(true);

    }






    public static void main(String [] arg)
    {
        new  driver();
    }

    
}
