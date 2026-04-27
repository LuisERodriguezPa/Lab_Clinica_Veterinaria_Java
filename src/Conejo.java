public class Conejo extends Animal {
    private double peso;
        public Conejo(String nombre, int edad, String nombreDelDueno, double peso) {
            super(nombre, edad, nombreDelDueno);
            this.peso = peso;
        }
        @Override
        public double costoConsulta() {
            return 35000;
        }
}
