public class Carro extends VeiculoComMotor {


    public Carro() {
    }

    @Override
    boolean move() {
        if (ligado) {
            System.out.println("A mover a carro");
            return true;
        } else {
            System.out.println("Não posso mover um carro desligado");
            return false;
        }
    }
}
