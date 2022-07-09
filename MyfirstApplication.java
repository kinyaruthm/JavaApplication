
package myfirstapplication;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField username;
    private JLabel idnumber;
    private JTextField idno;
    private JLabel mobile;
    private JTextField phone;
    private JLabel Gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gender;
    private JTextArea out;
    private JButton submit;
    
    public MyFrame()
    {
        setTitle("REGISTRATION FORM");
        setBounds(300,90,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c=getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);
        
        title= new JLabel("Registration Form");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(200,30);
        c.add(title);
        
        name=new JLabel("Name");
        name.setSize(200,30);
        name.setLocation(100,70);
        c.add(name);
        
        username= new JTextField(" ");
        username.setSize(190,30);
        username.setFont(new Font("Arial",Font.PLAIN,25));
        username.setLocation(190,70);
        
        c.add(username);
        
        idnumber=new JLabel("IDNO");
        idnumber.setSize(200,30);
        idnumber.setLocation(100,100);
        c.add(idnumber);
        
        idno=new JTextField("");
        idno.setSize(190,30);
        idno.setLocation(190,105);
        idno.setFont(new Font("Arial", Font.PLAIN,25));
        c.add(idno);
        
        mobile=new JLabel("Mobile");
        mobile.setSize(200,30);
        mobile.setLocation(100,140);
        c.add(mobile);
        
        phone=new JTextField("+254");
        phone.setFont(new Font("Arial", Font.PLAIN,25));
        phone.setSize(190,30);
        phone.setLocation(190,140);
        c.add(phone);
        
        Gender=new JLabel("Gender");
        Gender.setSize(200,30);
        Gender.setLocation(100,170);
        c.add(Gender);
        
        male=new JRadioButton("male");
        male.setSize(80,25);
        male.setLocation(190,170);
        male.setSelected(true);
        c.add(male);
      
        female=new JRadioButton("female");
        female.setSize(80,25);
        female.setLocation(190,190);
        female.setSelected(false);
        c.add(female);
        
        gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
        
        out=new JTextArea();
        out.setSize(250,350);
        out.setLocation(400,90);
        out.setBackground(Color.cyan);
        c.add(out);
        
        submit=new JButton("SUBMIT");
        submit.setLocation(200,250);
        submit.setSize(100,25);
        submit.addActionListener(this);
        c.add(submit);
        
        setVisible(true);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    if(e.getSource() == submit)
    {
            String data1; 
            String data
             = "Name : "
                      + username.getText() + "\n"
                      + "IDNO : "
                      + idno.getText() + "\n"
                      +"mobile: "
                      + phone.getText() +"\n";
            
            if(male.isSelected())
                data1 ="Gender: male" + "\n";
              else
                data1="Gender: female" + "\n";
            
            String data2;
            
            
            out.setText(data + data1);
               out.setEditable(false);
             System.out.println("successfully submitted");
        }
    else
        {
       out.setText("");
            System.out.println("failed");
                
      
                }          
    }
    }

    

public class MyfirstApplication {

 
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame F=new MyFrame();
    }
    
}
