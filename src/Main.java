public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Perro("Firulais",3, "Juan Perez", "Labrador");
        animal1.mostrarFicha();
        System.out.println("==============================");
        Animal animal2 = new Gato("michi",2, "Luis ",true);
        animal2.mostrarFicha();
        System.out.println("=================================");
        Animal animal3 = new Ave("paco",1, "Julian", 300);
        animal3.mostrarFicha();

        Perro perro =( Perro) animal1;
        perro.registrarVacuna("Firulais");
        perro.registrarVacuna("Firulais");
        System.out.println("Numero de Vacunas Aplicadas a: "+perro.nombre+" "+perro.getVacunasAplicadas());

        Gato gato =(Gato) animal2;
        gato.registrarVacuna("Michi");
        gato.registrarVacuna("Michi");
        System.out.println("Numero de Vacunas Aplicadas a: "+gato.nombre+" "+gato.getVacunasAplicadas());
        System.out.println("=============================================");
        Clinica clinica1 = new Clinica("salvacion de mascotas","Kra 24#32-65");
        System.out.println(clinica1.obtenerNumeroPoliza());
        System.out.println("Valor de la prima Anual: "+clinica1.calcularPrimaSeguro());
        System.out.println("*******************");
        System.out.println(perro.obtenerNumeroPoliza());
        System.out.println("Valor de la prima Anual: "+perro.calcularPrimaSeguro());
        System.out.println("***************************");
        System.out.println(gato.obtenerNumeroPoliza());
        System.out.println("Valor de la prima Anual: "+gato.calcularPrimaSeguro());

        Conejo conejo = new Conejo("boss bunny",4,"Warner Bro",1000);
        /*¿Cuántas líneas tuviste que cambiar fuera de la nueva clase?*/

    }
}
