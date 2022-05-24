package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    Model movieModel;
    MovieView movieView;
     
    public String datapicked;
     
    public Controller(Model movieModel, MovieView movieView) {
        this.movieModel = movieModel;
        this.movieView = movieView;
    
        
        if (movieModel.getBanyakData()!=0) {
            String dataMovie[][] = movieModel.MovieList();
            movieView.tabel.setModel((new JTable(dataMovie, movieView.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        movieView.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String judul = movieView.getJudul();
                String alur = movieView.getAlur();
                String penokohan = movieView.getPenokohan();
                String akting = movieView.getAkting();
                movieModel.insertmovie(judul, alur, penokohan, akting);
         
                String dataMovie[][] = movieModel.MovieList();
                movieView.tabel.setModel((new JTable(dataMovie, movieView.namaKolom)).getModel());
            }
        }
        );
    
        movieView.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String judul = movieView.getJudul();
                String alur = movieView.getAlur();
                String penokohan = movieView.getPenokohan();
                String akting = movieView.getAkting();
                movieModel.updateMovie(judul, alur, penokohan, akting);
                
                String dataMovie[][] = movieModel.MovieList();
            movieView.tabel.setModel((new JTable(dataMovie, movieView.namaKolom)).getModel());
            }
        }
        );
    
    
        movieView.tabel.addMouseListener(new MouseAdapter(){    
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = movieView.tabel.getSelectedRow();
                datapicked = movieView.tabel.getValueAt(baris, 0).toString();
                System.out.println(datapicked);
            }
        }
        );
    
        movieView.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin menghapus Film " + datapicked + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0){
                    movieModel.deleteMovie(datapicked);
                    String dataMovie[][] = movieModel.MovieList();
                    movieView.tabel.setModel((new JTable(dataMovie, movieView.namaKolom)).getModel());
                }else{
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        }
        );
}
}
