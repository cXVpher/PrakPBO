package tugas3;

import java.awt.event.*;
import hitung.Balok;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
    JLabel lJudul = new JLabel("Cuboid Calculator");
    
    JLabel lpanjang = new JLabel("Length");
    final JTextField fpanjang = new JTextField(10);
    
    JLabel llebar = new JLabel("Width");
    final JTextField flebar = new JTextField(10);
    
    JLabel ltinggi = new JLabel("Height");
    final JTextField ftinggi = new JTextField(10);
    
    JLabel lhasil = new JLabel("Result : ");
    
    JLabel lkel = new JLabel();
    JLabel lluas = new JLabel();
    JLabel lluper = new JLabel();
    JLabel lvol = new JLabel();
    
    JButton count = new JButton("Count");
    JButton reset = new JButton("Reset");
    
    public GUI(){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400,500);
            
            setLayout(null);
            
            add(lJudul);
            add(lpanjang);
            add(fpanjang);
            add(llebar);
            add(flebar);
            add(ltinggi);
            add(ftinggi);
            
            add(lhasil);
            
            add(lluas);
            add(lkel);
            add(lluper);
            add(lvol);
            
            add(count);
            add(reset);
            
            lJudul.setBounds(145, 30, 120, 20);
            lpanjang.setBounds(70, 70, 120, 20);
            fpanjang.setBounds(140,70,165,20);
            llebar.setBounds(70, 120, 120, 20);
            flebar.setBounds(140,120,165,20);
            ltinggi.setBounds(70,170,120,20);
            ftinggi.setBounds(140,170,165,20);
            
            lhasil.setBounds(175,210,120,20);
            
            count.setBounds(110,410,80,20);
            reset.setBounds(200,410,80,20);
            
            count.addActionListener(this);
            reset.addActionListener(this);
            
            setVisible(true);
            setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == count){
            try{
                double pnjg = Double.parseDouble(fpanjang.getText());
                double lbr = Double.parseDouble(flebar.getText());
                double tngg = Double.parseDouble(ftinggi.getText());
                
                Balok balok = new Balok(pnjg, lbr, tngg);
                
                lluas.setText("Square Area                   : " + Double.toString(balok.getLuas()));
                lluas.setBounds(70,250,180,20);
                
                lkel.setText("Square Circumference  : " + Double.toString(balok.getKeliling()));
                lkel.setBounds(70,280,180,20);
                
                lvol.setText("Cuboid Volume              : " + Double.toString(balok.getVolume()));
                lvol.setBounds(70,310,180,20);
                
                lluper.setText("Cuboid Surface Area     : " + Double.toString(balok.getLuasPermukaan()));
                lluper.setBounds(70,340,180,20); 
            } catch(NumberFormatException d){
                JOptionPane.showMessageDialog(null, d.getMessage());
            }
        }
        
        if(e.getSource() == reset) { //ketika reset di klik
            fpanjang.setText(null);
            flebar.setText(null);
            ftinggi.setText(null);
            lluas.setText(null);
            lkel.setText(null);
            lvol.setText(null);
            lluper.setText(null);
        }
    }
    
}
