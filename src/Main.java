public class Main {
    public static void main(String[] args) {

        Builder currentBilder = new Builder();
        currentBilder.print();
        currentBilder =  new CreateBuilder()
                .setCount(5)
               // .setName("Молоко")
                //.setPrise(2.34)
                .setDescription(new StringBuilder("Свежее"))
                .Create();
        currentBilder.print();
    }
}