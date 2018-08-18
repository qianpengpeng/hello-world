import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

class Window extends JDialog{
   public Window(){
      this.setTitle("第二个窗体");
      this.setBounds(583,284,200,200);
      Container container = this.getContentPane();
      JLabel jl = new JLabel("This is the Second Window!");
      jl.setHorizontalAlignment(SwingConstants.CENTER);
      container.add(jl);
      container.setBackground(Color.white);
      jl.setSize(100,100);
   }
}

public class Firstwindow extends JFrame{
   public Firstwindow(){
      this.setVisible(true);
      this.setBounds(483,184,400,400);
      this.setTitle("Login");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container container = this.getContentPane();
      container.setLayout(null);
      container.setBackground(Color.white);
      JButton button = new JButton("login");
      button.setBounds(150,300,100,25);
      button.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            new Window().setVisible(true);
         }
      });
      container.add(button);
      JLabel j1 = new JLabel("账户:");
      JLabel j2 = new JLabel("密码:");
      JTextField t1 = new JTextField();
      JTextField t2 = new JTextField();
      j1.setBounds(0,100,40,25);
      j2.setBounds(0,150,40,25);
      t1.setBounds(200,100,150,25);
      t2.setBounds(200,150,150,25);
      container.add(j1);
      container.add(j2);
      container.add(t1);
      container.add(t2);
   }
   public static void main(String args[]){
      new Firstwindow();
   }
}