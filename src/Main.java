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


    }
}
