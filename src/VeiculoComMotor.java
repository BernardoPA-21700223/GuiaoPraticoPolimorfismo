public abstract class VeiculoComMotor extends Veiculo {
    boolean ligado;


    public VeiculoComMotor() {
    }

    public VeiculoComMotor(boolean ligado) {
        this.ligado = ligado;
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

   // @Override
   // abstract boolean move();


}
