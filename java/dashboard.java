import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class dashboard extends JFrame
{

    dashboard()
    {
         setBounds(15,0,1500,800);
          setLayout(null);


                     //image
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg")) ;
         Image i2=i1.getImage().getScaledInstance( 1500, 1000,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0, 0, 1500, 800);
         add(image);

                     //text
         JLabel text= new JLabel("welcome to Hotel ");
         text.setBounds(450, 50, 1000, 300);
         text.setFont(new Font("serif",Font.PLAIN,100));
         text.setForeground(Color.BLACK);
         image.add(text);

                    //menu
         JMenuBar mb =new JMenuBar();
         mb.setBounds(0, 0, 1500, 40);
         image.add(mb);
         

                 //hotel mangement
         JMenu hm = new JMenu("Hotel Manangemrnt")   ;
         hm.setForeground(Color.red);
         mb. add(hm);


         JMenu admin = new JMenu("Admin")   ;
         admin.setForeground(Color.blue);
         mb. add(admin);


         JMenuItem add= new JMenuItem("ADD EMPLOYE");
         admin.add(add);

         JMenuItem  reception = new JMenuItem("Reception");
         hm.add(reception);
           
          
         JMenuItem addroom= new JMenuItem("ADD Room");
         admin.add(addroom);

         JMenuItem adddriver= new JMenuItem("ADD Driver");
         admin.add(adddriver);
             
         
         setVisible(true);






    }

    
    public static void main(String arg[])
    {
        new dashboard ();

        

    }
    
}

