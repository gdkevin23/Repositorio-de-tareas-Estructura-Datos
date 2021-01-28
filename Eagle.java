
public class Eagle extends Animal {
        private int wings; //lago de las alas
        private int claws; //Tamaño de las garras
        private float flightVelocity; //Velocidad del vuelo en km/h


        public Eagle(int wings, int claws, float flight) {
            super(4,23,45,"white and brown");
            this.wings = wings;
            this.claws = claws;
            this.flightVelocity = flight;
        }
}
