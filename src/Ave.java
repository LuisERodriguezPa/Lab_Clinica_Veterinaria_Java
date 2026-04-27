public class Ave extends Animal {
    /*¿Qué atributos propios necesita además de los heredados?
        Rta: necesita pesoGramos
     */
    protected  double pesoGramos;
    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double costoConsulta() {
        return 28000 + (pesoGramos * 500);
    }

}
