import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = getVehicles();

        for (Veiculo v : veiculos) {
            v.move();
        }
    }

    static ArrayList<Veiculo> getVehicles() {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Aviao());
        veiculos.add((new BarcoARemos()));
        veiculos.add(new Bicicleta());
        Carro c = new Carro();
        c.ligar();
        veiculos.add(c);
        veiculos.add(new Mota());


        return veiculos;
    }

}
