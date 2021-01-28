public class Elephant extends Animal {

        private int horn; //cuerno en metros
        private int trunk; //trompa en metros


        public Elephant(int horn, int trunk) {
            super(8,45,1200, "gray");
            this.horn = horn;
            this.trunk = trunk;
        }
}
