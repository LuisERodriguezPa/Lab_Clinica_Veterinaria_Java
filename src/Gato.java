public class Gato extends Animal implements Asegurable, Vacunable{
    /*¿Qué atributos propios necesita además de los heredados?
        Rta: necesita esEsterilizado
   */
    protected boolean esEsterilizado;
    private int vacunasAplicadas;
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double costoConsulta() {
        return 38000;
    }
    @Override
    public double calcularPrimaSeguro() {
        if(esEsterilizado){
            return 120000;
        }
        else{
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return nombre + " numero de poliza: 325698";
    }
    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas ++;
        System.out.println("Se le aplico la vacuno a "+nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }
}
