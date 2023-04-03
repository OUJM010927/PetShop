    public class Animal {
        private String nombre;
        private int edad;
        private String tipo;

        public Animal(String nombre, int edad, String tipo) {
            this.nombre = nombre;
            this.edad = edad;
            this.tipo = tipo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

