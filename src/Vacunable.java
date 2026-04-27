public interface Vacunable {
    /*¿Por qué esta capacidad va en una interfaz y no como método abstracto en
    Animal?
    Rta: porque en una interfaz es voluntario si yo quiero implementar la interfaz o no
    pero si lo defino en un metodo abstracto en Animal todos los animales que hereden de Animal estarian obligados
    a implementar el metodo vaunar.
    */
     void registrarVacuna(String nombre);
     int getVacunasAplicadas();

}
