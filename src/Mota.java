public class Mota extends VeiculoComMotor {




    @Override
    boolean move() {
        if (ligado) {
            System.out.println("A mover a mota");
            return true;
        } else {
            System.out.println("Não posso mover uma mota desligada");
            return false;
        }
    }
}
