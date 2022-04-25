package tugas4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame{
    JLabel luname = new JLabel("Username: "); 
    JTextField funame = new JTextField (15);
    JLabel lpass = new JLabel("Password: ");
    JPasswordField fpass = new JPasswordField(15);
    JButton blogin = new JButton("Login");
    JButton bcancel = new JButton("Cancel");
    JLabel lreguname = new JLabel ("Username: ");
    JTextField freguname = new JTextField (15);
    JLabel lregpass = new JLabel("Password: ");
    JPasswordField fregpass = new JPasswordField(15);
    JButton bregister = new JButton("Register");
    
    public GUI() {
       setTitle("Login");
       setSize(450, 150);
       
       setLayout(null);
       
       add(luname);
       add(funame);
       add(lpass);
       add(fpass);
       add(blogin);

       add(freguname);
       add(lreguname);
       add(lregpass);
       add(fregpass);
       add(bregister);
       
       luname.setBounds(10, 10, 80, 20);
       funame.setBounds(90, 10, 90, 20);
       lpass.setBounds(10, 40, 80, 20);
       fpass.setBounds(90, 40, 90, 20);
       blogin.setBounds(50, 70, 80, 20);
       lreguname.setBounds(230, 10, 80, 20);
       freguname.setBounds(310, 10, 90, 20);
       lregpass.setBounds(230, 40, 80, 20);
       fregpass.setBounds(310, 40, 90, 20);
       bregister.setBounds(270, 70, 100, 20);
       
       blogin.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent arg0) {
               Connector con = new Connector();
               String uname = funame.getText();
               System.out.println(uname);
               if(con.chekUsername(uname) && uname != "" && con.chekLogin(uname ,String.valueOf(fpass.getPassword()))){
                   JOptionPane.showMessageDialog(null, "Login Success");
               }else if(uname.isEmpty() || String.valueOf(fpass.getPassword()).isEmpty()){
                   JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
               }
               else if(!con.chekUsername(uname)){
                   JOptionPane.showMessageDialog(null, "Username Salah");
               }
               else{
                   JOptionPane.showMessageDialog(null, "Password Salah");
               }
           }
       });
       
       bregister.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent arg0) {
               Connector con = new Connector();
               String reguname = freguname.getText();
               String regpass = String.valueOf(fregpass.getPassword());
               if(!reguname.isEmpty() && !regpass.isEmpty()){
                   con.insertData(reguname, regpass);
               }
               else if(reguname.isEmpty() || regpass.isEmpty()){
                   JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
               }
           }
           
       });
       
       setVisible(true);
    }
}
