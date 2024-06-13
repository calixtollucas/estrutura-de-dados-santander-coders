package supermarket;

public class SupermarketArray implements Supermarket{

    private final String[] itemsList;
    private int lastIndex;

    public SupermarketArray(final int size) {
        this.itemsList = new String[size];
        this.lastIndex = -1;
    }

    @Override
    public void add(String item) {
        if(lastIndex == itemsList.length -1){
            System.err.println("A Lista está cheia");
        } else {
            System.out.println(lastIndex);
            itemsList[++lastIndex] = item;
            System.out.println(lastIndex);
        }

    }

    @Override
    public void print() {
        if(lastIndex <0){
            System.err.println("A Lista está vazia");
        } else {
            System.out.println("############################################");
            for (int i = 0; i <= lastIndex; i++) {
                System.out.println(i + " - "+ itemsList[i]);
            }
            System.out.println("############################################");
        }

    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Índice Inválido");
        }

    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            itemsList[i] = itemsList[i+1];
        }
    }
}
