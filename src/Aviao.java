public class Aviao extends VeiculoComMotor {


    public Aviao() {
    }

    @Override
    boolean move() {
        if (this.ligado) {
            System.out.println("A mover a aviao");
            return true;
        } else {
            System.out.println("Não posso mover um avião desligado");
            return false;
        }
    }
}
