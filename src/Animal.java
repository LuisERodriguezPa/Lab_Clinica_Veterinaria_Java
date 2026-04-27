public abstract class Animal {
    /* Los atributos no privados porque despues no se pueden heredar
     Tampoco son publicos porque por estandar los atributos no puede ser publicos tienen que estar protegido
     de acceso no autorizado por eso los ponemos protect para que puedan ser accedidos de las clases hijas.*/
    protected String nombre;
    protected  int edad;
    protected  String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }
    public abstract double costoConsulta();
    public void mostrarFicha(){
        System.out.print("Nombre: "+nombre+" Edad:"+edad+" Nombre del dueño: "+nombreDueno+" Costo de consulta: ");
        System.out.print(this.costoConsulta());
        System.out.println();
    }
}
