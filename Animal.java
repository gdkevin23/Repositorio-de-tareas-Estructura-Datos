public class Animal {

    private int age; //edad
    private int size; //tamaño
    private int weight; //peso
    private String color; //Color del animal


    public Animal(int age, int size, int weight, String color) {  //Método constructor
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.color = color;

    }

        public int getage(){
            return age;
        }

        public int getsize(){
            return size;
        }

        public void theweight(){
            weight= 50;
        }

        public String getweight(){

        return "the weight is: " + weight;
        }

        public void thecolor (){
            color="verde";
        }
    }


