public class Fruit {//
    private FruitType fruitType; // meyve çeşini enumdan gelecek
    private int fruitQuantity; // meyve miktarı




    public Fruit(FruitType fruitName, int fruitQuantity) {
        this.fruitType = fruitName;
        this.fruitQuantity = fruitQuantity;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {


        this.fruitType = fruitType;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    public void setFruitQuantity(int fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    @Override //  müşteriye gösterebilmek için to strinig ezdik
    public String toString() {
        return "Fruit: " + this.fruitType + ", Amount: " + this.fruitQuantity;
    }

}

