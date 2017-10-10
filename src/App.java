import java.awt.FlowLayout;
import javax.swing.*;
public class App extends JApplet
{
    JLabel lbluser,lblpassword,lblname,lblage;
   
    JTextField txtpassword,txtname,txtae,txtuser;
  
    JButton btnlogin,btnreset;
    
    @Override
    public void init()
    {
        setLayout(new FlowLayout());
        lbluser=new JLabel("User ");
        lblpassword=new JLabel("Password");
        lblname=new JLabel("Name");
        lblage=new JLabel("Age");
        
        txtuser=new JTextField(25);
        txtpassword=new JPasswordField(22);
        txtname=new JTextField(26);
        txtae=new JTextField(25);
        
        
        
        btnlogin=new JButton("login");
        btnreset=new JButton("Fuck");
        add(lbluser);
        
        add(txtuser);
         add(lblpassword);
       
        add(txtpassword);
        add(lblname);
        add(txtname);
        add(lblage);
        add(txtae);
        
        add(btnlogin);
        add(btnreset);
    }
}

        
        
    
    
    
    