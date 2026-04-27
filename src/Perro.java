public class Perro extends  Animal implements Asegurable, Vacunable{
    /*¿Qué atributos propios necesita además de los heredados?
        Rta: necesita raza
    */
    protected  String raza;
    private int vacunasAplicadas;
    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double costoConsulta() {
        return 45000 + (edad * 3000);
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000*edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return nombre + "numero de poliza: 325698";
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
