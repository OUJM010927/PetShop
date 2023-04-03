    public class Gato extends Animal {
        private String pelaje;

        public Gato(String nombre, int edad, String pelaje) {
            super(nombre, edad, "Gato");
            this.pelaje = pelaje;
        }

        public void setPelaje(String pelaje) {
            this.pelaje = pelaje;
        }

        public String getPelaje() {
            return pelaje;
        }

        public void maullar() {
            System.out.println("El gato " + getNombre() + " está maullando.");
        }
    }

