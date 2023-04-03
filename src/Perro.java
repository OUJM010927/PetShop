    public class Perro extends Animal {
        private String raza;

        public Perro(String nombre, int edad, String raza) {
            super(nombre, edad, "Perro");
            this.raza = raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getRaza() {
            return raza;
        }

        public void ladrar() {
            System.out.println("El perro " + getNombre() + " está ladrando.");
        }
}
