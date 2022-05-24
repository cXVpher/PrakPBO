package Main;

public class main {

    public static void main(String[] args) {
        MovieView tampilan = new MovieView();
        Model connect = new Model();
        Controller cm = new Controller(connect, tampilan);
    }
    
}
