public class Flower {
    String name;
    int numpetal;
    float price;

    public Flower(String name, int numpetal, float price) {
        this.name = name;
        this.numpetal = numpetal;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnumPetal() {
        return numpetal;
    }

    public void setPetal(int petal) {
        this.numpetal = petal;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", petal=" + numpetal +
                ", price=" + price +
                '}';
    }

}

