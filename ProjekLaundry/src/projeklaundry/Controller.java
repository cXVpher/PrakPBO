package projeklaundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    Model model;
    Viewutama viewData;
    private String data;
    public Controller(Model model, Viewutama viewData){
        this.model = model;
        this.viewData = viewData;
        
        if (model.getBanyakData()!=0) {
            String dataCust[][] = model.DataCustomer();
            viewData.tabelriwayat.setModel((new JTable(dataCust, viewData.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
         viewData.tomboladd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cust = viewData.getCust();
                String barang = viewData.getBarang();
                double berat = viewData.getBerat();
                double harga = viewData.getHarga();
                model.insertData(cust, barang, berat, harga);
         
                String dataCust[][] = model.DataCustomer();
                viewData.tabelriwayat.setModel((new JTable(dataCust, viewData.namaKolom)).getModel());
            }
        });
         
          viewData.tomboledit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String cust = viewData.getCust();
                String barang = viewData.getBarang();
                double berat = viewData.getBerat();
                double harga = viewData.getHarga();
                model.updateData(cust,barang, berat, harga);

                String dataCust[][] = model.DataCustomer();
                viewData.tabelriwayat.setModel((new JTable(dataCust, viewData.namaKolom)).getModel());
            }
        });
         
          viewData.tombolreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                viewData.tbarang.setText("");
                viewData.tberat.setText("");
                viewData.tharga.setText("");
                viewData.tnamacustomer.setText("");
            }
        });
        
    
          viewData.tabelriwayat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                int baris = viewData.tabelriwayat.getSelectedRow();
                int kolom  = viewData.tabelriwayat.getSelectedColumn();
                data = viewData.tabelriwayat.getValueAt(baris, 0).toString();
                 
            }
           });
                  
          viewData.tombolbayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               int input = JOptionPane.showConfirmDialog(null,
                "Apa anda ingin membayar atas nama " + viewData.getCust() + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

            if (input == JOptionPane.YES_OPTION) {
                model.bayarData(viewData.getCust());
                String dataCust[][] = model.DataCustomer();
                viewData.tabelriwayat.setModel((new JTable(dataCust, viewData.namaKolom)).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }
                }
        });
          
         viewData.tabelriwayat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                int row = viewData.tabelriwayat.getSelectedRow();
                String nama = viewData.tabelriwayat.getValueAt(row, 0).toString();
                String barang = viewData.tabelriwayat.getValueAt(row, 1).toString();
                String berat = viewData.tabelriwayat.getValueAt(row, 2).toString();
                String harga = viewData.tabelriwayat.getValueAt(row, 3).toString();
                
                viewData.setCust(nama);
                viewData.setBarang(barang);
                viewData.setBerat(berat);
                viewData.setHarga(harga);
            }
             
         });
         
         viewData.bLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Viewdepan viewdepan = new Viewdepan();
                viewData.dispose();
                viewdepan.setVisible(true);
                viewdepan.pack();
                viewdepan.setDefaultCloseOperation(Viewutama.EXIT_ON_CLOSE);
                viewdepan.setLocationRelativeTo(null);
                viewdepan.setTitle("Login Admin");
            }
         });

    }
}