import model.Datasource;

public class Main {
    public static void main(String[] args) {
        Datasource ds = new Datasource();

        if (!ds.open()){
            System.out.println("could not connect to data source");
        } else {
            System.out.println("connected to data source");
        }
        ds.close();
    }
}
